package xyz.hans.proxy.proxy;

import xyz.hans.proxy.time.TimeImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Hans on 17/1/5.
 * 动态代理
 */
public class ReflectTimeProxy implements InvocationHandler {
    private Object delegate;

    public Object getPoxy() {
        this.delegate = new TimeImpl();
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("getTime")) {
            //调用
            String time = (String) method.invoke(delegate, args);
            Date date = new Date(Long.valueOf(time));
            Calendar calendar = Calendar.getInstance(Locale.CHINA);
            calendar.setTime(date);
            //只有等于2017年才允许获取时间
            if (calendar.get(Calendar.YEAR) == 2017) {
                return time;
            }
        }
        return method.invoke(delegate, args);
    }
}

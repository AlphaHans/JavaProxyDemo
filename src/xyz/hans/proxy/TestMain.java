package xyz.hans.proxy;

import xyz.hans.proxy.proxy.ReflectTimeProxy;
import xyz.hans.proxy.time.TimeInterface;

/**
 * Created by Hans on 17/1/5.
 */
public class TestMain {

    public static void main(String args[]) {
        TimeInterface timeInterface = (TimeInterface) new ReflectTimeProxy().getPoxy();
        String time = timeInterface.getTime();
        System.out.println(time);
        System.out.println(timeInterface.getYear());
    }
}

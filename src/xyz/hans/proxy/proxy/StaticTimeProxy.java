package xyz.hans.proxy.proxy;

/**
 * Created by Hans on 17/1/5.
 */
//public class StaticTimeProxy implements TimeInterface {
//    private TimeInterface mDelegate;
//
//    public StaticTimeProxy() {
//        mDelegate = new TimeImpl();
//    }
//
//    @Override
//    public String getTime() {
//        String time = mDelegate.getTime();
//        Date date = new Date(Long.valueOf(time));
//        Calendar calendar = Calendar.getInstance(Locale.CHINA);
//        calendar.setTime(date);
//        //只有等于2017年才允许获取时间
//        if (calendar.get(Calendar.YEAR) == 2017) {
//            return time;
//        }
//        //否则返回空
//        return null;
//    }
//}
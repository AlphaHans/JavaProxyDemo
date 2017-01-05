package xyz.hans.proxy.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Hans on 17/1/5.
 */
public class TimeImpl implements TimeInterface {
    @Override
    public String getTime() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override
    public int getYear() {
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
}

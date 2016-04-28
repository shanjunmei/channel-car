package com.hzins.car.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 
 * 时间格式化
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月7日 下午4:49:45
 * @version
 */
public class DateUtils {

    private final static Object locker = new Object();

    private static Map<String, ThreadLocal<SimpleDateFormat>> formaterMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();

    private final static String date_time_pattern = "yyyy-MM-dd HH:mm:ss";

    private static SimpleDateFormat getFormater(final String pattern) {
	ThreadLocal<SimpleDateFormat> formaterLocalMap = formaterMap.get(pattern);
	if (formaterLocalMap == null) {
	    synchronized (locker) {
		formaterLocalMap = new ThreadLocal<SimpleDateFormat>() {

		    @Override
		    protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat(pattern);
		    }

		};
		formaterMap.put(pattern, formaterLocalMap);
	    }
	}
	SimpleDateFormat sdf = formaterLocalMap.get();
	return sdf;

    }

    public static String format(String pattern, Date value) {
	return getFormater(pattern).format(value);
    }

    public static Date parse(String pattern, String value) throws ParseException {
	return getFormater(pattern).parse(value);
    }

    public static String dateTimeFormat(Date date) {
	return format(date_time_pattern, date);
    }

    public static Date dateTimeParse(String value) throws ParseException {
	return parse(date_time_pattern, value);
    }
}

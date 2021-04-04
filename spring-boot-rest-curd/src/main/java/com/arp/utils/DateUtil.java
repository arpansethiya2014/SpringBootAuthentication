package com.arp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class DateUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    private DateUtil() {
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static Calendar getCalenderDate(String stringDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (stringDate == null) {
            return null;
        }
        try {
            Date date = formatter.parse(stringDate);
            Calendar calender = Calendar.getInstance();
            calender.setTime(date);
            return calender;
        } catch (ParseException e) {
            LOGGER.info(String.format("Format mismatched %s", stringDate));
        }
        return null;
    }
}

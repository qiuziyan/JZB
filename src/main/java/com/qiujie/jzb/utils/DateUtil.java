package com.qiujie.jzb.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {

    public static String getCurrentDate(String pattern) {
        LocalDate localDate = LocalDate.now();
        localDate.format(DateTimeFormatter.ofPattern(pattern));
        return localDate.toString();
    }

    public static String getOffsetDate(String pattern,int days){
        LocalDate offsetDate;
        offsetDate = LocalDate.now().plusDays(days);
        offsetDate.format(DateTimeFormatter.ofPattern(pattern));
        return offsetDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.getOffsetDate("yyyy-MM-dd",-1));
    }
}

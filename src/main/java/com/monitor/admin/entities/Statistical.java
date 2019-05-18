/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import jdk.nashorn.internal.runtime.options.Option;

/**
 *
 * @author nam
 */
public class Statistical implements Comparable<Statistical> {

    public int numReq;
    public Date timeReq;

    public Statistical(int numReq, Date timeReq) {
        this.numReq = numReq;
        this.timeReq = timeReq;
    }

    public Statistical(String numReq, String timeReq) {
        try {
            this.numReq = Integer.parseInt(numReq);
            this.timeReq = new SimpleDateFormat("yyyy-MM-dd").parse(timeReq);
        } catch (NumberFormatException | ParseException e) {
            System.err.println(e);
        }
    }

    public Date gettimeReq() {
        return timeReq;
    }

    @Override
    public int compareTo(Statistical o) {
        return gettimeReq().compareTo(o.gettimeReq());
    }

    public static List<Date> getDatesBetween(Date startDate, Date endDate) {
        List<Date> datesInRange = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);

        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(endDate);

        while (calendar.before(endCalendar)) {
            Date result = calendar.getTime();
            datesInRange.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        Date result = calendar.getTime();
        datesInRange.add(result);
        calendar.add(Calendar.DATE, 1);
        return datesInRange;
    }

    public static boolean containsDate(final List<Date> list, final Date date) {
        return list.stream().filter(o -> o.equals(date)).findFirst().isPresent();
    }

    public static Optional<Statistical> containsDateStatis(final List<Statistical> list, final Date date) {
        return list.stream().filter(o -> o.timeReq.equals(date)).findFirst();
    }

    public static void main(String[] args) {
        Statistical a = new Statistical("1", "2019-04-01");
        Statistical b = new Statistical("2", "2019-04-04");
        List<Statistical> statisticals = new ArrayList<>(Arrays.asList(a, b));
        System.out.println("44" + a.timeReq);
        List<Date> dates = Statistical.getDatesBetween(a.gettimeReq(), b.gettimeReq());

        System.err.println("===" + Statistical.containsDateStatis(statisticals, a.timeReq));

    }
}

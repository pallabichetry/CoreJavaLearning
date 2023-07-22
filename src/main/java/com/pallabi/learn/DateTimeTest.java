package com.pallabi.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeTest {

    public static void main(String[] args) throws ParseException {

        LocalDateTime dt = LocalDateTime.now();
        LocalDate date = LocalDate.now();


        System.out.println(dt);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        DateTimeFormatter format1 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter format2 = DateTimeFormatter.BASIC_ISO_DATE;


        String a = dt.format(format);


        System.out.println(dt);
        System.out.println(a);
        System.out.println(date);
        System.out.println(dt.format(format1));
        System.out.println(dt.format(format2));

        // Date time comparison
        String time1 = "2023-07-21 13:20:30";
        String time2 = "2023-07-22 13:20:30";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println(dateFormat.parse(time1).after(dateFormat.parse(time2)));
        System.out.println(dateFormat.parse(time1).before(dateFormat.parse(time2)));

        // Convert String to Date
        Date dd = dateFormat.parse(time1);
        //Convert Date to String
        System.out.println(dateFormat.format(dd));


    }
}

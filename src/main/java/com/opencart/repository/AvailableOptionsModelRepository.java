package com.opencart.repository;

import com.opencart.datamodel.AvailableOptionsModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AvailableOptionsModelRepository {
    private AvailableOptionsModelRepository(){

    }

    public static AvailableOptionsModel getAvailableOptionsModel(){
        String date = randomDate().substring(0,10);
        String time =randomDate().substring(10);
        return AvailableOptionsModel.builder()
                .text(RandomStringUtils.randomAlphabetic(5))
                .textArea(RandomStringUtils.randomAlphabetic(2000))
                .date(date)
                .time(time)
                .dateAndTime(randomDate())
                .build();

    }

    private static String randomDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }
}
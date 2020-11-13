package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AvailableOptionsModel {
    private String text;
    private String textArea;
    private String date;
    private String time;
    private String dateAndTime;
}

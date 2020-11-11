package com.opencart.enums;

public enum URLs {
    BASE_URL("http://localhost/opencart/upload/index.php"),
    TEMP_MAILS_URL("https://www.1secmail.com/api/v1/?action=");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

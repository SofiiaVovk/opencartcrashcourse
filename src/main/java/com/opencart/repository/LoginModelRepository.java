package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import com.opencart.util.RandomEmailUtil;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {
    public LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return LoginModel.getBuilder()
                .email(RandomEmailUtil.email)
                .password(password)
                .build();
    }
}

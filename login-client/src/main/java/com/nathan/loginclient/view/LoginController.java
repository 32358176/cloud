package com.nathan.loginclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@RestController
@CrossOrigin
@RequestMapping("/login")
@RefreshScope
public class LoginController {

    @Value("${name}")
    private String name;

    @Value("/${age}")
    private String age;

    @PostMapping("/name")
    public String getLogin() {
        return "姓名：" + name + ",年龄：" + age;
    }
}

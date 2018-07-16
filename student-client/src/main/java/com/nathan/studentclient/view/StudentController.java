package com.nathan.studentclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@RestController
@CrossOrigin
@RequestMapping("/admin")
public class StudentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public String getStudent(@PathVariable("id") String id) {
        return "这是学生模块客户端系统，端口号是" + port + "，传入参数是：" + id;
    }
}

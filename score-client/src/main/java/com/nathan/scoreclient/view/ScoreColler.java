package com.nathan.scoreclient.view;

import com.nathan.scoreclient.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@RestController
@CrossOrigin
@RequestMapping("/score")
public class ScoreColler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/{id}")
    public String getScore(@PathVariable("id") String id) {
        return "1.分数系统的端口号是：" + port + ",2." + scoreService.getScore(id);
    }
}

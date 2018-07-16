package com.nathan.scoreclient.config;

import com.nathan.scoreclient.dao.ScoreDao;
import org.springframework.context.annotation.Configuration;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@Configuration
public class HystrixConfig implements ScoreDao {


    @Override
    public String getScore(String id) {
        return "在调用STUDENT-CLIENT客服服务器的个getStudent()方法时出现了错误";
    }

}

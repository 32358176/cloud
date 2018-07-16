package com.nathan.scoreclient.dao;

import com.nathan.scoreclient.config.FeignConfig;
import com.nathan.scoreclient.config.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@Repository
@FeignClient(value = "STUDENT-CLIENT", configuration = FeignConfig.class, fallback = HystrixConfig.class)
public interface ScoreDao {

    @GetMapping("/admin/{id}")
    String getScore(@PathVariable("id") String id);
}

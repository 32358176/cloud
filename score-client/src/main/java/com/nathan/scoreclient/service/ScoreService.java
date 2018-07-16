package com.nathan.scoreclient.service;

import com.nathan.scoreclient.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Han Yong
 * @since 2018-07-06
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreDao scoreDao;

    public String getScore(String id) {
        return scoreDao.getScore(id);
    }
}

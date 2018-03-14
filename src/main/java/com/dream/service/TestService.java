package com.dream.service;

import com.dream.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public int getCount(){
        return testDao.getCount("1");
    }
}

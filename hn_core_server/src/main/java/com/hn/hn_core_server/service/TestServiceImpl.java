package com.hn.hn_core_server.service;

import com.hn.hn_core_server.dao.TestDao;
import com.hn.hn_core_server.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    public List<TestModel> testGetList() {

        return this.dao.testGetList();
    }
}

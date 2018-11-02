package com.hn.hn_core_server.dao;

import com.hn.hn_core_server.model.TestModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {

    List<TestModel> testGetList();
}

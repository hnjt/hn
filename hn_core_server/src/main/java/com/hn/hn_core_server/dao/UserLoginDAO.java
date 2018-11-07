package com.hn.hn_core_server.dao;

import com.hn.hn_pojo.Entity.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserLoginDAO {

    List<UserVO> getUserLoginByUuid();
}

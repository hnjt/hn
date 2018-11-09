package com.hn.hn_core_web.service.impl;

import com.hn.hn_core_web.service.UserLoginService;
import com.hn.hn_pojo.Entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service(value = "UserLoginService")
public class UserLoginImpl implements UserLoginService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${hn_core_server}")
    private String hn_core_server;

    @Override
    public List<UserVO> getUserLoginByUuid() {

        return restTemplate.getForEntity(this.hn_core_server + "/test/getUserLoginByUuid", List.class).getBody();
    }
}
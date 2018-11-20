package com.hn.hn_core_web.service;

import com.hn.hn_pojo.Entity.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "CORE-SERVER")
public interface TestFeginService {

    @RequestMapping(value = "/test/getUserLoginByUuid2",method = RequestMethod.POST ,consumes = "application/json")
    List<UserVO> getUserLoginByUuid2(@RequestBody String uuid);

    @RequestMapping(value = "/test/getUserLoginByUuid",method = RequestMethod.GET, consumes = "application/json" )
    List<UserVO> getUserLoginByUuid(String uuid);
}

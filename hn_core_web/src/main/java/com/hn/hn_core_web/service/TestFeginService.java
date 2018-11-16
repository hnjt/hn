package com.hn.hn_core_web.service;

import com.hn.hn_pojo.DTO.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "CORE-SERVER")
public interface TestFeginService {

    @RequestMapping(value = "/test/getUserLoginByUuid2",method = RequestMethod.POST ,consumes = "application/json")
    List<com.hn.hn_pojo.Entity.UserVO> getUserLoginByUuid2(@RequestBody String uuid);

    @RequestMapping(value = "/test/getUserLoginByUuid",method = RequestMethod.GET, consumes = "application/json" )
    List<com.hn.hn_pojo.Entity.UserVO> getUserLoginByUuid(String uuid);
}

package com.hn.hn_core_web.service;

import java.util.List;

/**
 * 登陆信息 of Date 2018-11-08 by Chenyb
 */
public interface UserLoginService {

    List getUserLoginByUuid (String uuid);

    List getUserLoginByUuid2 (String uuid);

    String getStringTest();
}

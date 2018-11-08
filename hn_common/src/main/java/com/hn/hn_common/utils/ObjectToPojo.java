package com.hn.hn_common.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Object 转换 实体类 of Date 2018-11-08 by Chenyb
 */
public class ObjectToPojo {

    /**
     * Object数组转换实体对象
     * @param obj
     * @param clz
     * @return
     * @throws Exception
     */
    public static <T> T objToPojo (Object obj,Class<T> clz) throws Exception{

        Field[] fs = clz.getClass().getDeclaredFields();
        Object[] obs = (Object[]) obj;
        int i = 0 ;
        for (Field f : fs) {

            f.setAccessible(true);
            f.set(clz,obs[i++]);
        }
        return (T) clz;
    }

    /**
     * List<Object[]> 转换 List<Entity>
     * @param objList
     * @param clz
     * @return
     * @throws Exception
     */
    public static <T> List<T> objToPojo (List<Object> objList,Class<T> clz) throws Exception{

        List<T> list = new ArrayList<>();
        for (Object obs : objList) {

            list.add(ObjectToPojo.objToPojo(obs,clz));
        }
        return list;
    }
}

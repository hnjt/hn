package com.hn.hn_common.utils;

/**
 * common test of data 2018-11-06 by Chenyb
 */
public class TestCom {

    public static String testGet (String str){

        return str + "Common Test Ok";
    }

    public static void main(String[] args) {
        String s = TestCom.testGet("Chenyb : ");
        System.out.println(s);
    }
}

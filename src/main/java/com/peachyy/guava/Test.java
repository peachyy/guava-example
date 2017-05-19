package com.peachyy.guava;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class Test {
    private static String SEPARATOR = "|";//分隔符
    private static List TMP_LIST = new ArrayList(){
        {
            add("1");
            add("2");
            add("");
            add("4");
        }
    };
    private static List initTestingData() {
        List list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            if(i%5==0){//方便测试,设置null值
                list.add(null);
            }else{
                list.add("test" + i);
            }
        }
        return list;
    }
    public static String JoinerString1(){
        String str=Joiner.on(SEPARATOR).join(TMP_LIST);
        return  str;
    }
    private static Map<String,String> map = new HashMap<String,String>(){

        private static final long serialVersionUID = 1L;
        {
            put("i love u", "u love me");
            put("i like u", "u like me");
            put("i hate u", "u hate me");
        }
    };
    public static void main(String[] args) {
        System.out.println(JoinerString1());
    }
}

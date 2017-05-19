package com.peachyy.guava.base;

import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class SplitterTest {

    private static String SEPARATOR = "&";//分隔符
    private static String SEPARATOR2 = ",";//分隔符
    private static List TMP_LIST = new ArrayList() {
        {
            add("1");
            add("2");
            add("");
            add("4");
        }
    };

    public static void test() {
        String str = "a & & b &v";
        Iterable strings = Splitter.on(SEPARATOR).omitEmptyStrings()
                .split(str);
        System.out.println(strings);

        Iterable strings2 = Splitter.on(SEPARATOR)
                .trimResults().split(str);
        System.out.println(strings2);
    }

    public static void test2() {
        Splitter.MapSplitter mapSplitter = Splitter.on(SEPARATOR2)
                .omitEmptyStrings().withKeyValueSeparator("=");
        Map<String, String> map = mapSplitter.split("a=1, b=3, b2=4");
        Set keySet = map.keySet();
        System.out.println(keySet);
    }

    public static void main(String[] args) {
        test();
        test2();
    }

}

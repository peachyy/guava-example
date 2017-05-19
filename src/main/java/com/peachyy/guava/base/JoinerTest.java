package com.peachyy.guava.base;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class JoinerTest {
    private static String SEPARATOR = "|";//分隔符
    private static List TMP_LIST = new ArrayList() {
        {
            add("1");
            add("2");
            add("");
            add("4");
        }
    };

    /**
     * @return
     */
    public static String JoinerString1() {
        String str = Joiner.on(SEPARATOR).join(TMP_LIST);
        return str;
    }
}

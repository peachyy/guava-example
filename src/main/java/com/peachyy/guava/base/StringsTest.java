package com.peachyy.guava.base;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class StringsTest {
    public static String STR = "test str";

    public static void main(String[] args) {

        STR.getBytes(Charsets.UTF_8);
//
//        Strings.commonPrefix();
//        Strings.commonSuffix()
//        Strings.emptyToNull();
        System.out.println(Strings.padEnd("4", 6, '0'));
        Preconditions.checkArgument(1 == 1, "错误了");
        // Objects.
        int r = ComparisonChain.start().compare(3, 2).compare(2, 3).compare(1, 3).result();
        System.out.println(r);
    }
}

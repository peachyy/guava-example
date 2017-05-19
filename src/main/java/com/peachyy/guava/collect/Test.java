package com.peachyy.guava.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class Test {
    static List<String> lsts
            = Lists.newArrayList("1", "2", "3", "4");

    public static void main(String[] args) {

        FluentIterable<String> s = FluentIterable.from(lsts).transform(new Function<String, String>() {
            @Override
            public String apply(String input) {
                return Joiner.on("--").join(input, "XXX");
            }
        });
        System.out.println(s.toString());

        ImmutableList<Character> characters = Lists.charactersOf("ABVFWER");
        System.out.println(characters);
    }
}

package com.peachyy.guava.concurrent;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

/**
 * <p>描述:</p>
 *
 * @author Tao xs
 * @since 2.0
 * <p>Created by Tao xs on 2017/5/19.</p>
 */
public class Test {
    public static void main(String[] args) {
        ListeningExecutorService executorService =
                MoreExecutors.listeningDecorator(null);
        // MoreExecutors.getExitingExecutorService()
    }
}

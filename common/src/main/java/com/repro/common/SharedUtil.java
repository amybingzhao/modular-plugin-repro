package com.repro.common;

import com.google.common.collect.ImmutableList;

public class SharedUtil {

    public static ImmutableList<String> getItems() {
        return ImmutableList.of("hello", "world");
    }
}

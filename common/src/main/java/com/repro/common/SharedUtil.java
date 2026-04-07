package com.repro.common;

import com.google.common.collect.ImmutableList;

public class SharedUtil {

    // Static field forces guava classloading during SharedUtil class init,
    // which happens in common's classloader. On the thin client, common's
    // classloader has no parents, so it can't find ImmutableList.
    public static final ImmutableList<String> ITEMS = ImmutableList.of("hello", "world");

    public static ImmutableList<String> getItems() {
        return ITEMS;
    }
}

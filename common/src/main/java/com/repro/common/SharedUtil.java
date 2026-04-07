package com.repro.common;

import com.google.common.collect.ImmutableList;
import org.apache.commons.text.WordUtils;

public class SharedUtil {

    // Static field forces classloading of commons-text during class init.
    // commons-text is NOT bundled with IntelliJ, so it must come from
    // the plugin's lib/ directory. On thin client, common's classloader
    // has no parent that includes lib/, causing ClassNotFoundException.
    public static final String GREETING = WordUtils.capitalize("hello world");

    public static ImmutableList<String> getItems() {
        return ImmutableList.of(GREETING);
    }
}

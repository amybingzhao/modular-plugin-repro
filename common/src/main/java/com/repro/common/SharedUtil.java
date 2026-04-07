package com.repro.common;

import com.google.common.collect.ImmutableList;

/**
 * Shared utility that uses an external dependency (Guava).
 * The key test: can backend/frontend modules access this class,
 * and can this class access Guava (which is outside the package prefix)?
 */
public class SharedUtil {

    public static ImmutableList<String> getItems() {
        return ImmutableList.of("hello", "world");
    }
}

package com.repro.backend;

import com.intellij.ide.AppLifecycleListener;
import com.repro.common.SharedUtil;

public class BackendActivator implements AppLifecycleListener {

    @Override
    public void appStarted() {
        System.out.println("Backend started: " + SharedUtil.getItems());
    }
}

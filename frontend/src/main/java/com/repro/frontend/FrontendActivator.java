package com.repro.frontend;

import com.intellij.ide.AppLifecycleListener;
import com.repro.common.SharedUtil;

public class FrontendActivator implements AppLifecycleListener {

    @Override
    public void appStarted() {
        System.out.println("Frontend started: " + SharedUtil.getItems());
    }
}

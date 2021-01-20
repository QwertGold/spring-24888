package com.example.springtest.demo;

import ch.qos.logback.core.spi.LifeCycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

@Service
public class BeanWithLifecycle implements SmartLifecycle {

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void start() {
        // assume that a developer makes a request here that results in a state that can be detected as invalid, and therefore throws an exception
        throw new IllegalStateException("stuff went wrong");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}

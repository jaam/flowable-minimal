package com.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author Jose Antonio Alvarez
 */
public class SimpleServiceTask implements JavaDelegate {
    public void execute(DelegateExecution execution) {
        System.out.println("Hello world!");
    }
}

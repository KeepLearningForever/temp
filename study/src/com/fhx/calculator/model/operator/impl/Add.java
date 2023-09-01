package com.fhx.calculator.model.operator.impl;

import com.fhx.calculator.model.operator.Operator;

/**
 * 单例加法逻辑
 *
 * @author fenghaoxian
 * @date 2023/8/31 15:56
 */
public class Add implements Operator {

    @Override
    public synchronized Double calculate(Double number1, Double number2) {
        return number1+number2;
    }

    private static Add instance;

    private Add() {}

    public synchronized static Add getInstance() {
        if(instance == null ) {
            instance = new Add();
        }
        return instance;
    }

}

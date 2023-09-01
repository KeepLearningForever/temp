package com.fhx.calculator.model.operator.impl;

import com.fhx.calculator.model.operator.Operator;

/**
 * 单例减法逻辑
 *
 * @author fenghaoxian
 * @date 2023/8/31 16:09
 */
public class Subtract implements Operator {

    @Override
    public Double calculate(Double number1, Double number2) {
        return number1-number2;
    }

    private static Subtract instance;

    private Subtract() {}

    public synchronized static Subtract getInstance() {
        if(instance == null ) {
            instance = new Subtract();
        }
        return instance;
    }

}

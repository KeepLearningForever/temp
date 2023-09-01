package com.fhx.calculator.model.operator.impl;

import com.fhx.calculator.model.operator.Operator;

/**
 * 单例乘法逻辑
 *
 * @author fenghaoxian
 * @date 2023/8/31 16:10
 */
public class Multiply implements Operator {

    @Override
    public Double calculate(Double number1, Double number2) {
        return number1*number2;
    }

    private static Multiply instance;

    private Multiply() {}

    public synchronized static Multiply getInstance() {
        if(instance == null ) {
            instance = new Multiply();
        }
        return instance;
    }

}

package com.fhx.calculator.model.operator.impl;

import com.fhx.calculator.model.operator.Operator;

/**
 * 单例除法逻辑
 *
 * @author fenghaoxian
 * @date 2023/8/31 16:11
 */
public class Divide implements Operator {

    @Override
    public synchronized Double calculate(Double number1, Double number2) {
        return number1/number2;
    }

    private static Divide instance;

    private Divide() {}

    public synchronized static Divide getInstance() {
        if(instance == null ) {
            instance = new Divide();
        }
        return instance;
    }

}

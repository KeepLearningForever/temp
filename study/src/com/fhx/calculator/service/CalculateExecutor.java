package com.fhx.calculator.service;

import com.fhx.calculator.model.operator.Operator;

/**
 * 计算中心
 *
 * @author fenghaoxian
 * @date 2023/8/31 15:36
 */
public class CalculateExecutor {

    public static Double execute(Operator operator, Double number1, Double number2) {
        return operator.calculate(number1,number2);
    }

}

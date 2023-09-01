package com.fhx.calculator.model.operator;

/**
 * 运算符
 *
 * @author fenghaoxian
 * @date 2023/8/31 15:52
 */
public interface Operator {

    /**
     * 操作符计算逻辑
     *
     * @param number1 操作数1
     * @param number2 操作数2
     * @return 结果
     */
    Double calculate(Double number1,Double number2);
}

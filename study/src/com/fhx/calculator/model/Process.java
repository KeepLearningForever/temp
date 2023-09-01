package com.fhx.calculator.model;

import com.fhx.calculator.model.operator.Operator;

/**
 * 记录redo要做的计算步骤(运算符和操作数)
 *
 * @author fenghaoxian
 * @date 2023/8/31 19:19
 */
public class Process {
    private Operator operator;
    private Double number;

    public void setOperatorAndNumber(Operator operator,Double number) {
        this.operator = operator;
        this.number = number;
    }

    public Operator getOperator() {
        return operator;
    }

    public Double getNumber() {
        return number;
    }

    public Process(Operator operator, Double number) {
        this.operator = operator;
        this.number = number;
    }
}

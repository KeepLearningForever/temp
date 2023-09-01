package com.fhx.calculator;

import com.fhx.calculator.model.Result;
import com.fhx.calculator.model.operator.impl.Add;
import com.fhx.calculator.model.operator.impl.Divide;
import com.fhx.calculator.model.operator.impl.Multiply;
import com.fhx.calculator.model.operator.impl.Subtract;
import com.fhx.calculator.service.CalculateExecutor;


/**
 * 计算器入口类
 *
 * @author fenghaoxian
 * @date 2023/8/31 15:03
 */
public class Calculator {

    private Result result;

    public Calculator() {
        result = new Result();
    }

    public void reset() {
        result = new Result();
    }

    public Result add(Double number1,Double number2) {
        Add add = Add.getInstance();
        result.set(CalculateExecutor.execute(add, number1, number2));
        return result;
    }

    public Result subtract(Double number1,Double number2) {
        Subtract subtract = Subtract.getInstance();
        result.set(CalculateExecutor.execute(subtract, number1, number2));
        return result;
    }

    public Result multiply(Double number1,Double number2) {
        Multiply multiply = Multiply.getInstance();
        result.set(CalculateExecutor.execute(multiply, number1, number2));
        return result;
    }

    public Result divide(Double number1,Double number2) {
        Divide divide = Divide.getInstance();
        result.set(CalculateExecutor.execute(divide, number1, number2));
        return result;
    }

    public Result undo() {
        return result.undo();
    }

    public Result redo() {
        return result.redo();
    }

}

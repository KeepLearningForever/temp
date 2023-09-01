package com.fhx.calculator.model;

import com.fhx.calculator.model.operator.Operator;
import com.fhx.calculator.model.operator.impl.Add;
import com.fhx.calculator.model.operator.impl.Divide;
import com.fhx.calculator.model.operator.impl.Multiply;
import com.fhx.calculator.model.operator.impl.Subtract;
import com.fhx.calculator.service.CalculateExecutor;
import java.util.Stack;

/**
 * 计算结果类，支持链式调用
 *
 * @author fenghaoxian
 * @date 2023/8/31 15:11
 */
public class Result {

    private Double number;

    /**
     * 记录曾经得到过的计算结果的栈
     */
    private final Stack<Double> undoStack;

    /**
     * 记录上一次计算步骤
     */
    private final Process redoProcess;

    public Result() {
        this.number = 0d;
        this.undoStack = new Stack<>();
        this.redoProcess = new Process(null,0d);
    }

    public Double get() {
        return number;
    }

    public void set(Double number) {
        this.number = number;
    }

    public Result add(Double number2) {
        undoStack.push(this.number);
        Add add = Add.getInstance();
        redoProcess.setOperatorAndNumber(add,number2);
        this.number = CalculateExecutor.execute(add, this.number, number2);
        return this;
    }

    public Result subtract(Double number2) {
        undoStack.push(this.number);
        Subtract subtract = Subtract.getInstance();
        redoProcess.setOperatorAndNumber(subtract,number2);
        this.number = CalculateExecutor.execute(subtract, this.number, number2);
        return this;
    }

    public Result multiply(Double number2) {
        undoStack.push(this.number);
        Multiply multiply = Multiply.getInstance();
        redoProcess.setOperatorAndNumber(multiply,number2);
        this.number = CalculateExecutor.execute(multiply, this.number, number2);
        return this;
    }

    public Result divide(Double number2) {
        undoStack.push(this.number);
        Divide divide = Divide.getInstance();
        redoProcess.setOperatorAndNumber(divide,number2);
        this.number = CalculateExecutor.execute(divide, this.number, number2);
        return this;
    }

    public Result undo() {
        if (undoStack.empty()){
            this.number = 0d;
            return this;
        }
        this.number = undoStack.pop();
        redoProcess.setOperatorAndNumber(null,0d);
        return this;
    }

    public Result redo() {
        undoStack.push(this.number);
        Operator operator = redoProcess.getOperator();
        Double number2 = redoProcess.getNumber();
        this.number = CalculateExecutor.execute(operator, this.number, number2);
        return this;
    }
}

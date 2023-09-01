package com.fhx;

import com.fhx.calculator.Calculator;

/**
 * @author fenghaoxian
 * @date 2023/8/31 16:56
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("结果:"+calculator.add(3d,5.5d).multiply(3d).divide(2d).get());
        System.out.println("除2后:"+calculator.redo().get());
        System.out.println("再除2后:"+calculator.redo().get());
        System.out.println("回退一次后结果:"+calculator.undo().get());
        System.out.println("再回退一次后结果:"+calculator.undo().get());

        calculator.reset();
        //(2+8)×2×2➗3-4,再撤回-4
        System.out.println(calculator.add(2d,8d).multiply(2d).redo()
                .divide(3d).subtract(4d).undo().get());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.empresa.functions.java8;

import java.util.function.IntBinaryOperator;

/**
 *
 * @author cesaralducinruiz
 */
public class Main {

    public static void main(String[] args) {
        IntBinaryOperator io = (x, y) -> x + y;

        System.out.println(io.applyAsInt(2, 3));

    }

}

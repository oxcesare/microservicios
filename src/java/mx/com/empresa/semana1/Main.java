/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.empresa.semana1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author cesaralducinruiz
 */
public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Function<Double, Double> square = number -> number * number;
        Function<Double, Double> half = number -> number * 2;

        List<Double> numbers = Arrays.asList(10D, 4D, 12D); //Una lista de objetos
        // you can use identity to not modify them
        System.out.println(mapIt(numbers, Function.<Double>identity()));
    }

    private static List<Double> mapIt(List<Double> numbers, Function<Double, Double> fx) {
        List<Double> result = new ArrayList<>();

        for (Double number : numbers) {
            result.add(fx.apply(number));
        }

        return result;
    }

}

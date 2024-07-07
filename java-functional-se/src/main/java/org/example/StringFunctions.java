package org.example;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        System.out.println(quote.apply("Hola"));

        BiFunction<Integer, Integer, Integer> multiplicacion = (x,y) -> x * y;

        System.out.println(multiplicacion.apply(2,4));

        BinaryOperator<Integer> multiplicacion2 = (x,y) -> x * y;

        System.out.println(multiplicacion2.apply(5,4));

        BiFunction<String, Integer, String> leftPad =
                (text,number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));

    }

}

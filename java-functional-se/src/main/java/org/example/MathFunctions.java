package org.example;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        System.out.println(square.apply(5));
        System.out.println(square.apply(25));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);

        System.out.println(isOdd.apply(3));
        System.out.println(isOdd.apply(2));
        System.out.println(isEven.test(3));
        System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 3.0;

        Student juanpablo = new Student(5.0);

        System.out.println(isApproved.test(juanpablo));
    }

    static class Student {
        private Double calificacion;

        public Student(Double calificacion){
            this.calificacion = calificacion;
        }

        public Double getCalificacion() {
            return calificacion;
        }
    }
}

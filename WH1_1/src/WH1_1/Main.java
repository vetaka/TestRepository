package WH1_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int e = 10;
        int f = 20;
        int g = 30;
        int h = 40;
        System.out.println(myFunc(e, f, g, h));
//
        int x = 11;
        int y = 5;
        System.out.println(logFunc(x, y));
//
        int a = -10;
        System.out.println(signFunc(a));

        String name = "Иван";
        helloFunc(name);
//
        int year = 2020;
        System.out.println( "Год " + year + ( visYear(year)? " - високосный.": " - не високосный"));
    }
/* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
     где a, b, c, d – целочисленные входные параметры этого метода */
    public static double myFunc ( float a, float b, float c, float d){
            return a * (b + (c / d));
        }
/*Написать метод, принимающий на вход два целых числа,
         и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
         если да – вернуть true, в противном случае – false */
    public static boolean logFunc(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else return false;
    }
    /*Написать метод, которому в качестве параметра передается целое число,
           метод должен проверить положительное ли число передали, или отрицательное.
           Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль */
    public static String signFunc(int b) {
        if (b >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }
    /*Написать метод, которому в качестве параметра передается строка,
      обозначающая имя, метод должен вернуть приветственное сообщение
      «Привет, переданное_имя!»; Вывести приветствие в консоль.
       */
    private static void helloFunc(String n){
        System.out.println("Привет, " + n + "!");
    }
    /*Написать метод, который определяет является ли год високосным.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     Для проверки работы вывести результаты работы метода в консоль
     */
    public static boolean visYear(int y) {
        if ((y % 4 == 0) && (y % 100 != 0 || y % 400 == 0)) return true;
        else return false;
    }
}

package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program08 {

    public static void ChangeLine(){
            out.println("Метод, переставляющий символы в строке в обратном порядке: ");

        Scanner input = new Scanner(System.in);
        StringBuffer line = new StringBuffer();

            out.println("Введите произвольную строку: ");
        line.append(input.nextLine());
        line.reverse();

            out.println(line);

        // Решение задачи без использования консольного ввода
        /*
        StringBuffer buffer = new StringBuffer("java interview");
        buffer.reverse();
        out.println("Было java interview, стало " + buffer); */
    }
}

package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program09 {

    public static void Celsius() {

    out.println((char) 27 + "[32m      Введите значение градусов в С:" + (char)27 + "[0m");
    Scanner sc = new Scanner(System.in);
    int ce = sc.nextInt();
    int fa = 9/5 + 32;
        out.println((char) 27 + "[32m      Метод возвращает значение градусов в F:" + (char)27 + "[0m");
        out.println(ce + fa);


    }
}

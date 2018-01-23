package ua.hillel;

import static java.lang.System.out;

import java.util.Scanner;

public class Program04 {

    public static void Fibonacci(){

        out.println("Fibonacci");

        int a = 0;
        int b = 1;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            out.print(sum_fib + " ");
                }
            }
        }




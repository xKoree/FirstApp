package ua.hillel;

import static java.lang.System.out;

public class ChooseProgram {

    public static void Choose(){

        out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
        out.println((char) 27 + "[34m    Выберите программу для запуска: " + (char)27 + "[0m");
        out.println("       1. Сумма двух чисел");
        out.println("       2. Наибольшее целое число в списке");
        out.println("       3. Возврат n-го элемента списка");
        out.println("       4. Возврат n-го элемента последовательности Фибоначчи");
        out.println("       5. Палиндром");
        out.println("       6. Вычисление факториала заданного числа");
        out.println("       7. Возврат индекса первого вхождения заданного числа в список");
        out.println("       8. Метод изменения строки");
        out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");


    }
}

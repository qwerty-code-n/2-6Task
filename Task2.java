package com.company;
import java.util.*;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //  int num = in.nextInt();
        //  double num2 = in.nextDouble();
        //  double num3 = in.nextDouble();
        System.out.println();
        System.out.println("Task1 - Введите строку и кол-во повторений символов");
        repeat();
        System.out.println();
        System.out.println();
        System.out.println("Task2 - Max min в массиве");
        differenceMaxMin();
        System.out.println();
        System.out.println("Task3 - True or False");
        System.out.println(isAvgWhole());
        System.out.println();
        System.out.println("Task4 - Массив целых чисел");
        System.out.println();
        cumulativeSum();
        System.out.println();
        System.out.println();
        System.out.println("Task5 - Кол-во чисел после запятой");
        System.out.println();
        getDecimalPlaces();
        System.out.println();
        System.out.println("Task6 - Фибоначчи");
        System.out.println();
        Fibonacci();
        System.out.println();
        System.out.println("Task7 - Почтовые индексы");
        System.out.println();
        System.out.println(isValid());
        System.out.println();
        System.out.println("Task8 - Странные пары");
        System.out.println(isStrangePair());
        System.out.println();
        System.out.println("Task9 - Префикс/Суффикс");
        System.out.println();
        System.out.print("Префикс: ");
        System.out.println(isPrefix());
        System.out.print("Суффикс: ");
        System.out.println(isSuffix());
        System.out.println();
        System.out.println("Task10 - Шаг");
        System.out.println();
        System.out.println(boxSeq());


    }

    public static void repeat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();
        System.out.print("Введите кол-во повторений: ");
        int p = input.nextInt();


        String array[] = new String[size];
        System.out.print("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.next();

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].repeat(p);
        }
        System.out.print("Полученный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }

    }

    public static void differenceMaxMin() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();

        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i] + " ");

        }

        Arrays.sort(array);
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        int firstNum = array[0];
        int lastNum = array[array.length - 1];
        System.out.println();

        lastNum = lastNum - firstNum;
        System.out.print("Разница между элеменатами равна: ");
        System.out.println(lastNum);
    }

    public static boolean isAvgWhole() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();

        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 100));

            System.out.print(array[i] + " ");

        }
        double a = 0;
        for (int i = 0; i < size; i++) {
            a = a + array[i];

        }
        System.out.println();
        System.out.print("Cумма элементов в массиве равна: ");
        System.out.println(a);
        System.out.print("Среднее арифметическое: ");
        System.out.println(a / size);
        System.out.print("Результат: ");

        if (a % size == 0)
            return true;
        else return false;
    }

    public static void cumulativeSum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        int a = 0;
        int array1[] = new int[size];
        System.out.println();
        System.out.print("Итоговый массив: ");
        for (int i = 0; i < size; i++) {
            a = a + array[i];
            array1[i] = a;
            System.out.print(array1[i] + " ");
        }
    }

    public static void getDecimalPlaces() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        double size = input.nextDouble();
        int i = 0;
        while (size % 1 > 0) {
            i = i + 1;
            size = size * 10;
        }
        System.out.println(i);
    }
    public static void Fibonacci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        double size = input.nextDouble();
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 0; i < size - 1; i++)
        {
            b = c;
            c = b + a;
            a = b;
        }
        System.out.println(c);
    }
    public static boolean isValid()
    {
        Scanner input = new Scanner(System.in);
        String stroka = input.next();
        String sub = " ";
        for(int i=0; i<stroka.length(); i++)
        {
            if(((stroka.charAt(i)<'0' || stroka.charAt(i)>'9')) || ((stroka.length() < 5)  || (stroka.length() > 5))  || (stroka.indexOf(sub) != -1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isStrangePair()
    {
        Scanner input = new Scanner(System.in);
        String stroka = input.next();
        String stroka1 = input.next();
        if (stroka.charAt(0) == stroka1.charAt(stroka1.length() - 1) && stroka.charAt(stroka.length() - 1) == stroka1.charAt(0))
        {
            return true;
        }
        else return false;
    }

    public static boolean isPrefix()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        return str1.startsWith(str2.substring(0, str2.length() - 2));
    }

    public static boolean isSuffix()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        return str1.endsWith(str2.substring(1));
    }
    public static int boxSeq()
    {
        Scanner input = new Scanner(System.in);
        double shag = input.nextDouble();
        int res = 0;
        if (shag == 0)
        {return res;}

        for (int i = 1; i <= shag; i++)
        {
            if (i % 2 == 0) {
                res -= 1;
            } else {
                res += 3;
            }
        }
        return res;
    }
}



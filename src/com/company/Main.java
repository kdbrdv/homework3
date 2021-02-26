package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {1.2, -3.1, 2.5, 8.9, -5.2, -9.1, 4.59, 1.01, 0.4, -4.25, 12.4, -2.3, -5.1, 4.89, 1.12};
        for (double number: array){
            System.out.println("число = " + number);
        }
        Arrays.sort(array);
        System.out.println("Алгоритм сортировки массива по возрастанию:");
        for (double number: array){
            System.out.println(" " + number);
        }
            //Arrays.sort(array);
            //System.out.println(Arrays.toString(array));


            double result = calculate(array);
        System.out.println("Среднее арифмитическое положительных чисел " + result);

    }

    private static double calculate(double[] array) {
        boolean isNegative = false;
        int count = 0;
        double result = 0.0;
        for (double item :
                array) {
            if (item < 0) {
                isNegative = true;

            } else {
                if (isNegative) {
                    result += item;
                    count++;
                }
            }
        }
        return result / count;


    }


}

        /*
#ДЗ:
Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного
 числа и вывести его на экран (8, -2, -4, 2, 3, 6) =  11/3
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый
минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то есть
первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
{-4, -2, 2, 3, 6, 8}
Дэдлайн 27.02.2021 23 59
	 */
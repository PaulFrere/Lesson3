package ru.zsa;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int n = 20;
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(100);
            sum = sum + array[i];
            System.out.println(array[i]);
        }
        System.out.println("Сумма элементов массива равна " + sum);

        if(sum % 2 == 0){
            System.out.println("ЧЕТНО");
        }else {
            System.out.println("НЕЧЕТНО");
        }
    }
}

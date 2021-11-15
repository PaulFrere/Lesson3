package ru.zsa;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;

        int[][] life = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                life[i][j] = new Random().nextInt(2);
            }
        }
        int move = new Random().nextInt(21);
        int k = move % 10;
        int l = move/10;
        int element = life[k][l];
        if (element == 1){
            System.out.println("Жизнь есть");
        }else {
            System.out.println("Жизни нет");
        }
    }
}

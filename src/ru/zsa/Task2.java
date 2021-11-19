package ru.zsa;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int v = 5;

        int[][] life = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                life[i][j] = new Random().nextInt(2);
            }
        }
        for (int i = 0; i < v; i++) {
            int move = new Random().nextInt(21);
            int k = move % 10;
            int l = move / 10;

            if (k != 0 && k != n-1 && l != 0 && l != n-1) {
                if (2 <= (life[k - 1][l - 1] + life[k - 1][l] + life[k - 1][l + 1] + life[k][l - 1] + life[k][l + 1] + life[k + 1][l - 1] + life[k + 1][l] + life[k + 1][l + 1]) || (life[k - 1][l - 1] + life[k - 1][l] + life[k - 1][l + 1] + life[k][l - 1] + life[k][l + 1] + life[k + 1][l - 1] + life[k + 1][l] + life[k + 1][l + 1]) <= 3) {
                    System.out.println("Жизнь есть");
                } else {
                    System.out.println("Жизни нет");
                }

            }else{
                if (k == 0 && l != 0 && l != n-1){
                    if (2 <= (life[n-1][l-1] + life[n-1][l] + life[n-1][l+1] + life[k][l-1] + life[k][l+1] + life [k+1][l-1] + life[k+1][l] + life[k+1][l+1]) || (life[n-1][l-1] + life[n-1][l] + life[n-1][l+1] + life[k][l-1] + life[k][l+1] + life [k+1][l-1] + life[k+1][l] + life[k+1][l+1])<= 3){
                        System.out.println("Жизнь есть");
                    }else{
                        System.out.println("Жизни нет");
                    }
                    if (k==n-1 && l != 0 && l != n-1) {
                        if (2 <= (life[k - 1][l - 1] + life[k - 1][l] + life[k - 1][l + 1] + life[k][l - 1] + life[k][l + 1] + life[0][l - 1] + life[0][l] + life[0][l + 1]) || (life[k - 1][l - 1] + life[k - 1][l] + life[k - 1][l + 1] + life[k][l - 1] + life[k][l + 1] + life[0][l - 1] + life[0][l] + life[0][l + 1]) <= 3) {
                            System.out.println("Жизнь есть");
                        } else {
                            System.out.println("Жизни нет");
                        }
                    }
                    if(l == 0 && k != 0 && k != n-1){
                        if (2 <= (life[k-1][n-1] + life[k-1][l] + life[k-1][l+1] + life[k][n-1] + life[k][l+1] + life [k+1][n-1] + life[k+1][l] + life[k+1][l+1]) || (life[k-1][n-1] + life[k-1][l] + life[k-1][l+1] + life[k][n-1] + life[k][l+1] + life [k+1][n-1] + life[k+1][l] + life[k+1][l+1])<= 3){
                            System.out.println("Жизнь есть");
                        }else {
                            System.out.println("Жизни нет");
                        }
                    }
                    if (l==n-1 && k != 0 && k != n-1) {
                        if (2 <= (life[k-1][l-1] + life[k-1][l] + life[k-1][0] + life[k][l-1] + life[k][0] + life [k+1][l-1] + life[k+1][l] + life[k+1][0]) || (life[k-1][l-1] + life[k-1][l] + life[k-1][0] + life[k][l-1] + life[k][0] + life [k+1][l-1] + life[k+1][l] + life[k+1][0])<= 3){
                            System.out.println("Жизнь есть");
                        }else {
                            System.out.println("Жизни нет");
                        }
                    }
                }
            }
            }
        }
    }


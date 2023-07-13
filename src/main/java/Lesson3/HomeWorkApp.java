package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        myArray();
        myArray2();
        myArray3();
        myArray4();
        myArray5();
//        myArray4TEST();
//        System.out.println("Длина массива: " + myArray5("Введите длину массива"));
    }

    private static void myArray() {
        System.out.println("Задание 1: ");
        int [] myArray = new int [4];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i ++ ){
            myArray[i] = random.nextInt (2);
            System.out.println("Массив 1: " + myArray [i]);
            }
        for (int i = 0; i < myArray.length; i ++ ){
            if (myArray [i]==0){
                myArray[i] = 1;
                System.out.println("Массив 2: " + myArray [i]);
            }
            else {
                myArray[i] = 0;
                System.out.println("Массив 2: " + myArray [i]);
            }
        }

    }
    private static void myArray2() {
        System.out.println("Задание 2: ");
        int[] myArray2 = new int[100];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i + 1;
            System.out.println(myArray2[i]);
        }
    }
    private static void myArray3() {
        System.out.println("Задание 3: ");
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] < 6){
                myArray3[i] = myArray3[i] * 2;
            }
            else {
                myArray3[i] = myArray3[i] * 1;
            }
            System.out.println(myArray3[i]);
        }
    }
    /*    private static void myArray4() {
        System.out.println("Задание 4: ");
        int[][] myArray4 = new int[4][4];
        for (int i = 0; i < myArray4.length; i++) {
            for (int j = 0; j < myArray4.length; j++) {
                if (i == j){
                    myArray4[i][j] = 1;
                }
                else{
                    myArray4[i][j] = 0;
                }

                System.out.print(myArray4[i][j] + " | ");
            }
            System.out.println();
        }
    }*/
    private static void myArray4() {
        System.out.println("Задание 4: ");
        int[][] myArray4 = new int[4][4];
        for (int i = 0; i < myArray4.length; i++) {
            for (int j = 0; j < myArray4.length; j++) {
                if ((i == j) || (i == i && j == myArray4.length - i - 1)){
                    myArray4[i][j] = 1;
                }
                else{
                    myArray4[i][j] = 0;
                }

                System.out.print(myArray4[i][j] + " | ");
            }
            System.out.println();
        }
    }
 //   private static int myArray5(String msg) {
 //       System.out.println("Задание 5: ");
 //       System.out.println(msg);
  //      return scanner.nextInt();
//        int[] myArray5 = new int[];
    //    System.out.println("Введите значение массива  ");
    //    return scanner.nextInt();
//    }
    private static void myArray5() {
        System.out.println("Задание 5: ");
        System.out.println("Введите длину массива: ");
        int number = scanner.nextInt();
        int[] myArray5 = new int[number];
        System.out.println("Длина массива: " + myArray5.length);
        System.out.println("Введите значение массива: ");
        System.out.println("Значение массива: ");
        int number2 = scanner.nextInt();
        for (int i = 0; i < myArray5.length; i++) {
            myArray5[i] = number2 ;
            System.out.print(myArray5[i] + " | ");
        }
        System.out.println();
    }
/*   public static void myArray4TEST() {
        System.out.println("ТЕСТ: ");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            System.out.print(arr.length - i - 1);

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(arr.length);
    }

 */

}


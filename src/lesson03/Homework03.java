package lesson03;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        int[] firstArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        {
            System.out.println("Первый массив");
        }
        for (int i = 0; i < firstArray.length; i++)
        {
            System.out.print(firstArray[i] + " ");
        }
        {
            System.out.println(" ");
        }
        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] == 1) {
                 firstArray[i] = 0;
            } else {
                 firstArray[i] = 1;
            }
        }
        for (int i = 0; i < firstArray.length; i++)

        {
            System.out.print(firstArray[i] + " ");
        }

        int[] secondArray = new int[101]; // по другому не получается в ячейку 0 засунуть значение 1 и что бы последнее число было 100

                for (int b = 1; b < secondArray.length; b++) {
            secondArray[b] = b;
        }
        {
            System.out.println(" ");
        }
        {
            System.out.println("Второй массив");
        }
        for (int i = 1; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
        int[] thirdArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        {
            System.out.println(" ");
        }
        {
            System.out.println("Третий массив");
        }
        for (int a = 0; a < thirdArray.length; a++)
        {
            System.out.print(thirdArray[a] + " ");
        }
        {
            System.out.println(" ");
        }
        for (int a = 0; a < thirdArray.length; a++) {

            if (thirdArray[a] < 6) {
                thirdArray[a] = (thirdArray[a] * 2);}
                else {thirdArray[a] = thirdArray[a];
            }
            }

        for (int a = 0; a < thirdArray.length; a++)

        {
            System.out.print(thirdArray[a] + " ");
        }


            int[][] squareArr = new int[4][4];
        {
            System.out.println(" ");
        }
        {
            System.out.println("Четвертый массив");
        }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {squareArr[i][j] = 1;}
                    else {squareArr[i][j] = 0;}
                }
            }
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[i].length; j++) {
                System.out.print(squareArr[i][j]);
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int len = sc.nextInt();
        System.out.println("Введите  второе число: ");
        int  initialValue = sc.nextInt();;
        sc.close();

        int[] inputArray = new int[len];

        {

            System.out.println(" ");


            System.out.println("Пятый массив");
        }

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = initialValue;

            {



                System.out.print(inputArray[i] + " ");
            }

        }


    }

    }


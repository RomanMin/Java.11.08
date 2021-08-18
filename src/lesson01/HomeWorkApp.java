package lesson01;
/**
 * Roman Minaev Homework 1
 */
public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWord();
        checkSumSight();
        printColor();
        compareNumbers();


    }

        public static void printThreeWord(){
            System.out.println("_orange");
            System.out.println("_Banana");
            System.out.println("_Apple");
        }
    public static void checkSumSight() { int a = 5;
int b =6;
 if (a+b>=0)
     System.out.println("Сумма положительная");
 else
     System.out.println("Сумма отрицательная");
    }
    public static void  printColor() { int value = 101;
        if (value<=0)
            System.out.println("Красный");
        else
         if (value <100)
            System.out.println("Желтый");
         else
             System.out.println("Зеленый");

    }
    public static void compareNumbers()
    { int a = 5;
        int b =6;
        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}

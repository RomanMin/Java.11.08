package lesson02;
// Minaev Roman

public class Homework2 {

    public static void main(String[] args) {
        checkSum() ;
        checkNumber();
        checkNumberNew();
      printWord();


    }
    public static void checkSum (){ int a = -7;
        int b =6;
        if (a+b<10)
            System.out.println("false");
            else if (a+b>20)
                    System.out.println("false");
                else System.out.println("true");
    }
    public static void checkNumber (){ int a = 0;
        if (a < 0)
            System.out.println("Отрицательное число");
        else
            System.out.println("Положительное число");


    }
    public static boolean checkNumberNew ( ) { int a=-3 ;
        if (a < 0) {
            return true;
        } else {
            return false;
        }


    }
    public static void printWord ()  { int count = 5; String word = "Hello";
        for ( int i=1; i <= count; i++ )
            System.out.println("String #" + i + ":" + word );
    }
    }








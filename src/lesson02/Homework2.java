package lesson02;
// Minaev Roman

public class Homework2 {
    public static void main(String[] args) {
        checkSum() ;
        checkNumber();

    }
    public static void checkSum (){ int a = -7;
        int b =6;
        if (a+b<10)
            System.out.println("false");
            else if (a+b>20)
                    System.out.println("false");
                else System.out.println("true");
    }
    public static void checkNumber (){ int a = -3;
        if (a < 0)
            System.out.println("Отрицательное число");
        else
            System.out.println("Положительное число");


    }
}

    

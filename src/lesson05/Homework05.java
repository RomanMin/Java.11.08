package lesson05;

public class Homework05 {

    public static void main(String[] args) {
        Worker firstWorker = new Worker("Name1", "Programmer", "email@1mail.com", "5677", 3000, 46);

        System.out.println("Worker's data");

        firstWorker.printData();

        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("newName1", "Manager1", "email1@emai.com", "12341", 1000, 40);
        persArray[1] = new Worker("newName2", "Manager2", "email2@emai.com", "12342", 2000, 32);
        persArray[2] = new Worker("newName3", "Manager3", "email3@emai.com", "12343", 3000, 43);
        persArray[3] = new Worker("newName4", "Manager4", "email4@emai.com", "12344", 4000, 34);
        persArray[4] = new Worker("newName5", "Manager5", "email5@emai.com", "12345", 5000, 45);

        System.out.println("Worker's age");

        for (int i = 0; i < persArray.length; i++) {

            if (persArray[i].age > 40) {

                System.out.println(persArray[i].age);
            }
        }

    }


}
package lesson05;

public class Worker {

    String fullName;
    String post;
    String eMail;
    String phoneNumber;
    int salary;
    int age;

    public Worker(String fullName, String post, String eMail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    public void printData() {
        System.out.println(Worker.this.fullName + " " +Worker.this.post + " " + Worker.this.eMail + " " + Worker.this.phoneNumber + " " + Worker.this.salary + " " + Worker.this.age);


    }
}

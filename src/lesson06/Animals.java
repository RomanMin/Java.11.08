package lesson06;

public abstract class Animals {

    String type;
    String name;
    String color;
    int runDist;
    int swimDist;

   public static int animalsCount = 0;
   public static int fullDist = 1000;
   public static int curDistanse;


   Animals(String type, String name, String color, int runDist, int swimDist) {

        this.type = type;
        this.name = name;
        this.color = color;
        this.runDist = runDist;
        this.swimDist = swimDist;


    }

    public void run() {

        System.out.println(color + " " + type +  " " + name + " бежит на " + runDist + " метров");
        System.out.println("До конца дистанции осталось " + curDistanse + " метров");
    }

    public void swim() {

        System.out.println(color + " " + type +  " " + name + " плывет на  " + swimDist + " метров");
    }
    public void count() {
        System.out.println("Всего Животных :" + animalsCount);
    }

    public void distCount () {curDistanse = (fullDist-this.runDist);}
}






package Lesson01;

public class Team {
    private String teamName;
    private String memberName;
    int curentDistanse;
    final int maxDistanse = 1000;

    public Team(String teamName, String memberName, int curentDistanse) {
        this.teamName = teamName;
        this.memberName = memberName;
        this.curentDistanse = curentDistanse;
    }


    public void printData(){
        System.out.println(Team.this.teamName + " " + Team.this.memberName + " " + Team.this.curentDistanse);

    }






}
/*
    название команды;
    массив из четырех участников — в конструкторе можно сразу всех участников указывать);
        метод для вывода информации о членах команды, прошедших дистанцию;
        метод вывода информации обо всех членах команды.
*/

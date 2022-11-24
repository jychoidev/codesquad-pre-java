package week4_mission1.membership;

public class Member {

    private int id; //고객 아이디
    private String name; //고객 이름
    private GRADE grade; //고객 등급

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + "님의 아이디는 " + id + "이고 등급은 " + grade + "입니다.";
    }

    public int getId() {
        return id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public GRADE getGrade() {
//        return grade;
//    }

}




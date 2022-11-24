package week4_mission1.question1;

import week4_mission1.membership.GRADE;
import week4_mission1.membership.Member;

import java.util.ArrayList;

public class MemberShipMangementList {

    private final ArrayList<Member> memberList;

    public MemberShipMangementList() {
        memberList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        memberList.add(new Member(id, name, grade));
    }

    public boolean removeMember(int id) {
        for(Member member : memberList) {
            if(member.getId() == id) {
                memberList.remove(member);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 맴버가 없습니다");
        return false;
    }

    public void showAllMember() {
        System.out.println("===================================");
        for(Member member : memberList) {
            System.out.println(member);
        }
        System.out.println("===================================");

    }





}

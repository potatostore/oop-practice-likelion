package level2;

import level1.Member;

public class Main {
    public static void main(String[] args) {
        BabyLion babyLion = new BabyLion("철수");
        Staff staff = new Staff("영희");
        Leader leader = new Leader("민석");

        System.out.printf(babyLion.getRole());
        System.out.printf(staff.getRole());
        System.out.printf(leader.getRole());

        babyLion.doTask();
        staff.doTask();
        leader.doTask();

        String question = babyLion.askQuestion();
        System.out.printf(question);
        staff.feedback(question);
        leader.communicate();
    }
}
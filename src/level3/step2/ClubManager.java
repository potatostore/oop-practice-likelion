package level3.step2;

import level1.Member;
import level2.*;

public class ClubManager {

    public void startActivities(Member[] members) {
        for (Member member : members) {
            System.out.println(member.getName() + " / 역할 : " + member.getRole());

            member.doTask();

            System.out.println("-------------------");
        }
    }

    public void submitAssignments(Member[] members) {
        for (Member member : members) {
            if(member instanceof BabyLion){
                member.submitAssignment();
            }
        }
    }
}

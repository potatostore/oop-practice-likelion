package level3.step1;

import level1.Member;
import level2.*;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new BabyLion("김씨");
        members[1] = new Staff("이씨");
        members[2] = new Leader("최씨");

        IfElseClubManager manager = new IfElseClubManager();

        manager.startActivities(members);
        manager.submitAssignments(members);
    }
}

package level3.step2;

import level1.Member;
import level2.*;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new BabyLion("김씨");
        members[1] = new Leader("이씨");
        members[2] = new Staff("최씨");

        ClubManager manager = new ClubManager();

        manager.startActivities(members);
        manager.submitAssignments(members);
    }
}

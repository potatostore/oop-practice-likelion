package level3.step2;

import level1.Member;
import level2.*;

public class Main {
    public static void main(String[] args) {
        // TODO: Member 타입 배열 members를 선언하고, BabyLion, Staff, Leader 객체를 담아보세요.
        Member[] members = new Member[3];
        members[0] = new BabyLion("김씨");
        members[1] = new Leader("이씨");
        members[2] = new Staff("박씨");

        // TODO: ClubManager 객체를 생성 후 해당 객체의 메서드를 활용하여 예시 코드 완성하기
        ClubManager manager = new ClubManager();

        manager.startActivities(members);
        manager.submitAssignments(members);
    }
}

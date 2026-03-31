package level3.step1;

import level1.Member;
import level2.BabyLion;
import level2.Leader;
import level2.Staff;

public class IfElseClubManager {
    public void startActivities(Member[] members) {
        for (Member member : members) {
            // TODO: "<이름> / 역할: <역할>" 형식으로 출력하세요.
            System.out.println(member.getName() + " / 역할: " + member.getRole());

            // TODO: if-else 또는 instanceof를 사용해서 타입을 구분하고, 각 타입에 맞는 활동 메시지를 "직접" 출력하세요.
            // BabyLion  -> "<이름>님은 세션을 듣고 학습합니다."
            // Staff     -> "<이름>님은 세션 자료를 준비하고 발표를 진행합니다."
            // Leader    -> "<이름>님은 운영 현황을 파악하고 방향을 조율합니다."
            if(member instanceof BabyLion){
                System.out.println(member.getName() + "님은 세션을 듣고 학습합니다.");
            }
            else if(member instanceof Leader){
                System.out.println(member.getName() + "님은 세션 자료를 준비하고 발표를 진행합니다.");
            }
            else{
                System.out.println(member.getName() + "님은 운영 현황을 파악하고 방향을 조율합니다.");
            }

            System.out.println("-------------------");
        }
    }

    public void submitAssignments(Member[] members) {
        for (Member member : members) {
            // TODO: BabyLion 타입인 경우에만 submitAssignment()를 호출하세요.
            if(member instanceof BabyLion){
                member.submitAssignment();
            }
        }
    }
}

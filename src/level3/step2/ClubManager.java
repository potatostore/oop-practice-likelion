package level3.step2;
public class ClubManager {

    public void startActivities(Member[] members) {
        for (Member member : members) {
            // TODO: "<이름> / 역할: <역할>" 형식으로 출력하세요.

            // TODO: 타입을 구분하지 말고, 공통 메서드 doTask()를 호출하세요.

            System.out.println("-------------------");
        }
    }

    public void submitAssignments(Member[] members) {
        for (Member member : members) {
            // TODO: BabyLion 타입인 경우에만 submitAssignment()를 호출하세요.
            // 힌트: 이번 단계의 핵심 흐름은 다형성으로 처리하되, 꼭 필요한 경우에만 instanceof를 제한적으로 사용합니다.
        }
    }
}

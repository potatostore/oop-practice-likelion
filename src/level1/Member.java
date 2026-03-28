package level1;

public class Member {

    // TODO: 캡슐화에 적절한 접근 제어자를 사용하세요.
    String name;
    boolean assignmentSubmitted;

    public Member(String name) {
        // TODO: name이 null이거나, 빈 문자열이거나, 공백만 있는 문자열이면 IllegalArgumentException 예외를 발생시키세요.

        this.name = name;
        this.assignmentSubmitted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAssignmentSubmitted() {
        return assignmentSubmitted;
    }

    public void submitAssignment() {
        // TODO: 과제 제출 로직을 작성하세요.
    }

    // TODO: getRole(), doTask()를 추상 메서드로 선언하세요.

}
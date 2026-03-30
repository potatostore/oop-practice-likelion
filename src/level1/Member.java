package level1;

public abstract class Member {
    private String name;
    private boolean assignmentSubmitted;

    public Member(String name) {
        // TODO: name이 null이거나, 빈 문자열이거나, 공백만 있는 문자열이면 IllegalArgumentException 예외를 발생시키세요.
        String compName = name.replace(" ", "");
        if(compName == null || compName.isEmpty()){
            throw new IllegalArgumentException("이름은 비어 있을 수 없습니다.");
        }

        this.name = name;
        this.assignmentSubmitted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAssignmentSubmitted(boolean assignmentSubmitted) {
        this.assignmentSubmitted = assignmentSubmitted;
    }

    public boolean getAssignmentSubmitted() {
        return assignmentSubmitted;
    }

    public void submitAssignment() {
        // TODO: 과제 제출 로직을 작성하세요.
    }

    // TODO: getRole(), doTask()를 추상 메서드로 선언하세요.
    public abstract
}
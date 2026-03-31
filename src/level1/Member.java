package level1;

public abstract class Member {
    private String name;
    private boolean assignmentSubmitted;

    public Member(String name) {
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
        if(!assignmentSubmitted){
            assignmentSubmitted = true;
            System.out.printf(this.name + "님이 과제를 제출하였습니다.");
        }
        else{
            System.out.printf(this.name + "님은 이미 과제를 제출했습니다.");
        }
    }

    public abstract String getRole();
    public abstract void doTask();
}
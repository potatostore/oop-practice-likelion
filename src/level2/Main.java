package level2;

public class Main {
    public static void main(String[] args) {
        BabyLion babyLion = new BabyLion("철수");
        Staff staff = new Staff("영희");
        Leader leader = new Leader("민석");

        // TODO: README.md의 예시 실행 결과 형식 참고하여 출력 코드 작성해보기
        System.out.printf(babyLion.getRole());
        System.out.printf(staff.getRole());
        System.out.printf(leader.getRole());

        System.out.printf(babyLion.doTask());
        System.out.printf(staff.doTask());
        System.out.printf(leader.doTask());

        System.out.printf(babyLion.askQuestion());
        System.out.printf(staff.feedback());
        System.out.printf(leader.communicate());
    }
}
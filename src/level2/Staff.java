package level2;

import level1.Member;

public class Staff extends Member{

    public Staff(String name) {
        // TODO: 부모 클래스 Member의 생성자를 호출하세요.
        super(name);
    }

    // TODO: getRole()을 활용하여 "운영진"을 반환하는 메서드 구현하기
    @Override
    public String getRole(){
        return "운영진";
    }

    // TODO: doTask()를 활용하여 "<이름>님은 세션 자료를 준비하고 발표를 진행합니다."를 출력하는 메서드 구현하기
    public void doTask(){
        System.out.printf(super.getName() + "님은 세션 자료를 준비하고 발표를 진행합니다.");
    }

    // TODO: 역할을 더 잘 드러내는 메서드 추가해보기
    public void feedback(String question){
        System.out.printf(question + "에 대한 피드백");
    }
}
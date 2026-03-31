package level2;

import level1.Member;

public class Staff extends Member{

    public Staff(String name) {
        super(name);
    }

    @Override
    public String getRole(){
        return "운영진";
    }

    public void doTask(){
        System.out.printf(super.getName() + "님은 세션 자료를 준비하고 발표를 진행합니다.");
    }

    public void feedback(String question){
        System.out.printf(question + "에 대한 피드백");
    }
}
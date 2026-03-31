package level2;

import level1.Member;

public class BabyLion extends Member {

    public BabyLion(String name) {
        super(name);
    }

    @Override
    public String getRole(){
        return "아기사자";
    }

    public void doTask(){
        System.out.printf(super.getName() + "님은 세션을 듣고 학습합니다.");
    }

    public String askQuestion(){
        return "질문";
    }
}
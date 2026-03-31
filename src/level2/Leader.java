package level2;

import level1.Member;

public class Leader extends Member {

    public Leader(String name) {
        super(name);
    }

    @Override
    public String getRole(){
        return "대표";
    }

    public void doTask(){
        System.out.printf(super.getName() + "님은 운영 현황을 파악하고 방향을 조율합니다.");
    }

    public void communicate(){
        System.out.printf("외부와 소통하기");
    }
}
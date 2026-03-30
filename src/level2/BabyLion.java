package level2;

public class BabyLion extends Member{

    public BabyLion(String name) {
        super(name);
    }

    // TODO: getRole()을 활용하여 "아기사자"를 반환하는 메서드 구현하기
    @override
    public String getRole(){
        return "아기사자";
    }

    // TODO: doTask()를 활용하여 "<이름>님은 세션을 듣고 학습합니다."를 출력하는 메서드 구현하기
    public void doTask(){
        System.out.printf(super.name + "님은 세션을 듣고 학습합니다.");
    }

    // TODO: 역할을 더 잘 드러내는 메서드 추가해보기
    public String askQuestion(){
        return "질문";
    }
}
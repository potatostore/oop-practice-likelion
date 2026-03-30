package level2;

public class Leader extends Member {

    public Leader(String name) {
        // TODO: 부모 클래스 Member의 생성자를 호출하세요.
        super(name);
    }

    // TODO: getRole()을 활용하여 "대표"를 반환하는 메서드 구현하기
    @override
    public String getRole(){
        return "대표";
    }

    // TODO: doTask()를 활용하여 "<이름>님은 운영 현황을 파악하고 방향을 조율합니다."를 출력하는 메서드 구현하기
    public void doTask(){
        System.out.printf(super.name + "님은 운영 현황을 파악하고 방향을 조율합니다.");
    }

    // TODO: 역할을 더 잘 드러내는 메서드 추가해보기
    public void communicate(){
        System.out.printf("외부와 소통하기");
    }
}
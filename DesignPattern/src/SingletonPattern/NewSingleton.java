package SingletonPattern;

public class NewSingleton {

    private String adminName;
    private int adminAge;

    private static NewSingleton instance = new NewSingleton();

    private NewSingleton() {
        adminName = "Diger";
        adminAge = 24;
    }

    // Old 방식은 멀티쓰레드 환경에서의 문제 때문에
    // static 변수에 아예 생성자로 인스턴스를 받아놓고 그 값을 리턴한다.
    public static NewSingleton getInstance() {
        return instance;
    }

    public void testMessage() {
        System.out.println("This Instance Is NewSingleton!!!!!!");
    }
}

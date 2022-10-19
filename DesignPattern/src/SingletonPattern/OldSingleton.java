package SingletonPattern;

public class OldSingleton {

    private String adminName;
    private int adminAge;
    private static OldSingleton oldInstance;

    private OldSingleton() {
        adminName = "Diger";
        adminAge = 24;
    }

    // 멀티 쓰레드 환경이면, 각 쓰레드들이 동시에 접근하게 되면 여러 인스턴스가 생성되게 된다.
    public static OldSingleton getInstance() {
        if (oldInstance == null) {
            oldInstance = new OldSingleton();
        }
        return oldInstance;
    }
}


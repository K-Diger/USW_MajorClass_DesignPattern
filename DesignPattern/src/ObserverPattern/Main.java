package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        AldarisImpl observerImpl = new AldarisImpl();

        Zealot zealot1 = new RealZealot();
        Zealot zealot2 = new RealZealot();
        Zealot zealot3 = new RealZealot();

        observerImpl.subscribe(zealot1);
        observerImpl.subscribe(zealot2);
        observerImpl.subscribe(zealot3);

        observerImpl.detectZealotHP();
        System.out.println();
        observerImpl.detectZealotShield();
        System.out.println("----------------------------------------------------");

        observerImpl.unsubscribe(zealot1);
        observerImpl.detectZealotHP();
        System.out.println();
        observerImpl.detectZealotShield();
    }
}

package ObserverPattern;

public class RealZealot implements Zealot{
    @Override
    public void update(String message) {
        System.out.println("Aldaris 에게 수신 : " + message);
    }
}

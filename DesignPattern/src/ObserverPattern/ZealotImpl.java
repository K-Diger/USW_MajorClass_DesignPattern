package ObserverPattern;

public class ZealotImpl implements Zealot{
    @Override
    public void update(String message) {
        System.out.println("Aldaris 에게 수신 : " + message);
    }
}

package ObserverPattern;

public interface Aldaris {
    void subscribe(Zealot zealot);
    void unsubscribe(Zealot zealot);
    void notifyZealot(String message);
}

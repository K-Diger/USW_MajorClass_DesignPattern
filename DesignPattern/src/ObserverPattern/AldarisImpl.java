package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class AldarisImpl implements Aldaris {

    private List<Zealot> zealots = new ArrayList<>();

    public void detectZealotHP() {
        notifyZealot("질럿의 체력이 변동되었습니다.");
    }

    public void detectZealotShield() {
        notifyZealot("질럿의 쉴드량이 변동되었습니다.");
    }

    @Override
    public void subscribe(Zealot zealot) {
        zealots.add(zealot);
    }

    @Override
    public void unsubscribe(Zealot zealot) {
        zealots.remove(zealot);
    }

    @Override
    public void notifyZealot(String message) {
        zealots.forEach(zealot -> zealot.update(message));
    }
}

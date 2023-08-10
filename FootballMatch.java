package FootballReport;

import java.util.ArrayList;
import java.util.List;

public class FootballMatch {
    private String score;
    private List<MatchObserver> observers = new ArrayList<>();

    public void addObserver(MatchObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MatchObserver observer) {
        observers.remove(observer);
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }

    private void notifyObservers() {
        for (MatchObserver observer : observers) {
            observer.update(score);
        }
    }
}

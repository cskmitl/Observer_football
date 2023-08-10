package FootballReport;

public class DisplayMatchResult implements MatchObserver {
    @Override
    public void update(String score) {
        System.out.println("live result: " + score);
    }
}

package rockscissorpaper.outcome;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edward Yue Shung Wong
 */
public class OutcomeCalculator {

    private Map<String, Map<String, String>> outcomes = new HashMap<>();

    public OutcomeCalculator() {
        HashMap<String, String> rockOutcomes = new HashMap<>();
        rockOutcomes.put("rock", "draw");
        rockOutcomes.put("paper", "loss");
        rockOutcomes.put("scissors", "win");
        outcomes.put("rock", rockOutcomes);

        HashMap<String, String> paperOutcomes = new HashMap<>();
        paperOutcomes.put("rock", "win");
        paperOutcomes.put("paper", "draw");
        paperOutcomes.put("scissors", "loss");
        outcomes.put("paper", paperOutcomes);

        HashMap<String, String> scissorsOutcome = new HashMap<>();
        scissorsOutcome.put("rock", "loss");
        scissorsOutcome.put("paper", "win");
        scissorsOutcome.put("scissors", "draw");
        outcomes.put("scissors", scissorsOutcome);
    }

    public String plays(String firstMove, String secondMove) {
        String outcome = outcomes.get(firstMove).get(secondMove);
        switch (outcome) {
            case "win":
                return "P1 WIN";
            case "loss":
                return "P2 WIN";
            default:
                return "draw";
        }
    }
}

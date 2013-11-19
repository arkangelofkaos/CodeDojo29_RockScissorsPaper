package codedojo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edward Yue Shung Wong
 */
public class RockScissorPaperMoveOutcome {

    private Map<String, Map<String, String>> outcomes = new HashMap<String, Map<String, String>>();

    public RockScissorPaperMoveOutcome() {
        HashMap<String, String> rockOutcomes = new HashMap<String, String>();
        rockOutcomes.put("paper", "loss");
        outcomes.put("rock", rockOutcomes);

        HashMap<String, String> paperOutcomes = new HashMap<String, String>();
        paperOutcomes.put("rock", "win");
        outcomes.put("paper", paperOutcomes);
    }

    public String plays(String firstMove, String secondMove) {
        return outcomes.get(firstMove).get(secondMove);
    }
}

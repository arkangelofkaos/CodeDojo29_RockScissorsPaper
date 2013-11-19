import rockscissorpaper.outcome.OutcomeCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Edward Yue Shung Wong
 */
@RunWith(Parameterized.class)
public class OutcomeCalculatorTest {

    private OutcomeCalculator outcomeCalculator;

    private String firstMove;
    private String secondMove;
    private String outcome;

    @Before
    public void setUp() throws Exception {
        outcomeCalculator = new OutcomeCalculator();
    }

    public OutcomeCalculatorTest(String firstMove, String secondMove, String outcome) {
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.outcome = outcome;
    }

    @Test
    public void winnerOfRockVsPaperIsLoss() throws Exception {
        assertThat(outcomeCalculator.plays(firstMove, secondMove), is(outcome));
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {"rock", "paper", "P2 WIN"},
                {"rock", "rock", "draw"},
                {"rock", "scissors", "P1 WIN"},
                {"paper", "rock", "P1 WIN"},
                {"paper", "paper", "draw"},
                {"paper", "scissors", "P2 WIN"},
                {"scissors", "rock", "P2 WIN"},
                {"scissors", "paper", "P1 WIN"},
                {"scissors", "scissors", "draw"}
        });
    }
}

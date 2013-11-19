import codedojo.RockScissorPaperMoveOutcome;
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
public class RockScissorPaperMoveOutcomeTest {

    private RockScissorPaperMoveOutcome rockScissorPaperMoveOutcome;

    private String firstMove;
    private String secondMove;
    private String outcome;

    @Before
    public void setUp() throws Exception {
        rockScissorPaperMoveOutcome = new RockScissorPaperMoveOutcome();
    }

    public RockScissorPaperMoveOutcomeTest(String firstMove, String secondMove, String outcome) {
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.outcome = outcome;
    }

    @Test
    public void winnerOfRockVsPaperIsLoss() throws Exception {
        assertThat(rockScissorPaperMoveOutcome.plays(firstMove, secondMove), is(outcome));
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {"rock", "paper", "loss"},
                {"paper", "rock", "win"},
        });
    }
}

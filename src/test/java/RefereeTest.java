import codedojo.Referee;
import codedojo.Result;
import org.junit.Test;

public class RefereeTest {

    private final Referee referee = new Referee();

    @Test
    public void test_that_play_returns_a_result_for_a_round() {
        Result result = referee.play();
    }
}

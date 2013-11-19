import org.junit.Before;
import org.junit.Test;
import rockscissorpaper.outcome.OutcomeCalculator;
import rockscissorpaper.player.Player;
import rockscissorpaper.referee.Referee;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RefereeTest {

    private Referee referee;

    private Player rockPlayer;
    private Player scissorsPlayer;

    private OutcomeCalculator outcomeCalculator;

    @Before
    public void setUp() throws Exception {
        outcomeCalculator = mock(OutcomeCalculator.class);
        referee = new Referee(null, outcomeCalculator);

        rockPlayer = mock(Player.class);
        when(rockPlayer.getMove()).thenReturn("rock");

        scissorsPlayer = mock(Player.class);
        when(scissorsPlayer.getMove()).thenReturn("scissors");
    }

    @Test
    public void refereePlayingRockAgainstScissorsResultsInPlayerOneWin() {
        when(outcomeCalculator.plays("rock", "scissors")).thenReturn("P1 WIN");
        assertEquals(referee.play(rockPlayer, scissorsPlayer), "P1 WIN");
    }
}

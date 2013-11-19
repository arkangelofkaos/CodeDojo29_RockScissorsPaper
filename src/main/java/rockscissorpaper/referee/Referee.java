package rockscissorpaper.referee;

import rockscissorpaper.outcome.OutcomeCalculator;
import rockscissorpaper.player.Player;
import rockscissorpaper.player.PlayerMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Referee extends HttpServlet {

    private PlayerMap playerMap;
    private OutcomeCalculator outcomeCalculator;

    public Referee(PlayerMap playerMap, OutcomeCalculator outcomeCalculator) {
        this.playerMap = playerMap;
        this.outcomeCalculator = outcomeCalculator;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Player playerOne = playerMap.getPlayerFor(req.getParameter("p1"));
        Player playerTwo = playerMap.getPlayerFor(req.getParameter("p2"));
        resp.getWriter().write(play(playerOne, playerTwo));
    }

    public String play(Player playerOne, Player playerTwo) {
        return outcomeCalculator.plays(playerOne.getMove(), playerTwo.getMove());
    }
}

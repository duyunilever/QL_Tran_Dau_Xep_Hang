import entity.Figure;
import entity.SummonRift;
import entity.Team;
import handle.FigureHandle;
import handle.TeamHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Team>teams = new ArrayList<>();
        TeamHandle teamHandle = new TeamHandle();
        for (int i = 0; i < 2; i++) {
            Team team = teamHandle.inputTeam(scanner);
            teams.add(team);
        }
        SummonRift summonRift = new SummonRift(teams);
        System.out.println(summonRift);
    }
}
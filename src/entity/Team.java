package entity;

import java.util.ArrayList;

public class Team {
    private String nameTeam;
    private ArrayList<Figure> figures;

    public Team(String nameTeam, ArrayList<Figure> figures) {
        this.nameTeam = nameTeam;
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameTeam='" + nameTeam + '\'' +
                ", figures=" + figures +
                '}' + "\n";
    }
}

package handle;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team inputTeam(Scanner scanner){
        System.out.println("Mời bạn nhập tên Team: ");
        String nameTeam = scanner.nextLine();

        FigureHandle figureHandle = new FigureHandle();
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Figure figure = figureHandle.inputFigure(scanner, i);
            figures.add(figure);
        }
        return new Team(nameTeam, figures);
    }
}

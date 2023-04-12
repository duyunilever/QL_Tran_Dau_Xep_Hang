package handle;

import entity.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class FigureHandle {
    public Figure inputFigure(Scanner scanner, int i){
            System.out.println("Nhập tên tướng" + (i+1));
            String nameFigure = scanner.nextLine();
            System.out.println("Nhập vị trí: ");
            String position= scanner.nextLine();
        return new Figure(nameFigure, position);
    }
}

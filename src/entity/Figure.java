package entity;

public class Figure {
    private String nameFigure;
    private String position;

    public Figure(String nameFigure, String position) {
        this.nameFigure = nameFigure;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "nameFigure='" + nameFigure + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

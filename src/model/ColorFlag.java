package model;

public class ColorFlag {

    private String color;
    private int vertical;
    private int horizontal;
    private int savePosition;
    private int width;
    private int height;

    public ColorFlag(String color, int vertical, int horizontal, int savePosition, int width, int height) {
        this.color = color;
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.savePosition = savePosition;
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setVerticalPosition() {
        this.vertical = savePosition;
    }

    public int getVertical() {
        return this.vertical;
    }

    public int getHorizontal() {
        return this.horizontal;
    }

    public int getSavePosition() {
        return this.savePosition;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void avanceVertical() {
        vertical++;
    }

    public void avanceHorizontal() {
        horizontal++;
    }

}

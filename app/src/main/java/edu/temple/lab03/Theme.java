package edu.temple.lab03;

public class Theme {

    private final String name;
    private final int image;

    public Theme(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public int getResource() {
        return this.image;
    }
}

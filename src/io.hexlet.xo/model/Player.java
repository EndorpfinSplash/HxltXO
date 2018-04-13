package io.hexlet.xo.model;

public class Player {
    final private String name;
    final private Figure figure;

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}

package com.depth.packplayers;
public class Card {
    private String name;
    private int imageResource;

    public Card(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}

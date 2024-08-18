package leetcode50;

import java.awt.Color;
import java.util.HashMap;

class Grape {
    private Color color;
    private int size;

    public Grape(Color color, int size) {
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<String, Grape> grapes = new HashMap<>();
        grapes.put("grape1", new Grape(Color.BLUE, 2));
        grapes.put("grape2", new Grape(Color.WHITE, 4));
        grapes.put("grape3", null);

        Grape grape = grapes.get("grape3");
        if (grape != null) {
            var color = grape.getColor();
            System.out.println("Color: " + color);
        } else {
            System.out.println("Grape3 is null");
        }
    }
}

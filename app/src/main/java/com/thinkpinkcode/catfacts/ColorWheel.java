package com.thinkpinkcode.catfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    private String[] colors = {
            "#397367",
            "#5DA399",
            "#63CCCA",
            "#C4AF9A",
            "#CB04A5",
            "#E0CA3C",
            "#F7BFB4",
            "#FB9F89",
            "#FFB86F"
    };

    int getColor() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}

package com.thinkpinkcode.catfacts;

import java.util.Random;

public class ColorWheel {

    private String[] colors = {
            "#397367",
            "#5DA399",
            "#63CCCA",
            "#C4AF9A",
            "#CB04A5",
            "#D7F2BA",
            "#E0CA3C",
            "#F7BFB4",
            "#FB9F89",
            "#FFB86F"
    };

    String getColor() {
        Random randomgenerator = new Random();
        int randomNumber = randomgenerator.nextInt(colors.length);
        return colors[randomNumber];
    }
}

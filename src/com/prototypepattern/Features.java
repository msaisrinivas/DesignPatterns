package com.prototypepattern;

public class Features {

    private boolean bold;
    private String bg_colour;
    private String font;
    private int font_size;

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public String getBg_colour() {
        return bg_colour;
    }

    public void setBg_colour(String bg_colour) {
        this.bg_colour = bg_colour;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }
}

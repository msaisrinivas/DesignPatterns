package com.prototypepattern;



public class TextBox implements Cloneable{
    private String textbox_name;
    Features fe = new Features();

    public String getTextbox_name() {
        return textbox_name;
    }

    public void setTextbox_name(String textbox_name) {
        this.textbox_name = textbox_name;
    }

    public Features getFe() {
        return fe;
    }

    public void setFe(Features fe) {
        this.fe = fe;
    }

    public void loadFeatures(){
        Features f= new Features();
        f.setBold(true);
        f.setBg_colour("Gray");
        f.setFont("calibary");
        f.setFont_size(15);
        this.setFe(f);
    }

    @Override
    public String toString() {
        return "textbox{" +
                "textbox_name=" + textbox_name +
                ", bold=" + fe.isBold() +
                ", background colour=" + fe.getBg_colour() +
                ", font=" + fe.getFont() +
                ", font size=" + fe.getFont_size() +
                '}';
    }

    @Override
    protected TextBox clone() throws CloneNotSupportedException {
        TextBox tbox = new TextBox();
        Features fet = new Features();
        fet.setBold(this.fe.isBold());
        fet.setBg_colour(this.fe.getBg_colour());
        fet.setFont(this.fe.getFont());
        fet.setFont_size(this.fe.getFont_size());
        tbox.setFe(fet);
        return tbox;
    }
}

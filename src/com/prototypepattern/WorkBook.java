package com.prototypepattern;

public class WorkBook {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        TextBox tb = new TextBox();
        tb.setTextbox_name("First Text Box");
        tb.loadFeatures();
        System.out.println(tb);

        TextBox tb1 = tb.clone();
        tb1.setTextbox_name("Secound Text Box");
        System.out.println(tb1);

        /* Just to show it's not a shallow clone. And it's a deep clone.*/
        Features fe= tb.getFe();
        fe.setFont_size(10);
        System.out.println(tb);

        System.out.println(tb1);
    }
}

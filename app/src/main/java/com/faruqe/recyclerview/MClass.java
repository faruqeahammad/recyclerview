package com.faruqe.recyclerview;

public class MClass {

    private int imageview;
    private String textview1;
    private String textview2;
    private String textview3;
    //new code
    private String sl;

    MClass (int imageview ,String textview1,String textview2,String textview3,String divider)
    {
        this.imageview=imageview;
        this.textview1=textview1;
        this.textview2=textview2;
        this.textview3=textview3;
        this.sl=divider;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getDivider()
    {
        return sl;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textview3;
    }

}
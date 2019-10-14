package com.example.li_ux_algorithm_2_3;

public class CollegeStudent extends Student {
    private String marjor;
    protected int id;
    protected String name;

    public CollegeStudent(int id, String name, String marjor) {
        this.marjor = marjor;
        this.id = id;
        this.name = name;
    }

    public String getMarjor() {
        return marjor;
    }

    public void setMarjor(String marjor) {
        this.marjor = marjor;
    }

}





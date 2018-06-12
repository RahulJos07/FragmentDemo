package com.gps.rahul.admin.myfragmentdemo;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DemoFragClass {
    private ArrayList<String> namelist=new ArrayList<String>();

    public void frag(String txt)
    {
        namelist.add(txt);
    }

    public ArrayList getNamelist() {
        return namelist;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDandInfo {
    HashMap<String,String> list = new HashMap<String, String>();

    IDandInfo(){
        list.put("hello","hello");
        list.put("he","hello");
        list.put("hel","hello");
    }


    protected HashMap<String, String> getList() {
        return list;
    }
}

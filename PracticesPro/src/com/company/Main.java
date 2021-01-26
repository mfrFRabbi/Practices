package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDandInfo dandInfo = new IDandInfo();
        LogIn logIn = new LogIn(dandInfo.getList());
      //  System.out.println(dandInfo.list.get(0));
    }
}



package com.prestashop.demo.util;

import java.util.ArrayList;
import java.util.List;

public class TestContext {

    public static List<String> stringList = new ArrayList<>();
    public static void addToStringList(String value){
        stringList.add(value);
    }
}

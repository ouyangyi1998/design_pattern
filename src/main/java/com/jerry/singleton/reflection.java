package com.jerry.singleton;

import java.lang.reflect.Constructor;

public class reflection {
    public static void main(String[] args) {
        User3 instance =null;
        try{
            Constructor constructor=User3.class.getConstructor();
            constructor.setAccessible(true);
            instance=(User3)constructor.newInstance();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

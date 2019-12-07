package com.jerry.singleton;
/*多线程安全单例*/
public class User2 {
    private User2(){}
    private static User2 user2=null;

    public static synchronized User2 getInstance()
    {
        if(user2==null)
        {
            user2=new User2();
        }
        return user2;
    }
}

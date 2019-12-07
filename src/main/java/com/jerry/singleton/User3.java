package com.jerry.singleton;
/*双重锁单例*/
public class User3 {
    private static volatile User3 user3=null;
    private User3(){throw new InstantiationError();}
    public static User3 getInstance()
    {
        if(user3==null)
        {
            synchronized (User3.class)
            {
                if(user3==null)
                {
                    user3=new User3();
                }
            }
        }
        return user3;
    }
}

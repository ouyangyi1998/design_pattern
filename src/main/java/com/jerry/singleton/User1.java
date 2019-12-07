package com.jerry.singleton;
/*懒汉*/
public class User1 {
    private static User1 user1=null;
    private User1(){}
    public static User1 getUser1()
    {
        if(user1==null)
        {
            user1=new User1();

        }
        return user1;
    }

}

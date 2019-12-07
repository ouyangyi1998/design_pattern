package com.jerry.singleton;
/*恶汉*/
public class User {
    private static final User user=new User();
    private User(){}
    public User getUser()
    {
        return user;
    }
}

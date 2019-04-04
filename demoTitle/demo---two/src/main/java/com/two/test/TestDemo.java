package com.two.test;

import com.one.beans.User;
import org.junit.Test;

public class TestDemo {
    @Test
    public void one(){
        User user  = new User(2,"李四","男",20,90);
        System.out.println(user);
    }

}

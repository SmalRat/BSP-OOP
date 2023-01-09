package ua.edu.ucu.task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserTest {
    @Test
    public void testUserBuilder(){
        User user = User.builder().name("Oles").age(31).occupation("Teacher").build();
        Assertions.assertEquals("User(age=31, gender=null, weight=0.0, height=0.0, occupations=[Teacher])", user.toString());
        User user1 = User.builder().name("Oles").age(20).occupation("Teacher").build();
        Assertions.assertEquals("User(age=20, gender=null, weight=0.0, height=0.0, occupations=[Teacher])", user1.toString());
        User user2 = User.builder().name("Oles").age(31).age(20).age(31).build();
        Assertions.assertEquals("User(age=31, gender=null, weight=0.0, height=0.0, occupations=[])", user2.toString());
        User user3 = User.builder().name("Oles").age(31).occupation("Teacher").weight(75).build();
        Assertions.assertEquals("User(age=31, gender=null, weight=75.0, height=0.0, occupations=[Teacher])", user3.toString());
        User user4 = User.builder().name("Oles").age(31).occupation("Teacher").height(180).build();
        Assertions.assertEquals("User(age=31, gender=null, weight=0.0, height=180.0, occupations=[Teacher])", user4.toString());
    }
}

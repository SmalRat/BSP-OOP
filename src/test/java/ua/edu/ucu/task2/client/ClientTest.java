package ua.edu.ucu.task2.client;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClientTest {
    @Test
    public void clientInfoTest(){
        Client client = new Client("Oles", Sex.MALE, 31, "Oles.Dobosevych@mail.com");

        Assertions.assertEquals(0, client.getId());
        Assertions.assertEquals("Oles", client.getName());
        Assertions.assertEquals(Sex.MALE, client.getSex());
        Assertions.assertEquals(31, client.getAge());
        Assertions.assertEquals("Oles.Dobosevych@mail.com", client.getMail());
    }
}

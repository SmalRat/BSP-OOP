package ua.edu.ucu.task2.client;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Sex sex;
    @Getter @Setter
    private String mail;
    private static int count = 0;

    public Client(String name, Sex sex, int age, String mail) {
        id = count++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }
}

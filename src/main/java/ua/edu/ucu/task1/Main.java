package ua.edu.ucu.task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").age(31).gender(Gender.MALE).build();
        System.out.println(user);
    }
}
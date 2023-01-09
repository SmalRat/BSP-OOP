package ua.edu.ucu.task2.client;

import lombok.Getter;

public enum Sex{
    MALE("male"), FEMALE("female");
    @Getter
    private final String representation;
    Sex(String representation){
        this.representation = representation;
    }

}
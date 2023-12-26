package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Id;

@Getter
public class Client {
    @Id @Getter
    private int id;
    private static int idNumber = 0;
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String email;

    public Client(String name, int age, String gender) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

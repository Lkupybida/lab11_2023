package org.example.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString(callSuper = true)
@Getter
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
}

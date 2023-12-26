package org.example.task1;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@ToString(callSuper = true)
public class Student extends User{
    @Singular @Getter
    private List<Integer> grades;

    @Override
    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", grades=" + getGrades() +
                '}';
    }
}

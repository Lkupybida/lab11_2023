package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Student user = Student.builder().name("Lev")
                .age(18)
                .gender("Male")
                .weight(69)
                .height(169)
                .grade(69)
                .grade(6969)
                .build();
        System.out.println(user);
    }
}
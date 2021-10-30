package com.example.a3_11;

public class Student {
    private String name;
    private String last_name;
    private String birth_date;
    private String phone_number;


    public Student(String name, String last_name, String birth_date, String phone_number) {
        this.name = name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getPhone_number() {
        return phone_number;
    }


}

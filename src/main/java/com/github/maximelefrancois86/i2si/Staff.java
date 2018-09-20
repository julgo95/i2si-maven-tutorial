package com.github.maximelefrancois86.i2si;

import java.math.BigDecimal;
import java.util.List;

public class Staff {

    private String name;
    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

}

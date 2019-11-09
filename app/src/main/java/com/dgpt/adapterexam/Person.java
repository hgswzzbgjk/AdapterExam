package com.dgpt.adapterexam;

public class Person {
    private int icon;
    private  String name;
    private  int age;

    public Person(int icon, String name, int age) {
        this.icon = icon;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "icon=" + icon +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

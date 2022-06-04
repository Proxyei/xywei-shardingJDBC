package com.xywei.springboot;

public class Man {
    private String name;

    public Man() {
        System.out.println("无参构造方法Man");
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}

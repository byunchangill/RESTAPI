package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PutRequestDto {
    private String name;
    private int age;

    @JsonProperty("car_list")
    private List<PutCatDto> carList;

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

    public List<PutCatDto> getCarList() {
        return carList;
    }

    public void setCarList(List<PutCatDto> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}

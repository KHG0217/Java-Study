package Chepter4;

public class Manger extends Employee{
    String depart;
    public String getManager(){
        return name + " " + salary + " " + depart; // Employee에 있던 salary 와 depart 변수
    }

}

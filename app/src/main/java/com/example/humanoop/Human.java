package com.example.humanoop;

import android.util.Log;

public class Human {
    private String name;
    public int age;
    public int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        Log.d("Human","I am eating food");
    }
    public void sleep(){
        Log.d("Human","ZZZZZZZZ");
    }
    public  void sleep (int hours) {
         Log.d("Human", "am sleeping for"  +  hours +" "+"hours");
         //return hours;

    }
    public String speak(String speak) {
        Log.d("Human", "how are you");
        return speak;

    }
    public int birthday(){
        age=age+1;
        return age;

    }

}

        //public String speech() {

        // Log.d("Human", "how is the going so far");
        //  return String;




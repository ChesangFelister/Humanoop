package com.example.humanoop;

import android.util.Log;

public class Anna  extends Human {
    private int height;

    public Anna(String name, int age, int weight) {
        super(name, age, weight);

    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight=weight +2;
        Log.d("Anna"," I am eating and i am now "+ weight +" " +"kg");
    }

    @Override
    public int birthday() {
        age=age+4;
        Log.d("Anna","Happy birthday you are now "+age+" "+"years");
        return age;
//        super.birthday();
    }
}

//    public int Height(int Height) {
//        height=height;
//        return Height;
//    }
//
//    public void setHeightt (int height){
//        this.height=height;
//    }
//    public void eat(){






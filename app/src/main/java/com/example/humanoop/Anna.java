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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
    int weight=  getWeight();
      weight+=2;
      setWeight(weight);

    }

    @Override
    public void birthday() {
       int age= getAge();
        age=age+4;
        setAge(age);


//       super.birthday();
  }
}

////    public int Height(int Height) {
////        height=height;
////        return Height;
////    }
////
////    public void setHeightt (int height){
////        this.height=height;
////    }
////    public void eat(){






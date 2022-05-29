package com.company;
import java.util.Random;

public class MSwimmer extends Person{
    private int jersyNum;


    public MSwimmer(String name, int age, int jersyNum) {
        super(name, age);
        this.jersyNum = jersyNum;
    }

    public double freestyleStroke(int meters){
        Random rand = new Random();
        int randomInt =11;
        double random= rand.nextDouble(randomInt);
        double time=meters/random ;
        return time;

    }
    public double breastStroke(int meters){
        Random rand = new Random();
        int randomInt =11;
        double random= rand.nextDouble(randomInt);
        double time=meters/(random-1) ;
        return time;

    }
    public double butterflyStroke(int meters){
        Random rand = new Random();
        int randomInt =11;
        double random= rand.nextDouble(randomInt);
        double time=meters/(random*2) ;
        return time;

    }
    public double  backstroke(int meters){
        Random rand = new Random();
        int randomInt =11;
        double random= rand.nextDouble(randomInt);
        double time=meters/(random*2) ;
        return time;

    }

    public void warmUp(){


    }
}


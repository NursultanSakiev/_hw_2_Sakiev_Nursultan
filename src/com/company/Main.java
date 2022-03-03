package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( homeWork(22, 15));
        System.out.println( homeWork(25, 17));
        System.out.println( homeWork(25, 33));
        System.out.println( homeWork(18, 33));
        System.out.println( homeWork(45, 0));
        System.out.println(homeWork(generateRandomAge(),22));
        System.out.println(generateRandomAge());
    }
    public static String homeWork (int ageOfMan,int temperature) {
        if (ageOfMan > 20 && ageOfMan < 45 && temperature > -20 && temperature < 30) {
            String walk = "можно идти гулять!";
            return walk;
        } else if (ageOfMan < 20 && temperature > 0 && temperature < 28) {
            String walk = "можно идти гулять!";
            return walk;


        } else if (ageOfMan > 45 && temperature > -10 && temperature < 25) {
            String walk = "можно идти гулять!";
            return walk;
        } else {
            String walk =("оставайтесь дома");
            return walk;}
    } public static int generateRandomAge(){
        Random random=new Random();
        int red=random.nextInt(70);
        return red;
    }

}


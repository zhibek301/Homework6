package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Magical m1 = new Magical();
        Mental mt1 = new Mental();

        System.out.println(w1.superPower());
        System.out.println(m1.superPower());
        System.out.println(mt1.superPower());
    }
}



package com.company;

public class Warrior extends Player  {
    private int superDamage;

    public int getSuperDamage() {
        return superDamage;
    }

    public void setSuperDamage(int superDamage) {
        this.superDamage = superDamage;
    }



    public String superPower() {
        String s1 = "Смертельный удар";
        return s1;
    }
}
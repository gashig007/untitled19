package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            allheroes(heroes[i]);
            
        }
    }
    public static void allheroes (Hero hero){
        System.out.println(new Magic().applySuperAbility("магия"));
        System.out.println(new Medic().applySuperAbility("лечение"));
        System.out.println(new Warrior().applySuperAbility("критический урон"));
    }
}

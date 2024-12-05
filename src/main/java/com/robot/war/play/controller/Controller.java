package com.robot.war.play.controller;

import com.robot.war.entity.Hero;
import com.robot.war.entity.Villian;

public class Controller {
    private Hero hero;
    private Villian villian;

    public Controller(String heroName, int heroPower, String villainName, int villainPower) {
        this.villian = Villian.builder()
                .name(villainName)
                .powerLevel(villainPower)
                .build();
        this.hero = Hero.builder()
                .name(heroName)
                .powerLevel(heroPower)
                .build();
    }

    private void verifyHealhtHero() {
        if (hero.getHealth() == 0) {
            int life = -this.hero.getLives();
            System.out.println("the hero has " + life + " life(s)");
            this.hero.setHealth(100);
        }

    }

    private void verifyHealhtVillain() {
        if (this.villian.getHealth() == 0) {
            int life = -this.villian.getLives();
            System.out.println("the villain has " + life + " life(s)");
            this.villian.setHealth(100);
        }
    }

    public String seeHero() {
        return hero.toString() + "\n" + villian.toString();
    }
}

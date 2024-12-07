package com.robot.war.play.controller;

import com.robot.war.entity.Entity;
import com.robot.war.entity.Hero;
import com.robot.war.entity.Villian;

import static com.robot.war.play.controller.Verifier.healthVerifier;

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

    public boolean verifyHealth(Entity entity) {
        hero.setHealth(1);
        return healthVerifier(hero);
    }

    public String seeHero() {
        return hero.toString() + "\n" + villian.toString();
    }

    public String see() {
        return verifyHealth(hero) + "\n" + seeHero();
    }
}

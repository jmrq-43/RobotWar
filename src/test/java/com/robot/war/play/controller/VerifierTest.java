package com.robot.war.play.controller;

import com.robot.war.entity.Entity;
import com.robot.war.entity.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifierTest {
    Hero hero = Hero.builder()
            .name("name")
            .powerLevel(100.00f)
            .build();

    @DisplayName("If Health Is 0 Negative Is Expected")
    @Test
    void healthVerifier() {
        hero.setHealth(0);
        Assertions.assertTrue(Verifier.healthVerifier(hero));
    }

    @DisplayName("If Health Is greater than 0 Expected True")
    @Test
    void healthVerifier2(){
        hero.setHealth(2);
        Assertions.assertFalse(Verifier.healthVerifier(hero));
    }

}
package com.robot.war.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    @Test
    void specialAbility() {
    }

    @Test
    void lifeAttack() {
    }

    @Test
    void shieldAttack() {
    }

    @Test
    void testToString() {
    }

    @Test
    void builder() {
        Hero hero = Hero.builder()
                .name("miguel")
                .powerLevel(100)
                .build();

        assertEquals("miguel", hero.getName());
    }
}
package com.robot.war.play.controller;

import com.robot.war.entity.Entity;
import com.robot.war.entity.Hero;
import com.robot.war.entity.Villian;

public class Verifier {
    private Hero hero;
    private Villian villian;


    public static <T extends Entity> boolean healthVerifier(T entity) {
        return entity.getHealth() == 0;
    }

}

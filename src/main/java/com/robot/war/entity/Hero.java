package com.robot.war.entity;

import com.robot.war.entity.interfaces.SpecialAbility;
import com.robot.war.entity.interfaces.TypeOfAttack;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Hero extends Entity implements SpecialAbility, TypeOfAttack {

    @Builder
    public Hero(String name, float powerLevel) {
        super(name, powerLevel);
    }

    @Override
    public int specialAbility() {
        return 0;
    }

    @Override
    public float lifeAttack() {
        return (getPowerLevel() * 2) / 4;
    }

    @Override
    public float shieldAttack() {
        return (getPowerLevel() + 3) / 4;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", lives: " + getLives() + ", health: " + getHealth() + ", power: " + getPowerLevel();
    }
}
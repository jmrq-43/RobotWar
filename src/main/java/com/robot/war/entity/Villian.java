package com.robot.war.entity;

import com.robot.war.entity.interfaces.SpecialAbility;
import com.robot.war.entity.interfaces.TypeOfAttack;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class Villian extends Entity implements SpecialAbility, TypeOfAttack {

    @Builder
    public Villian(String name, float powerLevel) {
        super(name, powerLevel);
    }

    @Override
    public int specialAbility() {
        return 0;
    }

    @Override
    public float lifeAttack() {
        return (getPowerLevel() + 2) / 3;
    }

    @Override
    public float shieldAttack() {
        return (getPowerLevel() / 3) + 2;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", lives: " + getLives() + ", health: " + getHealth() + ", power: " + getPowerLevel();
    }
}




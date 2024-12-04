package com.robot.war.entity;

import com.robot.war.entity.interfaces.SpecialAbility;
import com.robot.war.entity.interfaces.TypeOfAttack;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Hero extends Entity implements SpecialAbility, TypeOfAttack {

    @Builder
    public Hero(String name, int powerLevel) {
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
}
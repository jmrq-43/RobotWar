package com.robot.war.entity;

import com.robot.war.entity.interfaces.SpecialAbility;
import com.robot.war.entity.interfaces.TypeOfAttack;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Builder;

@Data
@EqualsAndHashCode(callSuper = true)
public class Hero extends Entity implements SpecialAbility, TypeOfAttack {

    @Builder
    public Hero(String name, int health, int lives, int powerLevel) {
        super(name, health, lives, powerLevel);
    }

    @Override
    public int specialAbility() {
        return 0;
    }

    @Override
    public int lifeAttack() {
        return 0;
    }

    @Override
    public int shieldAttack() {
        return 0;
    }
}



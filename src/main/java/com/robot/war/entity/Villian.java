package com.robot.war.entity;

import com.robot.war.entity.interfaces.SpecialAbility;
import com.robot.war.entity.interfaces.TypeOfAttack;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Villian extends Entity implements SpecialAbility, TypeOfAttack {

    @Builder
    public Villian(String name) {
        super(name);
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




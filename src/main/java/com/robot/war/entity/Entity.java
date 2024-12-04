package com.robot.war.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Entity {
    private final String name;
    private int health = 100;
    private int lives = 5;
    private int powerLevel;

}



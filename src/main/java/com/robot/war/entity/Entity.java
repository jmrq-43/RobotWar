package com.robot.war.entity;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Entity {
    private String name;
    private int health = 100;
    private int lives = 5;
    private int powerLevel;

}



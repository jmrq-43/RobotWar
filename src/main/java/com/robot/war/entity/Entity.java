package com.robot.war.entity;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class Entity {
    @NonNull
    private final String name;
    private int health = 100;
    private int lives = 5;
    @NonNull
    private final float powerLevel;
}

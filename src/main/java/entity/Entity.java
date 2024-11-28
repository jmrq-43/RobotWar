package entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Entity {
    private String name;
    private int health;
    private int lives;
}

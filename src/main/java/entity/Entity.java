package entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Entity {
    private final String name;
    private int health;
    private int lives;
}

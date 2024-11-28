package entity.badEntity;

import entity.Entity;

public class Enemy extends Entity {
    public Enemy(String name, int health, int lives) {
        super(name, health, lives);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getLives() {
        return super.getLives();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setLives(int lives) {
        super.setLives(lives);
    }
}

# ROBOT WAR  

````mermaid
classDiagram
    class Entity {
        - String name
        - int health
        - int lives
        + setter()
        + getter() 
    }
    
    class Attack {
        <<interface>>
        + powerAttack(): int
    }

    class Enemy {
    
    }
    
    class Hero {
        
    }
    
    class Human {
             
    }
    
    class Robot {
           
    }


    Entity --|> Human : inheritance

    Entity --|> Enemy : inheritance

    Entity --|> Hero : inheritance
    
    Entity --|> Robot : inheritance

    Hero <|-- Attack : implents

    Enemy <|-- Attack : implents
````
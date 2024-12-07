package com.robot.war.play;

import com.robot.war.play.controller.Controller;

public class Play {
    public static void main(String[] args) {
        Controller controller = new Controller("cancerbero", 50, "tairon", 20);

        System.out.println(controller.see());
    }
}

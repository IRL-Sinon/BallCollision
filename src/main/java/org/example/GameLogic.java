package org.example;

import org.example.logic.Ball;
import org.example.logic.Direction;
import org.example.logic.Wall;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    private Ball ball;
    private Ball ballEnemy;
    private ArrayList<Wall> walls;


    public GameLogic() {
        this.ball = null;
        this.walls = new ArrayList<>();
    }

    public void initialize() {

        ball = new Ball(20, 20, 50, 50, Color.BLUE);

        Wall wall1 = new Wall(250, 30, 250, 320, Color.BLACK);
        Wall wall2 = new Wall(100, 50, 150, 50, Color.BLACK);
        walls.add(wall1);
        walls.add(wall2);
    }

    public void update() {
        ball.move(2, Direction.RIGHT);
        for (Wall wall : walls) {
            if (ball.isCollided(wall)) {
                System.out.println("Kolize byla detekována");
            }
        }
    }






    public Ball getBall() {
        return ball;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }
}

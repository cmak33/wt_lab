package com.company.tasks.task9;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private final Set<Ball> balls = new HashSet<>();

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public Set<Ball> getBalls(){
        return balls;
    }
}

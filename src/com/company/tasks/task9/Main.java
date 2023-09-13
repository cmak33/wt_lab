package com.company.tasks.task9;

public class Main {

    public static void main(String[] args){
        Ball ball1 = new Ball(Color.BLUE,1);
        Ball ball2 = new Ball(Color.BLUE, 4);
        Ball ball3 = new Ball(Color.RED, 2);
        Ball ball4 = new Ball(Color.RED, 2);

        Bucket bucket = new Bucket();

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);

        System.out.printf("Total weight: %s%n",BucketOperations.calculateBallsWeight(bucket));
        System.out.printf("Blue balls count: %s%n",BucketOperations.calculateBlueBallsCount(bucket));
    }
}

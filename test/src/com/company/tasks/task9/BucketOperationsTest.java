package com.company.tasks.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketOperationsTest {

    @Test
    void givenTwoBalls_whenCalculateBallsWeight_thanReturnWeight(){
        Ball firstBall = new Ball(Color.BLUE, 10);
        Ball secondBall = new Ball(Color.RED, 15);
        Bucket bucket = new Bucket();
        bucket.addBall(firstBall);
        bucket.addBall(secondBall);

        int expected = firstBall.weight() + secondBall.weight();
        int actual = BucketOperations.calculateBallsWeight(bucket);

        assertEquals(expected, actual);
    }

    @Test
    void givenTwoBlueBalls_whenCalculateBlueBallsCount_thanReturnTwo(){
        Ball firstBlueBall = new Ball(Color.BLUE, 10);
        Ball secondBlueBall = new Ball(Color.BLUE, 15);
        Ball redBall = new Ball(Color.RED, 10);
        Bucket bucket = new Bucket();
        bucket.addBall(firstBlueBall);
        bucket.addBall(secondBlueBall);
        bucket.addBall(redBall);

        int expected = 2;
        int actual = BucketOperations.calculateBlueBallsCount(bucket);

        assertEquals(expected, actual);
    }
}
package com.company.tasks.task9;

public class BucketOperations {

    private BucketOperations(){}

    public static int calculateBallsWeight(Bucket bucket){
        return bucket.getBalls().stream().mapToInt(Ball::weight).sum();
    }

    public static int calculateBlueBallsCount(Bucket bucket){
        return (int)bucket.getBalls().stream().filter(x->x.color().equals(Color.BLUE)).count();
    }
}

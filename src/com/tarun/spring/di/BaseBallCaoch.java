package com.tarun.spring.di;

public class BaseBallCaoch implements Coach{


    private CricketCoach cricketCoach;

    public BaseBallCaoch(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @Override
    public String getDailyWorkout() {
        return "To 1 hour daily workout";
    }

    public String getWorkout() {
        return cricketCoach.getWorkout();
    }


}

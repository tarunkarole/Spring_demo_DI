package com.tarun.spring.di;

public class TenisCoachImpl implements TenisCoach {


    private Coach coach;

    public TenisCoachImpl(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String getDailyTenis() {
        return "Get Daily Practice Tenis...";
    }


    @Override
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }


    @Override
    public String getWorkout() {
        return coach.getWorkout();
    }
}

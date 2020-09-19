package com.tarun.spring.setter;


public class BaseBallImpl implements BaseBall {


    private String team;
    private String email;

    private CricketCoach cricket;

    public void setCricket(CricketCoach cricketCoach) {
        this.cricket = cricketCoach;
    }

    @Override
    public String getBaseBall() {
        return "Practice daily BaseBall...";
    }


    @Override
    public String getCricket() {
        return cricket.getCricket();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

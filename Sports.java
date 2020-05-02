package com.amanuelnegussie;

public abstract class Sports{
    String teamName;

    public Sports(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    int won=0;
    int lost=0;
    int tied =0;
    int played =0;


    public void matchResults (Sports opponentTeam, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (theirScore > ourScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponentTeam != null) {
            opponentTeam.matchResults (null, theirScore, ourScore);
            System.out.println(this.teamName + message + opponentTeam.getTeamName());

        }
    }


}

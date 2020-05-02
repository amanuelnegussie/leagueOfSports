package com.amanuelnegussie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Sports> implements Comparable<League<T>>{
    String name;
    int won = 0;
    int lost = 0;
    int tied = 0;
    int played = 0;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList<T> leagueList = new ArrayList<>();



    //functions/methods

    public boolean addTeam (T team){
        if (leagueList.contains(team)){
            System.out.println("Sorry, this team " + team.getTeamName() + " has already been added.");
            return false;
        } else{
            leagueList.add(team);
            System.out.println(team.getTeamName() + " has been added to " + this.name);
            return true;
        }
    }

    public void matchResults (Sports opponentTeam, int ourScore, int theirScore){
        String message;
        if (ourScore>theirScore){
            won++;
            message= " beat ";
        } else if (theirScore>ourScore){
            lost++;
            message= " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponentTeam !=null){
            opponentTeam.matchResults(null,theirScore,ourScore);
            System.out.println(this.name + message + opponentTeam.getTeamName());

        }

    }

    public void showLeagueList (){
        System.out.println("_______________________");
        System.out.println(this.name + ":");
        System.out.println("_______________________");
        for (T i: this.leagueList){
            System.out.println((this.leagueList.indexOf(i) +1)+ ": " + i.getTeamName());
        }
        System.out.println("_______________________");
    }

    public int ranking (){
        return (won*2)+ tied;
    }




    @Override
    public int compareTo(League<T> opponentTeam) {

        return Integer.compare(this.ranking(),opponentTeam.ranking());

//        if (this.ranking() > opponentTeam.ranking()){
//            return 1;
//        } else if (this.ranking()<opponentTeam.ranking()){
//            return -1;
//        } else {
//            return 0;
//        }

    }
}

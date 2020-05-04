package com.amanuelnegussie;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import java.util.ArrayList;
import java.util.Collections;


//League carries an arrayList of teams that are part of the league
//Teams carry an arrayList of teams that play the Sport
//Player carries attributes of that Player it is an abstract class
//subclasses of that Sport are made
public class League <T extends Sport>  {
    public String name;
    private ArrayList<Team<T>> leagueArray = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addToLeague(Team<T> team){
        if(leagueArray.contains(team)){
            System.out.println( team.getTeamName() +
                    " have already been added to the " + this.name + ".");
        } else {
            leagueArray.add(team);
            System.out.println(team.getTeamName() + " have been added to the " + this.name + ". ");
        }
    }

    public void showLeague() {
        //Collections.sort doesn't work for some odd reason
        System.out.println();
        System.out.println(this.name + " Rankings:");
        Collections.sort(leagueArray);

        Team team;
        for (int i=0; i<leagueArray.size(); i++){
            team = leagueArray.get(i);
            System.out.println((i+1) + ": "+ team.getTeamName() + " Ranking: " + team.ranking());
        }
    }
}

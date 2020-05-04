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

//League carries an arrayList of teams that are part of the league
//Teams carry an arrayList of teams that play the Sport
//Player carries attributes of that Player it is an abstract class
//subclasses of that Sport are made

public class Team <T extends Sport> implements Comparable<Team<T>>{

    private String teamName;
    int wins = 0;
    int losses=0;
    int ties= 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void matchResults (Team<T> opponent, int ourScore, int theirScore){
        if (ourScore>theirScore){
            wins++;
        } else if (theirScore>ourScore){
            losses++;
        } else{
            ties++;
        }
        if (opponent!=null){
            opponent.matchResults(null, theirScore, ourScore);
        }
    }


    public int ranking(){
        return wins*3+ties*2-losses;
    }




    @Override
    public int compareTo(Team<T> o) {
        //this is so that it's alphabetically ordered
        return this.getTeamName().compareTo(o.teamName);

        //this is so that the highest number is ranked first
        // return Integer.compare(o.ranking(),this.ranking());
    }


}

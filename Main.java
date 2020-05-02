package com.amanuelnegussie;

public class Main {

    public static void main(String[] args) {
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


        //Teams to add
        Basketball raptors = new Basketball("Toronto Raptors");
        Basketball pistons = new Basketball("Detroit Pistons");
        Basketball bulls = new Basketball("Chicago Bulls");
        Baseball cubs = new Baseball("Chicago Cubs");
        Baseball blueJays = new Baseball("Toronto Bluejays");
        Baseball yankees = new Baseball("New York Yankees");
        Football browns = new Football("Cleveland Browns");
        Football rams = new Football("Los Angeles Rams");
        Football packers = new Football("Greenbay Packers");

        //Sports Leagues Created
        League<Basketball> nbaLeague = new League<>("NBA LEAGUE");
        League<Baseball> mlbLeague = new League<>("MLB LEAGUE");
        League<Football> nflLeague = new League<>("NFL LEAGUE");


        //ADD TEAMS
        nbaLeague.addTeam(pistons);
        nbaLeague.addTeam(bulls);
        mlbLeague.addTeam(cubs);
        mlbLeague.addTeam(blueJays);
        mlbLeague.addTeam(yankees);
        nflLeague.addTeam(browns);
        nflLeague.addTeam(rams);
        nflLeague.addTeam(packers);
        nbaLeague.addTeam(raptors);

        nbaLeague.showLeagueList();
        mlbLeague.showLeagueList();
        nflLeague.showLeagueList();

        nbaLeague.matchResults(raptors,25,25);
       raptors.matchResults(bulls,12,13);
       raptors.matchResults(pistons,130,120);
       raptors.matchResults(raptors, 130,130);








        //MATCH RESULTS




    }

}

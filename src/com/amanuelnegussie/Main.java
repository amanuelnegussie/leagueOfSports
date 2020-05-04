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

        //League carries an arrayList of teams that are part of the league
        //Teams carry an arrayList of teams that play the Sport
        //Player carries attributes of that Player it is an abstract class
        //subclasses of that Sport are made

        League<Team<Basketball>> nbaLeague = new League<>("NBA League");
        League<Team<Football>> nflLeague = new League<>("NFL League");
        League<Team<Baseball>> mlbLeague = new League<>("MLB League");

        //Creating teams with specific sports types
        Team<Basketball> theRaptors = new Team<>("The Toronto Raptors");
        Team<Basketball> theLakers = new Team<>("The Los Angeles Lakers");
        Team<Basketball> theBulls = new Team<>("The Chicago Bulls");
        Team<Basketball> thePistons = new Team<>("The Detroit Pistons");

        Team<Football> theBrowns = new Team<>("The Cleveland Browns");
        Team<Football> thePackers = new Team<>("The Greenbay Packers");
        Team<Football> thePatriots = new Team<>("The New England Patriots");
        Team<Football> theFalcons = new Team<>("The Atlanta Falcons");

        Team<Baseball> theYankees = new Team<>("The New York Yankees");
        Team<Baseball> theCubs = new Team<>("The Chicago Cubs");
        Team<Baseball> theBlueJays = new Team<>("The Toronto Bluejays");
        Team<Baseball> theDodgers = new Team<>("The Los Angeles Dodgers");




        // type safety when adding teams of type Sport(abstract class- with subclasses each type Sport)
        nbaLeague.addToLeague(theRaptors);
        nbaLeague.addToLeague(theBulls);
        nbaLeague.addToLeague(theLakers);
        nbaLeague.addToLeague(thePistons);

        nflLeague.addToLeague(theBrowns);
        nflLeague.addToLeague(theFalcons);
        nflLeague.addToLeague(thePackers);
        nflLeague.addToLeague(thePatriots);

        mlbLeague.addToLeague(theCubs);
        mlbLeague.addToLeague(theBlueJays);
        mlbLeague.addToLeague(theDodgers);
        mlbLeague.addToLeague(theYankees);

        //competing
        nflLeague.showLeague();

        thePackers.matchResults(theBrowns, 23,24);
        thePatriots.matchResults(theBrowns, 34,12);
        thePatriots.matchResults(thePackers, 23,26);
        theBrowns.matchResults(theFalcons,12,56);
        theFalcons.matchResults(thePatriots,123,23);
        theFalcons.matchResults(thePackers,123,212);
        theFalcons.matchResults(theFalcons,120,12);


        nflLeague.showLeague();











    }
}

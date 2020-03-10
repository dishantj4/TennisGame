
<h1 align="center">Tennis Game</h1>

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
* [Purpose](#purpose)
* [Functional Case](#functional-case)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [How to run this App](#how-to-run-this-app)
  * [Expected Result](#expected-result)


<!-- ABOUT THE PROJECT -->
## About The Project

Project to implement simple tennis game which is played by 2 players.
winner of this game is decided based on the points scored by each player.

More info on the rules at: [Tennis Scoring](http://en.wikipedia.org/wiki/Tennis#Scoring)

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b.
If the player with advantage wins the ball he wins that game. If the player without advantage wins they are back at deuce.

<!-- Purpose -->
## Purpose
This is an Practice program on simple tennis game using Test Driven Development

<!-- Functional Case -->
## Functional Case

````
*Lets Say
Player One = "Nadal"
Player Two = "Federer"

-Should return game score as "Love All" at start of game
-Should return game score as "Fifteen Love" when player one wins first point
-Should return game score as "Thirty Love" when player one wins first point
-Should return game score as "Forty Love" when player one wins first point
-Should return game score as "Nadal Wins"  when player one wins 4 and player two wins 2 points
-Should return game score as "Deuce" when at least three points have been scored by each player
 and the scores are equal
-Should return game score as "Federer Advantage" when  player one scores one point post deuce
-Should return game score as "Federer Wins"  when player two wins 4 and player two wins 2 points

````

<!-- Prerequisite -->
### Prerequisite

````
Jdk 1.7 or above
IDE (Eclipse or Intellij)
Maven 3.0
````

<!--  How to run this App -->
### How to run this App

Follow below instructions to run this app
````
-git clone https://github.com/dishantj4/TennisGame.git
-Go to src/test/java/com/kata/TennisGameTest.java and run the Junit Test case or run below maven command.

$ mvn clean test

````

<!-- Expected Result -->
### Expected Result

Below are few example of expected result on ScoreBoard
````
"Love All"
"Love Fifteen"
"Fifteen All"
"Thirty Fifteen"
"Thirty Fifteen"
"Thirty All"
"Thirty Forty"
"Deuce"
"Federer Advantage"
"Federer Wins"

````




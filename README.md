# CSCI 205 - Software Engineering and Design
Bucknell University
Lewisburg, PA
### Course Info
- Instructor: Dr. King
- Semester: Fall 2023
## Team Information

- Group 6 (Team Tinsel)
#### Nathan Stamford (Developer)
- Sophomore, CS Major
- Worked on JavaFX and Scene Builder as well as combining front-end and backend components
- Strength: JavaFx
- Weakness: Asking for help
#### Leo McMenimen (Product Owner)
- Sophomore, CS Major
- Worked on backend development, Junit tests and UML diagrams as well as the user manual
- Strength: UML Diagrams
- Weakness: JavaFx
#### Derek Araki-Kurdyla (Scrum Master)
- Sophomore, CS Major
- Worked on backend development/game logic and combining front-end and backend components
- Strength: Object oriented design
- Weakness: Lambda Expressions
#### Alex Araki-Kurdyla (Developer)
- Sophomore, CS Major
- Worked on game logic and the design manual as well as CRC cards
- Strength: Lambda Expressions
- Weakness: UML Diagrams
## Project Information

Our final project is an implementation of the popular board game Sorry! through the use of JavaFX and Scene Builder. Up to four players can play on one computer and enjoy the simple yet riveting and competitive game. The objective of the game is to get all of your pawns around the board and into your home base. The first player to do so wins the game. In order to replicate the relatively complex game logic of Sorry!, we initialize a "board" of spaces at the start of every turn depending on whose turn it is. The board is initialized differently depending on whose turn it is, as certain spaces or indexes on the board interact differently with pawns. For example, a green pawn cannot enter the red player's safety spaces or home area. To fix this problem, when it is the red player's turn, the other color's safety spaces do not even exist.

In order to accomplish this, we wrote 12 java classes as a team and one interface, used to convert an index on the oveerall board to a space/index from the viewpoint of the pawn. After establishing the logic of the game and ensuring that curcial components of Sorry! were evident in our implementation, we wrote two more classes to connect our previous Java classes to JavaFX and to utilize Scene Builder.

## Package Structure
- .gradle
- .idea
- build
- design (contains design pdfs: UML Diagrams, CRC cards, and Class Diagrams)
- docs (contains project documents: Project Summary, User Manual, Design Manual)
- gradle
- src (contains all java classes)

### 3rd party library list:
Javafx version: 22-ea+11
Link to main page: https://docs.oracle.com/javase/8/javafx/api/toc.htm

## How to run it

- Make sure you are in csci205_final_project directory
- Run ..gradlew run in the terminal
- Run main method

## Video
Coming soon


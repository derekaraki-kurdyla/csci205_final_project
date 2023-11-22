/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:30 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Player
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    /** color of {@link Pawn} for specific instance of player */
    private PawnColor pawnColor;

    /** {@link Board} object assigned to every player, since each player would have access to the board */
    private Board gameBoard;

    /** Converter assigned to player depending on {@link #pawnColor} */
    private BoardPawnIndexConverter converter;

    /** constructor for {@link Player} object that initializes {@link} */
    public Player(String pawnColor, Board gameBoard){
        this.pawnColor = determinePawnColor(pawnColor);
        this.gameBoard = gameBoard;
        this.converter = this.determineConverter();
    }

    private PawnColor determinePawnColor(String pawnColor) {
        return switch(pawnColor){
            case "red" -> PawnColor.RED;
            case "blue" -> PawnColor.BLUE;
            case "yellow" -> PawnColor.YELLOW;
            case "green" -> PawnColor.GREEN;
            default -> throw new IllegalStateException("Unexpected value: " + pawnColor);
        };
    }

    /**
     * carries out the {@link Player} turn depending on their drawn card
     * @param drawnCard the card drawn by the player on their turn
     */
    public void takeTurn(Card drawnCard) {

        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();
        ArrayList<Pawn> colorPawnsToIterateThrough = determineColorPawnsToIterateThrough();

        switch (drawnCard.getCardValue()) {
            case ONE -> {
                ArrayList<Pawn> possiblePawnMovesOnBoard = this.findPossiblePawnMovesOnBoard(colorPawnsToIterateThrough, 1);
                ArrayList<Pawn> possiblePawnMovesAtStart = this.findPossiblePawnMovesAtStart(colorPawnsToIterateThrough);

                possiblePawnMoves.addAll(possiblePawnMovesOnBoard);
                possiblePawnMoves.addAll(possiblePawnMovesAtStart);

                Pawn pawnToMove = getPawnToMove(possiblePawnMoves); // javaFX part

                if(pawnToMove != null){
                    if(pawnToMove.isOnBoard()){
                        this.moveForward(pawnToMove,1);
                    }
                    else if(pawnToMove.isAtStart()){
                        System.out.println("this happens! line 76");
                        this.moveFromStart(pawnToMove);
                    }
                    else{
                        System.out.println("THIS SHOULD NEVER HAPPEN LINE 89");
                    }
                }
            }
            case TWO -> {

            }
            case THREE -> {

                possiblePawnMoves = this.findPossiblePawnMovesOnBoard(colorPawnsToIterateThrough, 3);

                Pawn pawnToMove = getPawnToMove(possiblePawnMoves); // javaFX part

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,3);
            }

            case FOUR -> {

            }
            case FIVE -> {

                possiblePawnMoves = this.findPossiblePawnMovesOnBoard(colorPawnsToIterateThrough, 5);

                Pawn pawnToMove = getPawnToMove(possiblePawnMoves); // javaFX part

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,5);

            }
            case SEVEN -> {

            }
            case EIGHT -> {

                possiblePawnMoves = this.findPossiblePawnMovesOnBoard(colorPawnsToIterateThrough, 8);

                Pawn pawnToMove = getPawnToMove(possiblePawnMoves); // javaFX part

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,8);

            }
            case TEN -> {

            }
            case ELEVEN -> {

            }
            case TWELVE-> {

                possiblePawnMoves = this.findPossiblePawnMovesOnBoard(colorPawnsToIterateThrough, 12);

                Pawn pawnToMove = getPawnToMove(possiblePawnMoves); // javaFX part

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,12);

            }
            case SORRY -> {

            }
        }
    }

    private void moveFromStart(Pawn pawnToMove) {

        //check if index is occupied
        int indexAfterStartCircle = this.converter.convertToBoardIndex(2); //CHECK THIS
        if(this.gameBoard.getMapOfSpaces().get(indexAfterStartCircle).equals(SpaceType.OCCUPIED)) { //means different color
            Pawn pawnToRemove = this.findPawnFromBoardIndex(indexAfterStartCircle);
            this.gameBoard.getMapOfBoard().remove(pawnToRemove);
            this.gameBoard.getMapOfBoard().put(pawnToMove, indexAfterStartCircle);
            pawnToMove.moveFromStart();
        }
        else{
            this.gameBoard.getMapOfBoard().put(pawnToMove, indexAfterStartCircle);
            this.gameBoard.getMapOfSpaces().put(indexAfterStartCircle, SpaceType.OCCUPIED);
            pawnToMove.moveFromStart();
        }

    }

    /**
     * Method to move a pawn forward but only if certain conditions are met:
     * 1. check if different color occupies space, and if it does, move it back to start, and don't have to update space because already occupied
     * 2. check if land on start of different color pawn slide, will have to boot all pawns back to start and move down slide and set space to occupied
     * 3. check if pawn ends up in the end circle
     * 4. normal, just move forwards and set space type to occupied
     * @param pawnToMove the {@link Pawn} object that is being moved
     * @param numSpaces the number of indices being moved
     */
    private void moveForward(Pawn pawnToMove, int numSpaces) {
        int currBoardIndex = this.gameBoard.getMapOfBoard().get(pawnToMove);
        System.out.println("currBoardIndex: " + currBoardIndex);

        int currBoardColorIndex = this.converter.convertToColorIndex(currBoardIndex);
        System.out.println("currBoardColorIndex: " + currBoardColorIndex);

        int landingBoardColorIndex = currBoardColorIndex + numSpaces;
        System.out.println("landingBoardColorIndex: " + landingBoardColorIndex);

        int landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
        System.out.println("landingBoardIndex: " + landingBoardIndex);

        SpaceType landingIndexSpaceType = this.gameBoard.getMapOfSpaces().get(landingBoardIndex);
        System.out.println("landingIndexSpaceType: " + landingIndexSpaceType);

        // Check 1
        if(landingIndexSpaceType.equals(SpaceType.OCCUPIED)){ //means there is a pawn here of different type, because already checked or pawn of same type
            System.out.println("check 1");
            //also means that this cannot be the end circle index, because it is occupied
            Pawn pawnToRemove = this.findPawnFromBoardIndex(landingBoardIndex);
            if(pawnToRemove == null){
                System.out.println("THIS SHOULD NEVER HAPPEN");
            }
            this.gameBoard.getMapOfBoard().remove(pawnToRemove); //update board by removing old pawn
            this.gameBoard.getMapOfBoard().remove(pawnToMove); //update board by removing new pawn from old position
            this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex); //update board by adding new pawn
            pawnToRemove.sendStart();//update pawn itself, so now it is back at start
            this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED); //update space that you moved from as unoccupied

            // don't have to update spaces, because the space is still occupied just by a different pawn.
            // the takeTurn() method determines if the pawn is of the same type of not
        }

        // Check 2
        // a start slide could be occupied by a pawn of that same color, how to deal with this
        // even if occupied, this space type will be initialized to START_SLIDE, not OCCUPIED, because spaces are
        // initialized before each turn
        // in other words, the pawn still on the start slide, if there, will not have been removed by check 1
        //
        else if(landingIndexSpaceType.equals(SpaceType.START_SHORT_SLIDE_DIFFERENT)){

            this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);

            System.out.println("check 2");
            //also means that this cannot be end circle index

            Pawn pawnToRemoveAtStartSlide = this.findPawnFromBoardIndex(landingBoardIndex);
            //check if there is a pawn on start of slide (would only be pawn of that color slide)
            if(pawnToRemoveAtStartSlide != null){
                this.gameBoard.getMapOfBoard().remove(pawnToRemoveAtStartSlide); //update board by removing pawn at start slide
                pawnToRemoveAtStartSlide.sendStart(); //update pawn itself
                //don't update space type because still a SLIDE_START
            }
            for(int index = landingBoardIndex + 1; index < landingBoardIndex + 4; index++){ //for all pawns on slide other than the START_SLIDE
                if(this.gameBoard.getMapOfSpaces().get(index).equals(SpaceType.OCCUPIED)){
                    Pawn pawnToRemoveOnSlide = this.findPawnFromBoardIndex(index);
                    this.gameBoard.getMapOfBoard().remove(pawnToRemoveOnSlide); //update board by removing old pawns
                    pawnToRemoveOnSlide.sendStart(); //update removed pawn(s) themselves
                    this.gameBoard.getMapOfSpaces().put(index, SpaceType.UNOCCUPIED); //update space types as well
                }
            }
            //still have to remove new pawn from original place, and put it down to new location
            this.gameBoard.getMapOfBoard().remove(pawnToMove);
            this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex + 3);
        }

        else if(landingIndexSpaceType.equals(SpaceType.START_LONG_SLIDE_DIFFERENT)){

            this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);

            System.out.println("check 2");
            //also means that this cannot be end circle index

            Pawn pawnToRemoveAtStartSlide = this.findPawnFromBoardIndex(landingBoardIndex);
            //check if there is a pawn on start of slide (would only be pawn of that color slide)
            if(pawnToRemoveAtStartSlide != null){
                this.gameBoard.getMapOfBoard().remove(pawnToRemoveAtStartSlide); //update board by removing pawn at start slide
                pawnToRemoveAtStartSlide.sendStart(); //update pawn itself
                //don't update space type because still a SLIDE_START
            }
            for(int index = landingBoardIndex + 1; index < landingBoardIndex + 5; index++){ //for all pawns on slide other than the START_SLIDE
                if(this.gameBoard.getMapOfSpaces().get(index).equals(SpaceType.OCCUPIED)){
                    Pawn pawnToRemoveOnSlide = this.findPawnFromBoardIndex(index);
                    this.gameBoard.getMapOfBoard().remove(pawnToRemoveOnSlide); //update board by removing old pawns
                    pawnToRemoveOnSlide.sendStart(); //update removed pawn(s) themselves
                    this.gameBoard.getMapOfSpaces().put(index, SpaceType.UNOCCUPIED); //update space types as well
                }
            }
            //still have to remove new pawn from original place, and put it down to new location
            this.gameBoard.getMapOfBoard().remove(pawnToMove);
            this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex + 4);
        }

        // Check 3

        else if(landingBoardColorIndex == Pawn.MAX_INDEX){
            System.out.println("check 3");
            this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED); //update space to unoccupied
            this.gameBoard.getMapOfBoard().remove(pawnToMove);
            this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex);
            pawnToMove.reachedEnd();
        }

        // Check 4
        else{

            System.out.println("check 4");
            this.gameBoard.getMapOfBoard().remove(pawnToMove); //remove pawn from old spot
            this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED); //mark old position as unoccupied
            this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex); //put pawn in new spot
            this.gameBoard.getMapOfSpaces().put(landingBoardIndex, SpaceType.OCCUPIED); //mark new spot as occupied
        }
    }

    private ArrayList<Pawn> determineColorPawnsToIterateThrough() {
        ArrayList<Pawn> colorPawnsToIterateThrough = new ArrayList<>();

        switch(this.pawnColor){
            case RED -> colorPawnsToIterateThrough = this.gameBoard.getRedPawns();
            case BLUE -> colorPawnsToIterateThrough = this.gameBoard.getBluePawns();
            case YELLOW -> colorPawnsToIterateThrough = this.gameBoard.getYellowPawns();
            case GREEN -> colorPawnsToIterateThrough = this.gameBoard.getGreenPawns();
        }
        return colorPawnsToIterateThrough;
    }

    private BoardPawnIndexConverter determineConverter(){
        return switch(this.pawnColor){
            case RED -> this.converter = new RedConverter();
            case BLUE -> this.converter = new BlueConverter();
            case YELLOW -> this.converter = new YellowConverter();
            case GREEN -> this.converter = new GreenConverter();
        };
    }

    private ArrayList<Pawn> findPossiblePawnMovesOnBoard(ArrayList<Pawn> arr, int numSpaces) {
        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();

        for (Pawn pawn: arr) {

            //check if pawn is not at start and less than three from end circle and your own pawn does not occupy that space
            if (pawn.isOnBoard()){
                int pawnIndexColor = this.converter.convertToColorIndex(this.gameBoard.getMapOfBoard().get(pawn));

                if(pawnIndexColor <= (Pawn.MAX_INDEX - numSpaces)){
                    //check if pawn index + numspaces is occupied by same piece

                    //we have pawn color index. check if (pawn color index + numspaces) converted to a space on the board index map is occupied
                    int landingBoardIndex = this.converter.convertToBoardIndex(pawnIndexColor + numSpaces);

                    //if space is occupied by some pawn (don't know the color yet)
                    if ((this.gameBoard.getMapOfSpaces().get(landingBoardIndex).equals(SpaceType.OCCUPIED))){
                        //if space is not occupied by same color pawn
                        if(!(this.findPawnFromBoardIndex(landingBoardIndex).getColor().equals(this.pawnColor))) {
                            possiblePawnMoves.add(pawn);
                        }
                    }
                    else{
                        possiblePawnMoves.add(pawn);
                    }
                }
            }
        }
        return possiblePawnMoves;
    }

    private ArrayList<Pawn> findPossiblePawnMovesAtStart(ArrayList<Pawn> colorPawnsToIterateThrough) {
        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();
        for(Pawn pawn: colorPawnsToIterateThrough){
            if(pawn.isAtStart()){
                int indexAfterStartCircle = this.converter.convertToBoardIndex(2); //CHECK THIS
                if(this.gameBoard.getMapOfSpaces().get(indexAfterStartCircle).equals(SpaceType.OCCUPIED)) {
                    if(!(this.findPawnFromBoardIndex(indexAfterStartCircle).getColor().equals(this.pawnColor))) {
                        possiblePawnMoves.add(pawn);
                    }
                }
                else{
                    possiblePawnMoves.add(pawn);
                }
            }
        }
        return possiblePawnMoves;
    }

    private Pawn getPawnToMove(ArrayList<Pawn> possiblePawnMoves) {
        int possibleIndex;

        if (!possiblePawnMoves.isEmpty()) {

            System.out.println("possible pawn moves length: " + possiblePawnMoves.size());

            ArrayList<Integer> possiblePawnIndices = new ArrayList<>();
            for (Pawn pawn : possiblePawnMoves) {
                //Java Fx application, print this to screen and ask highlight pawns on board that they can move
                if (pawn.isOnBoard()) {
                    possibleIndex = this.gameBoard.getMapOfBoard().get(pawn);
                    possiblePawnIndices.add(possibleIndex);
                }
                else { //this means that it is at start
                    possibleIndex = 0;
                    possiblePawnIndices.add(possibleIndex); //for start index, although not an index
                }
                System.out.println("You can move a pawn at index " + possibleIndex);
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("What index pawn do you pick?");
            int index = scan.nextInt();

            if (possiblePawnIndices.contains(index)) {

                //could be zero, and no pawn at index 0
                if(index == 0){
                    System.out.println("Valid index (0)");
                    for(Pawn pawn: possiblePawnMoves){
                        if (pawn.isAtStart()) {
                            return pawn;
                        }
                    }
                    return null;
                }
                else{
                    System.out.println("Valid index");
                    return this.findPawnFromBoardIndex(index);
                }

            }
            else {
                System.out.println("Invalid index");
                return null;
            }
        }
        else{
            System.out.println("There are no possible moves!");
            return null;
        }
    }

    public Pawn findPawnFromBoardIndex(int index){
        for (Pawn pawn: this.gameBoard.getMapOfBoard().keySet()){
            if (this.gameBoard.getMapOfBoard().get(pawn) == index){
                return pawn;
            }
        }
        return null;
    }

    public PawnColor getPawnColor(){
        return this.pawnColor;
    }

}
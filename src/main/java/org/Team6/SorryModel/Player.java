/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:30 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Player
 *
 * Description: This class represents a person playing a Sorry! game.
 * It is responsible to keep track of its own color, the board, the current pawn to move, and
 * possible pawn moves.
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    /** {@link PawnColor} of {@link Pawn} for specific instance of player */
    private PawnColor pawnColor;

    /** {@link Board} object assigned to every player, since each player would have access to the board */
    private Board gameBoard;

    /** Converter assigned to player depending on {@link #pawnColor} */
    private BoardPawnIndexConverter converter;

    /** {@link ArrayList} of all the possible {@link Pawn} objects that can be moved for a specific player and turn */
    private ArrayList<Pawn> possiblePawnMoves;

    /** {@link Pawn} the pawn to move for a specific player and turn */
    private Pawn pawnToMove;

    /** {@link ArrayList} of all {@link Pawn} objects that need to be moved back to start for a specific player and turn -> this is for the UI update */
    private ArrayList<Pawn> listOfPawnsToMoveToStart = new ArrayList<>();

    /** {@link Card} the most recent card drawn */
    private Card drawnCard;

    /**
     * Constructor for the Player class
     * @param pawnColor the {@link PawnColor} of the player
     * @param gameBoard the {@link Board} reference for the player
     */
    public Player(String pawnColor, Board gameBoard){
        this.pawnColor = determinePawnColor(pawnColor);
        this.gameBoard = gameBoard;
        this.converter = this.determineConverter();
    }

    /**
     * updates {@link Player#pawnColor} from a String value
     * @param pawnColor the pawnColor as a {@link String} value
     * @return a {@link PawnColor} enumeration
     */
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
     * Determines possible pawn moves for the current player
     * @param drawnCard the card drawn by the player on their turn
     */
    public void findPossiblePawnMoves(Card drawnCard) {

        possiblePawnMoves = new ArrayList<>();
        ArrayList<Pawn> colorPawnsToIterateThrough = determineColorPawnsToIterateThrough();

        switch (drawnCard.getCardValue()) {
            case ONE -> {
                ArrayList<Pawn> possiblePawnMovesOnBoard = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 1);
                ArrayList<Pawn> possiblePawnMovesAtStart = this.findPossiblePawnMovesAtStart(colorPawnsToIterateThrough);

                possiblePawnMoves.addAll(possiblePawnMovesOnBoard);
                possiblePawnMoves.addAll(possiblePawnMovesAtStart);

            }
            case TWO -> {
                ArrayList<Pawn> possiblePawnMovesOnBoard = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 2);
                ArrayList<Pawn> possiblePawnMovesAtStart = this.findPossiblePawnMovesAtStart(colorPawnsToIterateThrough);

                possiblePawnMoves.addAll(possiblePawnMovesOnBoard);
                possiblePawnMoves.addAll(possiblePawnMovesAtStart);

            }
            case THREE -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 3);

            case FOUR -> possiblePawnMoves = this.findPossiblePawnMovesForBackwards(colorPawnsToIterateThrough, 4);

            case FIVE -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 5);

            case SEVEN -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 7);

            case EIGHT -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 8);

            case TEN -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 10);

            case ELEVEN -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 11);

            case TWELVE-> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 12);

            case SORRY -> possiblePawnMoves = this.findPossiblePawnMovesForForwards(colorPawnsToIterateThrough, 13);
        }
    }

    /**
     * Carries out the pawn move in the logic (backend)
     * @param cardValue the card drawn by the player on their turn
     */
    public void movePawn(CardValue cardValue){
        switch(cardValue){
            case ONE -> {
                if(pawnToMove != null){

                    if(pawnToMove.isOnBoard()){
                        this.moveForward(pawnToMove,1);
                    }

                    else if(pawnToMove.isAtStart()){
                        this.moveFromStart(pawnToMove);
                    }
                }
            }
            case TWO -> {

                if(pawnToMove != null){

                    if(pawnToMove.isOnBoard()){
                        this.moveForward(pawnToMove,2);
                    }

                    else if(pawnToMove.isAtStart()){
                        this.moveFromStart(pawnToMove);
                    }
                }
            }
            case THREE -> {

                if(this.pawnToMove != null)
                    this.moveForward(this.pawnToMove,3);
            }
            case FOUR -> {

                if(pawnToMove != null){
                    this.moveBackward(pawnToMove, 4);
                }
            }
            case FIVE -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,5);
            }
            case SEVEN -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,7);
            }
            case EIGHT -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,8);
            }
            case TEN -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,10);
            }

            case ELEVEN -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,11);
            }

            case TWELVE -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,12);
            }

            case SORRY -> {

                if(pawnToMove != null)
                    this.moveForward(pawnToMove,13);
            }
        }
    }

    /**
     * moves pawnToMove from start
     * @param pawnToMove the pawn to move on that turn
     */
    private void moveFromStart(Pawn pawnToMove) {

        int indexAfterStartCircle = this.converter.convertToBoardIndex(2);

        if(this.gameBoard.getMapOfSpaces().get(indexAfterStartCircle).equals(SpaceType.OCCUPIED)) {
            Pawn pawnToRemove = this.findPawnFromBoardIndex(indexAfterStartCircle);
            this.gameBoard.getMapOfBoard().remove(pawnToRemove);
            this.gameBoard.getMapOfBoard().put(pawnToMove, indexAfterStartCircle);
            pawnToMove.moveFromStart();
            pawnToRemove.sendStart();
            this.listOfPawnsToMoveToStart.add(pawnToRemove);
        }

        else{
            this.gameBoard.getMapOfBoard().put(pawnToMove, indexAfterStartCircle);
            this.gameBoard.getMapOfSpaces().put(indexAfterStartCircle, SpaceType.OCCUPIED);
            pawnToMove.moveFromStart();
        }

        this.pawnToMove.setLandingIndex(indexAfterStartCircle);
    }

    /**
     * move a pawn backwards a certain number of spaces
     * 1. check if different color occupies space, and if it does, move it back to start, and don't have to update space because already occupied
     * 2. check if land on start of different color pawn slide, will have to boot all pawns back to start and move down slide and set space to occupied
     * 3. check if pawn ends up in the end circle
     * 4. normal, just move forwards and set space type to occupied
     * @param pawnToMove the pawn to move on that specific turn
     * @param numSpaces the number of spaces to move
     */
    private void moveBackward(Pawn pawnToMove, int numSpaces){
        int currBoardIndex = this.gameBoard.getMapOfBoard().get(pawnToMove);
        int currBoardColorIndex = this.converter.convertToColorIndex(currBoardIndex);
        int landingBoardColorIndex;
        int landingBoardIndex = 100000;

        if(currBoardColorIndex > 4) {
            landingBoardColorIndex = currBoardColorIndex - numSpaces;
            landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
        }

        else{
            switch(currBoardColorIndex){
                case 1 -> {
                    landingBoardColorIndex = 57;
                    landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
                }
                case 2 -> {
                    landingBoardColorIndex = 58;
                    landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
                }
                case 3 -> {
                    landingBoardColorIndex = 59;
                    landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
                }
                case 4 -> {
                    landingBoardColorIndex = 60;
                    landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
                }
            }
        }

        SpaceType landingIndexSpaceType = this.gameBoard.getMapOfSpaces().get(landingBoardIndex);

        if(landingIndexSpaceType.equals(SpaceType.OCCUPIED)){
            moveForwardOccupied(pawnToMove, landingBoardIndex, currBoardIndex);
        }

        else if(landingIndexSpaceType.equals(SpaceType.START_SHORT_SLIDE_DIFFERENT)){
            moveForwardShortSlide(pawnToMove, currBoardIndex, landingBoardIndex);
        }

        else if(landingIndexSpaceType.equals(SpaceType.START_LONG_SLIDE_DIFFERENT)){
            moveForwardLongSlide(pawnToMove, currBoardIndex, landingBoardIndex);
        }

        else{
            moveForwardBaseCase(pawnToMove, currBoardIndex, landingBoardIndex);
        }

        this.pawnToMove.setLandingIndex(landingBoardIndex);
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
        int currBoardColorIndex = this.converter.convertToColorIndex(currBoardIndex);
        int landingBoardColorIndex = currBoardColorIndex + numSpaces;
        int landingBoardIndex = this.converter.convertToBoardIndex(landingBoardColorIndex);
        SpaceType landingIndexSpaceType = this.gameBoard.getMapOfSpaces().get(landingBoardIndex);

        if(landingIndexSpaceType.equals(SpaceType.OCCUPIED)){
            moveForwardOccupied(pawnToMove, landingBoardIndex, currBoardIndex);
        }

        else if(landingIndexSpaceType.equals(SpaceType.START_SHORT_SLIDE_DIFFERENT)){
            moveForwardShortSlide(pawnToMove, currBoardIndex, landingBoardIndex);
        }
        else if(landingIndexSpaceType.equals(SpaceType.START_LONG_SLIDE_DIFFERENT)){
            moveForwardLongSlide(pawnToMove, currBoardIndex, landingBoardIndex);
        }

        else if(landingBoardColorIndex == Pawn.MAX_INDEX){
            moveForwardReachedEnd(pawnToMove, currBoardIndex, landingBoardIndex);
        }

        else{
            moveForwardBaseCase(pawnToMove, currBoardIndex, landingBoardIndex);
        }
    }

    /**
     * helper function called in the case that a pawn moves forwards onto a space occupied by a different color pawn
     * @param pawnToMove the pawn to move
     * @param landingBoardIndex the landing board index
     * @param currBoardIndex the current board index of the pawn to move
     */
    private void moveForwardOccupied(Pawn pawnToMove, int landingBoardIndex, int currBoardIndex) {
        Pawn pawnToRemove = this.findPawnFromBoardIndex(landingBoardIndex);
        this.gameBoard.getMapOfBoard().remove(pawnToRemove);
        this.gameBoard.getMapOfBoard().remove(pawnToMove);
        this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex);
        pawnToRemove.sendStart();
        this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);
        this.listOfPawnsToMoveToStart.add(pawnToRemove);
    }

    /**
     * helper function called in the case that a pawn moves forwards onto the start index of different color short slide
     * @param pawnToMove the pawn to move
     * @param landingBoardIndex the landing board index
     * @param currBoardIndex the current board index of the pawn to move
     */
    private void moveForwardShortSlide(Pawn pawnToMove, int currBoardIndex, int landingBoardIndex) {
        this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);

        Pawn pawnToRemoveAtStartSlide = this.findPawnFromBoardIndex(landingBoardIndex);

        if(pawnToRemoveAtStartSlide != null){
            this.gameBoard.getMapOfBoard().remove(pawnToRemoveAtStartSlide);
            pawnToRemoveAtStartSlide.sendStart();
            this.listOfPawnsToMoveToStart.add(pawnToRemoveAtStartSlide);

        }

        for(int index = landingBoardIndex + 1; index < landingBoardIndex + 4; index++){
            if(this.gameBoard.getMapOfSpaces().get(index).equals(SpaceType.OCCUPIED)){
                Pawn pawnToRemoveOnSlide = this.findPawnFromBoardIndex(index);
                this.gameBoard.getMapOfBoard().remove(pawnToRemoveOnSlide);
                pawnToRemoveOnSlide.sendStart();
                this.gameBoard.getMapOfSpaces().put(index, SpaceType.UNOCCUPIED);
                this.listOfPawnsToMoveToStart.add(pawnToRemoveOnSlide);
            }
        }

        this.gameBoard.getMapOfBoard().remove(pawnToMove);
        this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex + 3);
        this.pawnToMove.setLandingIndex(landingBoardIndex + 3);
    }

    /**
     * helper function called in the case that a pawn moves forwards onto the start index of different color long slide
     * @param pawnToMove the pawn to move
     * @param landingBoardIndex the landing board index
     * @param currBoardIndex the current board index of the pawn to move
     */
    private void moveForwardLongSlide(Pawn pawnToMove, int currBoardIndex, int landingBoardIndex) {
        this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);

        Pawn pawnToRemoveAtStartSlide = this.findPawnFromBoardIndex(landingBoardIndex);

        if(pawnToRemoveAtStartSlide != null){
            this.gameBoard.getMapOfBoard().remove(pawnToRemoveAtStartSlide);
            pawnToRemoveAtStartSlide.sendStart();
            this.listOfPawnsToMoveToStart.add(pawnToRemoveAtStartSlide);
        }

        for(int index = landingBoardIndex + 1; index < landingBoardIndex + 5; index++){
            if(this.gameBoard.getMapOfSpaces().get(index).equals(SpaceType.OCCUPIED)){
                Pawn pawnToRemoveOnSlide = this.findPawnFromBoardIndex(index);
                this.gameBoard.getMapOfBoard().remove(pawnToRemoveOnSlide);
                pawnToRemoveOnSlide.sendStart();
                this.gameBoard.getMapOfSpaces().put(index, SpaceType.UNOCCUPIED);
                this.listOfPawnsToMoveToStart.add(pawnToRemoveOnSlide);
            }
        }

        this.gameBoard.getMapOfBoard().remove(pawnToMove);
        this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex + 4);
        this.pawnToMove.setLandingIndex(landingBoardIndex + 4);
    }

    /**
     * helper function called in the case that a pawn moves forwards into its home
     * @param pawnToMove the pawn to move
     * @param landingBoardIndex the landing board index
     * @param currBoardIndex the current board index of the pawn to move
     */
    private void moveForwardReachedEnd(Pawn pawnToMove, int currBoardIndex, int landingBoardIndex) {
        this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);
        this.gameBoard.getMapOfBoard().remove(pawnToMove);
        this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex);
        pawnToMove.reachedEnd();
        this.pawnToMove.setLandingIndex(landingBoardIndex);
    }

    /**
     * helper function called in the case that a pawn moves forwards with no edge cases
     * @param pawnToMove the pawn to move
     * @param landingBoardIndex the landing board index
     * @param currBoardIndex the current board index of the pawn to move
     */
    private void moveForwardBaseCase(Pawn pawnToMove, int currBoardIndex, int landingBoardIndex) {
        this.gameBoard.getMapOfBoard().remove(pawnToMove);
        this.gameBoard.getMapOfSpaces().put(currBoardIndex, SpaceType.UNOCCUPIED);
        this.gameBoard.getMapOfBoard().put(pawnToMove, landingBoardIndex);
        this.gameBoard.getMapOfSpaces().put(landingBoardIndex, SpaceType.OCCUPIED);
        this.pawnToMove.setLandingIndex(landingBoardIndex);
    }

    /**
     * helper function that determines the specific {@link PawnColor} to iterate through
     * @return the {@link ArrayList} of specific color pawns to iterate through
     */
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

    /**
     * updates {@link #converter}
     * @return the {@link BoardPawnIndexConverter} interface object depending on {@link #pawnColor}
     */
    private BoardPawnIndexConverter determineConverter(){
        return switch(this.pawnColor){
            case RED -> this.converter = new RedConverter();
            case BLUE -> this.converter = new BlueConverter();
            case YELLOW -> this.converter = new YellowConverter();
            case GREEN -> this.converter = new GreenConverter();
        };
    }

    /**
     * Helper function called by {@link #findPossiblePawnMoves(Card)}
     * @param arr the {@link ArrayList} of {@link Pawn} objects to iterate through, which was determined in the previous function
     * @param numSpaces the number of spaces to move
     * @return an {@link ArrayList} of {@link Pawn} objects that are possible pawn moves
     */
    private ArrayList<Pawn> findPossiblePawnMovesForForwards(ArrayList<Pawn> arr, int numSpaces) {
        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();

        for (Pawn pawn: arr) {

            if (pawn.isOnBoard()){
                int pawnIndexColor = this.converter.convertToColorIndex(this.gameBoard.getMapOfBoard().get(pawn));

                if(pawnIndexColor <= (Pawn.MAX_INDEX - numSpaces)){
                    int landingBoardIndex = this.converter.convertToBoardIndex(pawnIndexColor + numSpaces);

                    if ((this.gameBoard.getMapOfSpaces().get(landingBoardIndex).equals(SpaceType.OCCUPIED))){

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

    /**
     * Helper function called by {@link #findPossiblePawnMoves(Card)}
     * @param colorPawnsToIterateThrough the {@link ArrayList} of {@link Pawn} objects to iterate through, which was determined in the previous function
     * @return an {@link ArrayList} of {@link Pawn} objects that are possible pawn moves
     */
    private ArrayList<Pawn> findPossiblePawnMovesAtStart(ArrayList<Pawn> colorPawnsToIterateThrough) {
        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();
        for(Pawn pawn: colorPawnsToIterateThrough){

            if(pawn.isAtStart()){
                int indexAfterStartCircle = this.converter.convertToBoardIndex(2);

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

    /**
     * Helper function called by {@link #findPossiblePawnMoves(Card)}
     * @param colorPawnsToIterateThrough the {@link ArrayList} of {@link Pawn} objects to iterate through, which was determined in the previous function
     * @return an {@link ArrayList} of {@link Pawn} objects that are possible pawn moves
     */
    private ArrayList<Pawn> findPossiblePawnMovesForBackwards(ArrayList<Pawn> colorPawnsToIterateThrough, int numSpaces) {

        ArrayList<Pawn> possiblePawnMoves = new ArrayList<>();

        for(Pawn pawn: colorPawnsToIterateThrough){

            if (pawn.isOnBoard()){
                int pawnIndexColor = this.converter.convertToColorIndex(this.gameBoard.getMapOfBoard().get(pawn));

                int landingBoardIndex = 10000000;

                if(pawnIndexColor > 4) {
                    landingBoardIndex = this.converter.convertToBoardIndex(pawnIndexColor - numSpaces);
                }

                else{
                    switch(pawnIndexColor){
                        case 1 -> landingBoardIndex = this.converter.convertToBoardIndex(57);
                        case 2 -> landingBoardIndex = this.converter.convertToBoardIndex(58);
                        case 3 -> landingBoardIndex = this.converter.convertToBoardIndex(59);
                        case 4 -> landingBoardIndex = this.converter.convertToBoardIndex(60);
                    }
                }

                if ((this.gameBoard.getMapOfSpaces().get(landingBoardIndex).equals(SpaceType.OCCUPIED))){

                    if(!(this.findPawnFromBoardIndex(landingBoardIndex).getColor().equals(this.pawnColor))) {
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

    /**
     * simple helper function to find a {@link Pawn} from an index
     * @param index the board index to find a {@link Pawn} object
     * @return
     */
    public Pawn findPawnFromBoardIndex(int index){
        for (Pawn pawn: this.gameBoard.getMapOfBoard().keySet()){

            if (this.gameBoard.getMapOfBoard().get(pawn) == index){
                return pawn;
            }
        }
        return null;
    }

    /**
     * A lot of getter and setter methods
     */
    public PawnColor getPawnColor(){
        return this.pawnColor;
    }

    public ArrayList<Pawn> getPossiblePawnMoves() {
        return possiblePawnMoves;
    }

    public Pawn getPawnToMove() {
        return pawnToMove;
    }

    public void setPawnToMove(Pawn pawnToMove) {
        this.pawnToMove = pawnToMove;
    }

    public ArrayList<Pawn> getListOfPawnsToMoveToStart() {
        return this.listOfPawnsToMoveToStart;
    }

    public void clearListOfPawnsToMoveToStart(){
        this.listOfPawnsToMoveToStart.clear();
    }

    public Card getDrawnCard() {
        return drawnCard;
    }

    public void setDrawnCard(Card drawnCard) {
        this.drawnCard = drawnCard;
    }
}
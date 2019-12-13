package Launcher;

import Game.Board;
import Tokens.*;

import java.io.FileNotFoundException;


public class Launcher {
    public static void main(String[] args) throws FileNotFoundException {
        Problem problem2 = Problem.createFromFile("2.txt");
        Board board = problem2.createBoard();
        ConsoleDisplay console = new ConsoleDisplay();

        board.setDisplay(console);
        board.addPiece(new Target(Facing.EAST), 4, 3);
        board.getLaser().setOn(true);
        board.getLaser().setDirection(Facing.NORTH);
        board.draw();

        System.out.println(console.drawBoardToString(board));
        System.out.println(problem2.getSolutionText());
        if(console.drawBoardToString(board).equals(problem2.getSolutionText()))
            System.out.println("*** SUCCESS ***");
        else
            System.out.println("*** FAILURE !!!");

    }
}

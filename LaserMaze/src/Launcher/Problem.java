package Launcher;

import Game.Board;
import Tokens.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem {
    private static String solutionText;
    private static Board board;

    static Problem createFromFile(String str){
        Problem problem = new Problem();
        board = new Board();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;
        String[] tokens;

        int j = 0; // row index
        scanner.nextLine(); // skip header
        scanner.nextLine();
        while(scanner.hasNextLine() && j < 5) { // read problem
            line = scanner.nextLine();
            tokens = line.split("\\|");
            List<String> list = new LinkedList<>(Arrays.asList(tokens));
            list.remove(0); // remove extra index added by regex

            for(String token : list){
                Facing dir = Facing.NONE;
                Token curToken = new Empty();
                switch(token.charAt(1)){ // determine direction
                    case 'N':
                        dir = Facing.NORTH;
                        break;
                    case 'S':
                        dir = Facing.SOUTH;
                        break;
                    case 'W':
                        dir = Facing.WEST;
                        break;
                    case 'E':
                        dir = Facing.EAST;
                        break;
                    case '?':
                        dir = Facing.NONE;
                        break;
                    default:
                        break;
                }

                switch (token.charAt(0)) { // determine game token
                    case 'L':
                        curToken = new Laser(dir);
                        board.setLaser((Laser) curToken);
                        break;
                    case 'T':
                        curToken = new Target(dir);
                        break;
                    case 'Z':
                        curToken = new Target(dir);
                        ((Target) curToken).setLit(true);
                        break;
                    case 'B':
                        curToken = new BeamSplitter(dir);
                        break;
                    case 'M':
                        curToken = new DoubleMirror(dir);
                        break;
                    case 'P':
                        curToken = new Checkpoint(dir);
                        break;
                    case 'K':
                        curToken = new CellBlocker();
                        break;
                    case ' ':
                        curToken = new Empty();
                        break;
                    default:
                        break;
                }
                board.addPiece(curToken, list.indexOf(token), j);
            }
            j++;
        }

        //read solution
        scanner.nextLine(); // skip header
        solutionText = "";
        while(scanner.hasNextLine()) { // read problem
            solutionText += scanner.nextLine();
            solutionText += "\n";
        }

        return problem;
    }

    public Board createBoard(){
        return board;
    }

    public String getSolutionText(){
        return solutionText;
    }

    public void setSolutionText(String str){
        this.solutionText = str;
    }
}

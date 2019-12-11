package Launcher;

import Game.Board;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem {
    private String solutionText;

    static Problem createFromFile(String str){
        Problem problem = new Problem();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;
        String[] tokens;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            tokens = line.split("|");

            for(String token : tokens){
                switch (token) {
                    default:
                        System.out.print(token);
                        break;
                }
            }
            System.out.println();
        }
        return problem;
    }

    public Board createBoard(){
        return new Board();
    }

    public String getSolutionText(){
        return solutionText;
    }

    public void setSolutionText(String str){
        this.solutionText = str;
    }
}

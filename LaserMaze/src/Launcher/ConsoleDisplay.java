package Launcher;

import Game.Board;
import Game.GridSpot;

public class ConsoleDisplay {
    public String drawBoardToString(Board board){
        String str = "";
        for(GridSpot[] ga : board.getGrid()){
            for(GridSpot g : ga){
                str += "|";
                str += g.toString();

            }
            str += "|";
            str += "\n";
        }
        return str;
    }
}

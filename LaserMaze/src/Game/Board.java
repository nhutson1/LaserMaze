package Game;

import Launcher.ConsoleDisplay;
import Tokens.Facing;
import Tokens.Laser;
import Tokens.Token;

public class Board {
    private GridSpot[][] grid;
    private Laser laser;
    private ConsoleDisplay console;

    public Board(){
        grid = new GridSpot[5][5];
        for (int i=0; i<5; i++) {
            for(int j=0; j<5; j++){
                grid[i][j] = new GridSpot();
            }
        }

        laser = new Laser(Facing.NONE);
    }

    public void setDisplay(ConsoleDisplay console){
        this.console = console;
    }

    public void addPiece(Token tok, int x, int y){
        grid[y][x].setOccupant(tok);
    }

    public void draw(){
        this.console.drawBoardToString(this);
    }

    public Laser getLaser() {
        return laser;
    }

    public void setLaser(Laser laser) {
        this.laser = laser;
    }

    public GridSpot[][] getGrid() {
        return grid;
    }

    public void setGrid(GridSpot[][] grid) {
        this.grid = grid;
    }
}

package Game;

import Launcher.ConsoleDisplay;
import Tokens.Laser;
import Tokens.Token;

public class Board {
    private GridSpot[][] grid;
    private Laser laser;

    public Board(){
        grid = new GridSpot[5][5];
        for (int i=0; i<5; i++) {
            for(int j=0; j<5; j++){
                grid[i][j] = new GridSpot();
            }
        }

        laser = new Laser();
    }

    public void setDisplay(ConsoleDisplay console){

    }

    public void addPiece(Token tok, int x, int y){
        System.out.println(x + " " + y);
        grid[x-1][y-1].setOccupant(tok);
    }

    public void draw(){

    }

    public Laser getLaser() {
        return laser;
    }

    public void setLaser(Laser laser) {
        this.laser = laser;
    }
}

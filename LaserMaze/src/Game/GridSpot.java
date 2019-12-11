package Game;

import Tokens.Empty;
import Tokens.Token;

public class GridSpot {
    private Token occupant;

    GridSpot(){
        occupant = new Empty();
    }

    public Token getOccupant() {
        return occupant;
    }

    public void setOccupant(Token occupant) {
        this.occupant = occupant;
    }
}

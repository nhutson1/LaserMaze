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

    public String toString(){
        String str = "";
        str += occupant.getCharRepresentation();
        switch (occupant.getDirection()){
            case NONE:
                str += " ";
                break;
            case EAST:
                str += "E";
                break;
            case WEST:
                str += "W";
                break;
            case NORTH:
                str += "N";
                break;
            case SOUTH:
                str += "S";
                break;
            default:
                break;
        }
        return str;
    }
}

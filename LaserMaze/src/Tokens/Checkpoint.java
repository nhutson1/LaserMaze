package Tokens;

public class Checkpoint extends Token {
    public Checkpoint(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'P';
    }
}

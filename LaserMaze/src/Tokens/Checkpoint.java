package Tokens;

public class Checkpoint extends Token {
    Checkpoint(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'P';
    }
}

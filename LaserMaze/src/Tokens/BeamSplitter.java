package Tokens;

public class BeamSplitter extends Token {
    BeamSplitter(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'B';
    }
}

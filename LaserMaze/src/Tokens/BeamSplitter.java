package Tokens;

public class BeamSplitter extends Token {
    public BeamSplitter(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'B';
    }
}

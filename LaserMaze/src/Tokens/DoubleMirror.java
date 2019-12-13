package Tokens;

public class DoubleMirror extends Token {
    public DoubleMirror(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'M';
    }
}

package Tokens;

public class DoubleMirror extends Token {
    DoubleMirror(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'M';
    }
}

package Tokens;

public class Target extends Token {
    Target(){
        this.direction = Facing.NONE;
    }

    public Target(Facing dir){
        this.direction = dir;
    }
}

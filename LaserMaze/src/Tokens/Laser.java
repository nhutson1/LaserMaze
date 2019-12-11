package Tokens;

public class Laser extends Token {
    public Laser(){
        this.direction = Facing.NONE;
    }

    public Laser(Facing dir){
        this.direction = dir;
    }

    public void setOn(Boolean b){

    }
}

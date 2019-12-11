package Tokens;

public class Target extends Token {
    private boolean Lit = false;

    Target(){
        this.direction = Facing.NONE;
    }

    public Target(Facing dir){
        this.direction = dir;
    }

    public boolean isLit() {
        return Lit;
    }

    public void setLit(boolean lit) {
        Lit = lit;
    }
}

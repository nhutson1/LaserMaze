package Tokens;

public class Target extends Token {
    private boolean Lit = false;

    public Target(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'T';
    }

    public boolean isLit() {
        return Lit;
    }

    public void setLit(boolean lit) {
        Lit = lit;
        if(lit == true)
            this.charRepresentation = 'Z';
        else
            this.charRepresentation = 'T';
    }
}

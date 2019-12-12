package Tokens;

public class Laser extends Token {
    private boolean active;

    public Laser(Facing dir){
        this.direction = dir;
        this.charRepresentation = 'L';
    }

    public void setOn(Boolean b) {
        this.active = b;
    }

    public boolean isActive(){
        return active;
    }
}

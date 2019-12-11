package Tokens;

public abstract class Token {
    protected Facing direction;

    public Facing getDirection() {
        return direction;
    }

    public void setDirection(Facing direction) {
        this.direction = direction;
    }
}

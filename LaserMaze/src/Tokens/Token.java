package Tokens;

public abstract class Token {
    protected Facing direction;
    protected char charRepresentation;

    public Facing getDirection() {
        return direction;
    }

    public void setDirection(Facing direction) {
        this.direction = direction;
    }

    public char getCharRepresentation() {
        return charRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }
}

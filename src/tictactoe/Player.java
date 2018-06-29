package tictactoe;

public enum Player {
    COMPUTER("X"), USER("O"), NONE("-");
    public final String text;
    private Player(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}

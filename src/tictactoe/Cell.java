package tictactoe;

public class Cell {
    private int x;      // x-coordinate(0-2) of cell
    private int y;      // y-coordinate(0-2) of cell
    private int minimaxValue;       // minimax value for a cell

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMinimaxValue() {
        return minimaxValue;
    }

    public void setMinimaxValue(int minimaxValue) {
        this.minimaxValue = minimaxValue;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

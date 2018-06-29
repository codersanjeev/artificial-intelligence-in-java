package tictactoe;

import java.util.Random;

public class Game {
    Board board;
    Random random;

    public Game(){
        initializeGame();
        displayBoard();
        makeFirstMove();
        playGame();
        checkStatus();
    }

    private void makeFirstMove() {
        System.out.println("Who Starts ?\n1 for Computer\n2 for User");
        int choice = board.getScanner().nextInt();
        if(choice == 1){
            Cell cell = new Cell(random.nextInt(Constants.BOARD_SIZE),
                    random.nextInt(Constants.BOARD_SIZE));
            this.board.move(cell, Player.COMPUTER);
            displayBoard();
        }
    }

    private void playGame(){
        while(this.board.isRunning()){
            System.out.println("User input : ");
            Cell userCell = new Cell(board.getScanner().nextInt(),
                    board.getScanner().nextInt());
            this.board.move(userCell, Player.USER);
            displayBoard();
            if(!this.board.isRunning())
                break;
            this.board.callMiniMax(0, Player.COMPUTER);
            for(Cell cell : this.board.getRootValues()){
                System.out.println("Cell Value : " + cell + " Minimax Value : " + cell.getMinimaxValue());
            }
            this.board.move(board.getBestMove(), Player.COMPUTER);
            displayBoard();
        }
    }

    private void initializeGame() {
        this.board = new Board();
        this.board.setupBoard();
        this.random = new Random();
    }



    private void checkStatus(){
        if(board.isWinning(Player.COMPUTER))
            System.out.println("Computer has won");
        else if(board.isWinning(Player.USER))
            System.out.println("Player has won");
        else
            System.out.println("Its a draw");
    }

    private void displayBoard(){
        this.board.displayBoard();
    }
}

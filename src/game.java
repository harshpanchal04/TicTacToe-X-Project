import java.util.List;

public class game {
    board board;
    List<player> ListOfPlayers;
    int nextPlayerMoveIndex;
    player winner;
    List<Move> ListOfMoves;
    gameState gameState;

    game(board board,gameState state, int move ){
        this.board = board;
        this.gameState = state;
        this. nextPlayerMoveIndex = move;
    }
    public static void main(String[] args) {

    }
}
package ChessPieces;
import Chess.ChessPiece;
import boardgame.Board;
import Chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
}

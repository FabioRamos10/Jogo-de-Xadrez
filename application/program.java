package application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPosition;
import Chess.ChessPiece;

public class program {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.reaChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.reaChessPosition(sc);
			
            ChessPiece capturedPiece = chessMatch.performaChessMove(source, target);		}
	}
}
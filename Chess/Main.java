
public class Main {

	public static void main(String[] args) {
		Bishop bishop = new Bishop();
		bishop.setX(3);
		bishop.setY(1);
		System.out.println(bishop.checkMove(5, 5));
		Queen queen = new Queen();
		queen.setX(4);
		queen.setY(1);
		System.out.println(queen.checkMove(5, 5));
		Rook rook = new Rook();
		rook.setX(1);
		rook.setY(1);
		System.out.println(rook.checkMove(1, 5));
		Knight knight = new Knight();
		knight.setX(2);
		knight.setY(1);
		System.out.println(knight.checkMove(3, 3));
		Pawn pawn = new Pawn();
		pawn.setX(4);
		pawn.setY(2);
		System.out.println(pawn.checkMove(5, 3));
		King king = new King();
		king.setX(5);
		king.setY(1);
		System.out.println(king.checkMove(6, 2));
	}

}

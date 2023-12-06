
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(rook.checkMove(1, 8));
		
	}

}

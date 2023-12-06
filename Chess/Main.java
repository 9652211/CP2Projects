
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bishop bishop = new Bishop();
		bishop.setX(1);
		bishop.setY(1);
		System.out.println(bishop.checkMove(5, 5));
		Queen queen = new Queen();
		queen.setX(5);
		queen.setY(5);
		System.out.println(queen.checkMove(5, 5));
	}

}

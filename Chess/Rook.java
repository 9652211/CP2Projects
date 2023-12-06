
public class Rook implements Pieces {
	private int x;
	private int y;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean checkMove(int checkX, int checkY) {
		if (checkX>0 && checkX<9 && checkY>0 && checkY<9 && ((checkX-x)==0||(checkY-y)==0)) {
			return true;
		} else {
			return false;
		}
		
	}
}

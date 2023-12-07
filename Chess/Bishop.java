
public class Bishop implements Pieces {
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
		if (!((checkX==x)&&(checkY==y)) && checkX>0 && checkX<9 && checkY>0 && checkY<9 && Math.abs(checkX-x)==Math.abs(checkY-y)) {
			return true;
		} else {
			return false;
		}
		
	}
}

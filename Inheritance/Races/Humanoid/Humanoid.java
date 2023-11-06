import java.util.ArrayList;

public class Humanoid extends Races {
	protected String maternal;
	protected String paternal;
	protected String spouse;
	ArrayList<String> children = new ArrayList<String>();
	
	public Humanoid() {
		maternal = "";
		paternal = "";
		spouse = "";
	}

}

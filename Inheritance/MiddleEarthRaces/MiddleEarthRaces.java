
public class MiddleEarthRaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vanyar elenwe = new Vanyar();
		elenwe.name = "Elenwë";
		elenwe.spouse = "Turgon";
		elenwe.children.add("Elwing");
		elenwe.sing();
		Noldor galadriel = new Noldor();
		galadriel.name = "Galadriel";
		galadriel.maternal = "Earwen";
		galadriel.paternal = "Finarfin";
		galadriel.children.add("Celebrian");
		galadriel.spouse = "Celeborn";
		galadriel.house = "Finwe";
		Teleri earwen = new Teleri();
		earwen.name = "Earwen";
		earwen.spouse = "Finarfin";
		earwen.paternal = "Olwe";
		earwen.children.add("Finrod");
		earwen.children.add("Angrod");
		earwen.children.add("Aegnor");
		earwen.children.add("Galadriel");
		earwen.location = "Alqualonde";
	}

}

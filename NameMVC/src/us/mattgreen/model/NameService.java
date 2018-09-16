package us.mattgreen.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameService {

	private List<Name> nameList = Arrays.asList(
		new Name("1", "Fred", "Jones"),
		new Name("2", "Joe", "Smith"),
		new Name("3","Price","Abbiss"),
        new Name("4","Lauree","Echalier"),
			new Name("5","Marin","Iannuzzi"),
			new Name("6","Locke","Campanelli"),
			new Name("7","Holden","Brundill"),
			new Name("8","Blythe","Rickett"),
			new Name("9","Jaquelyn","Birks"),
			new Name("10","Artair","Poskitt"),
			new Name("11","Keely","Gleder"),
			new Name("12","Welch","Forsyth"),
			new Name("13","Rouvin","Leaves"),
			new Name("14","Gibb","Hillborne"),
			new Name("15","Alfonso","Fuller"),
			new Name("16","Joanna","Fitchen"),
			new Name("17","Brynn","Tue"),
			new Name("18","Frazier","Statter"),
			new Name("19","Raul","Pideon"),
			new Name("20","Morganne","Marlin"),
			new Name("21","Joye","Waren"),
			new Name("22","Darren","Coolson"),
			new Name("23","Amy","Yockney"),
			new Name("24","Flss","Cocher"),
			new Name("25","Nobe","Rumford"),
			new Name("26","Ignacio","Gorries"),
			new Name("27","Lowe","Stachini"),
			new Name("28","Allianora","Cooley"),
			new Name("29","Raquela","Kelcher"),
			new Name("30","Carma","Nutting"),
			new Name("31","Frannie","Burel"),
			new Name("32","Stillmann","Mucklo"),
			new Name("33","Josiah","Killingbeck"),
			new Name("34","Reena","Bim"),
			new Name("35","Skippy","Jenkerson"),
			new Name("36","Dyane","Cansdall"),
			new Name("37","Madelene","Ambrogio"),
			new Name("38","Huntlee","Quarmby"),
			new Name("39","Lucilia","MacMichael"),
			new Name("40","Page","Levin"),
			new Name("41","Tad","Hyland"),
			new Name("42","Ewell","Imlin"),
			new Name("43","Giusto","Joontjes"),
			new Name("44","Randy","Linde"),
			new Name("45","Hulda","Sausman"),
			new Name("46","Aldis","Oldred"),
			new Name("47","Ann-marie","Vearncombe"),
			new Name("48","Uri","Slayny"),
			new Name("49","Marguerite","Tuft"),
			new Name("50","Fanny","Dureden"),
			new Name("51","Meredith","Donke"),
			new Name("52","Curtice","Maffini"),
			new Name("53","Alysia","Attrey"),
			new Name("54","Nanni","Pressdee"),
			new Name("55","Demetri","Paxeford"),
			new Name("56","Wang","Mc Kellen"),
			new Name("57","Alli","McVeighty"),
			new Name("58","Meris","Plain"),
			new Name("59","Seamus","Stillmann"),
			new Name("60","Constance","Castard"),
			new Name("61","Benedikt","Grewe"),
			new Name("62","Audy","Phippin"),
			new Name("63","Cammy","Bateman"),
			new Name("64","Mitchel","Hamshere"),
			new Name("65","Carrol","Dable"),
			new Name("66","Maria","BoHlingolsen"),
			new Name("67","Tremaine","Guiduzzi"),
			new Name("68","Lurline","Jayes"),
			new Name("69","Brig","Ropartz")
	);

	public Name getName(String id) {
		Name theName = null;

		for (Name name : nameList) {
			if (name.getId().equals(id)) {
				theName = name;
			}
		}

		return theName;
	}

	public List<Name> getAllNames(){
		return nameList;
	}

	public List<Name> findNames(String search) {
		search = search.toLowerCase();
		List<Name> theList = new ArrayList<>();
		for (Name name : nameList) {
			if (name.getFirst().toLowerCase().startsWith(search) ||
			    name.getLast().toLowerCase().startsWith(search)) {
				theList.add(name);
			}
		}
		return theList;
	}
	
}

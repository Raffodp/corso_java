package view;

public class prova {

	public static void main(String[] args) {

		
		String[] nani = {
				"pisolo",
				"eolo",
				"mammolo",
				"dotto",
				"cucciolo",
				"brontolo",
				"gongolo",
		};
		
		for (int i = 0; i<nani.length; i++) {
			System.out.println(nani[i]);
		}
		
		for (String tuttiNani : nani) {
			
			System.out.println(tuttiNani.toUpperCase());
			
		}
	}

}

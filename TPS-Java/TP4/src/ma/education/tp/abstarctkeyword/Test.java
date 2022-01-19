package ma.education.tp.abstarctkeyword;

public class Test {

	public static void main(String[] args) {
	 
		//FormeGeometrique f1 =new FormeGeometrique();//Ereur de compilation 
		//FormeGeometrique f2 = new FormeGeoTypeA(); //Ereur de compilation 
		
		FormeGeometrique f3 = new Triangle(); // class fille triangle
		FormeGeometrique f4 = new FormeGeometrique() {
			@Override // Classe fille Annonyme
			public double calculerSurface() {
				return 22;

			}
		};
	
	}
}
class TrigTableRad { 
		public static void main (String args[]){
		double c,s,t; 
		int d = 0;
		double r = 0, rround = 0;
		double pi = 3.141592;
		double i = (pi/12);
		String undefined = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\t\t rad \t\t| cos(radian) \t\t| sin(rad) \t\t| tan(rad)" );
		while (r <= (2*pi)){
			c = Math.cos(r);
			s = Math.sin(r);
			t = Math.tan(r);
			rround = (Math.round(r*1000.0))/1000.0;
			System.out.println("\t\t"+rround+ "\t\t | "+ c +"\t\t "+ s + " \t\t " + t);
			r = r + i;
		}
	}
}


class TrigTableDeg {

	public static void main (String args[]){
		double c,s,t; //temp double for cosine, sine and tangent so they can be rounded
		long d = 0L; // degrees
		double r =0, rround = 0;// radian measure
		double pi = 3.14159265358979323846;
		int i = 15;  //increment r 15 degrees equals pi radians
		// time caluclation
		final long ms0, ms1;
			final float sec0, sec1;

			ms0 = System.currentTimeMillis();
		// end of time calculation
		String un = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\trad \t|\tcos\t|\tsin\t|\ttan" );
		System.out.println("----------------------------------------------------------------------" );
		// 9 223 372 036 854 775 807   18446744073709551614
		// compile then change 2147483648 to 2147483647
		while (d <=  360){
			//convert angle t to radians r
			r = d * (pi/180.0);
			c = Math.cos(r);
			c = (Math.round(c *1000.0))/1000.0;
			s = Math.sin(r);
			s = (Math.round(s *1000.0))/1000.0;
			t = Math.tan(r);
			t = (Math.round(t *1000.0))/1000.0;
			rround = (Math.round(r*1000.0))/1000.0;

			if (c == 0.0)
				{ System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t UN ");  
				}else{
				  System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t" + t);
				}
			d = d + i;		
		}
		
		// time caluclation
			ms1 = System.currentTimeMillis();
			sec1 = ms1 / 1000000000.0f;
			System.out.println("********************************");
			System.out.print("BEFORE LOOP\t\t\t");
			System.out.println(ms0);
			System.out.print("AFTER LOOP\t\t\t");
			System.out.println(ms1);
		//	System.out.format("%.10f", ms0);
			System.out.println();
		//	System.out.format("%.10f", ms1);
				System.out.println("********************************");
		// end of time calculation
		
	}
}


class AscMe {
	public static void main (String a[]){
		int i;
		char c;
		System.out.print("interger    character");
		
		for (i = 0; i < 1000; i++ ){
			c = (char)i;
			System.out.print(i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
}
}
}

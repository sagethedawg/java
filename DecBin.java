class DecBin{
public static void main (String a[]){
int n;
String bin; String hex;
for (n = 0; n <= 32; n ++){
System.out.print(n);
bin = Integer.toBinaryString(n);
System.out.print(" ");
System.out.println(bin);
}

}
}

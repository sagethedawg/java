import java.util.Arrays;
class Array2 {
public static void printArray(int[] iarray){
int length = iarray.length;
int i;
for (i = 0; i < length; i++){
System.out.print(iarray[i]);
System.out.print(" . ");
}
}

public static void main (String a[]){
int i;
int[] ia; 
ia = new int[21];
ia[0] = -2;
ia[1] = 0;
ia[2] = -1;
ia[3] = 1;
ia[4] = 0;
ia[5] = 1;
ia[6] = -1;
ia[7] = 1;
ia[8] = -1;
ia[9] = 0;

System.out.println("Array unsorted\n");
for (i = 0; i <= 11; i++){
System.out.print(ia[i]+" ");
}
System.out.println();
}
}
Jake • Now
Jake Ames (gotema55@gmail.com)

Send a message

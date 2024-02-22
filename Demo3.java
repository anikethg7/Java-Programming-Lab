import java.io.*;
class Demo3 {
	public static void main(String args [ ]) {

	int n = 4567, t, sum = 0;	
	
	while(n>0) {
	
	t = n%10;
	sum = sum + t;
	n = n/10;
	
}

	System.out.println("\nSum of the digits is " + sum);

}

}
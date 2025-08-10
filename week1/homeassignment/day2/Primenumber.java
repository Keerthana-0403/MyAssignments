package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=13;
int count=0;
for (int i=2;i<=a-1;i++) {
	if (a%i==0) {
		count++;
		break;
}
}
System.out.println(count);
if (count==0) {
	System.out.println("prime");
	
} else {
	System.out.println("not a prime");

}
	}
}

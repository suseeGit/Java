import java.util.*;
class java2{
	public static void main(String args[]){
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("	  	 Find the java2 Number         ");
		System.out.println("------------------------------------------");
		System.out.println("Enter First Value : ");
		a=input.nextInt();
		System.out.println("Enter Second Value : ");
		b=input.nextInt();
		System.out.println("Enter Third Value : ");
		c=input.nextInt();
		if(a>b && a>c){
			System.out.println(a+" is java2 value");	
		}else if(b>a && b>c){
			System.out.println(b+" is java2 Value");	
		}else if(c>a && c>b){
			System.out.println(c+" is java2 Value");	
		}
	}
}
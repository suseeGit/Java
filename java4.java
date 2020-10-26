import java.util.Scanner;
class java4{
int main(){
	int value;
	try{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number 1 to 7 :");
		value=input.nextInt();
	}catch(Exception e){
		System.out.println("Please Enter a Number 1 to 7");	
		return main();
	}
	if(value>=0 && value<=7){
		switch(value){
			case 1:System.out.println("Monday");break;
			case 2:System.out.println("Tuesday");break;
			case 3:System.out.println("Wednesday");break;
			case 4:System.out.println("Thursday");break;
			case 5:System.out.println("Friday");break;
			case 6:System.out.println("Saturday");break;
			case 7:System.out.println("Sunday");break;
		}
	}else{
		System.out.println("Please Enter a Number 1 to 7");	
		return main();
	}
	return main();
}
public static void main(String args[]){
	java4 obj=new java4();
	obj.main();
	}
}
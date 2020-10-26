import java.util.Scanner;
class java3
{
    int java3(int x)
    {
	    System.out.println("Expected Output : ");
        if(x>0){
            System.out.println("The value of m = "+x+".0");
            System.out.println("The value of n = 1");
        }else if(x<0){
            System.out.println("The value of m = "+x+".0");
            System.out.println("The value of n = -1");
        }else if(x==0)
            System.out.println(x+" is not a positive & Negative Number");
        else
            System.out.println(x+" is not a Number.Please Enter a Number");
        return 0;
    }
    public static void main(String args[])
    {
        int value;      
        Scanner input=new Scanner(System.in);
        System.out.println(" Input a number : ");
        value=input.nextInt();
        java3 obj=new java3();
        obj.java3(value);
    }
}
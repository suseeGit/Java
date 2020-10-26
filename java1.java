import java.util.Scanner;
class java1
{
    int java1(int x)
    {
	System.out.println(x);
        if(x>0)
            System.out.println(x+" is a Positive Number");
        else if(x<0)
            System.out.println(x+" is a Negative Number");
        else if(x==0)
            System.out.println(x+" is not a positive & Negative Number");
        else
        System.out.println(x+" is not a Number.Please Enter a Number");
        return 0;
    }
    public static void main(String args[])
    {
        int a;
        System.out.println("HELLO WORLD");
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter input :");
        a=input.nextInt();
        java1 obj=new java1();
        obj.java1(a);
    }
}

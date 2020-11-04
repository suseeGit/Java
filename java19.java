import java.util.Scanner;
class java19 {
        public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input first number : ");
        int num1=input.nextInt();
        System.out.println("Input Second number : ");
        int num2=input.nextInt();        
        System.out.println("Input Third number : ");
        int num3=input.nextInt();
        if(num1<num2 &&num1<num3)
            System.out.println(" Increasing order ");
        else if(num1>num2 && num2>num3)
            System.out.println(" Decreasing order ");
        else
        System.out.println(" Neither increasing or decreasing order ");            
    }
}

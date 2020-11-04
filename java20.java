import java.util.Scanner;
class java20 {
        public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input First floating point number : ");
        Float num1=input.nextFloat();
        System.out.println("Input Second floating point number : ");
        Float num2=input.nextFloat();        
        System.out.println(num1);
        System.out.println(num2);
        float compare=num1-num2;
        if (compare==0) {
            System.out.println("Two Floating numbers are same ");            
        }else{
            System.out.println("These numbers are different ");
        }
    }    
}

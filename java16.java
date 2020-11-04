import java.util.Scanner;
class java16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number : ");
        Float num=input.nextFloat();
        int zero=0;
        if(num==zero){
            System.out.println("Zero");
        }else if(num<0){
            System.out.println("Negative");
        }else if(num>0){
            System.out.println("Positive");
        }
    }
}
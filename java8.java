import java.util.Scanner;
class java8{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Input number of terms : ");
        int term=input.nextInt();
        for(int i=1;i<term+1;i++){
            int result=i*i*i;
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+result);
        }
    }
}
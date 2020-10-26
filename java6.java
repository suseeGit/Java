import java.util.Scanner;
class java6{
    int main(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("-------------------------------------------------");
            System.out.println("Input the number: ");
            int value=input.nextInt();
            System.out.println("-------------------------------------------------");
            System.out.println("Input number:");
            System.out.println(value);
            int sum=0;
            System.out.println("The first n natural numbers are : ");
            for(int i=value;i>0;i--){
                System.out.println(i);
                sum=sum+i;
            }
            System.out.println("The Sum of Natural Number upto n terms : ");            
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("-------------------------------------------------");
            System.out.println("Something Wrong! Please Enter Numbers Only !!!");
            System.out.println("-------------------------------------------------");
            return main();
        }
        System.out.println("-------------------------------------------------");
        return 0;
    }
    public static void main(String args[]) {
        java6 obj = new java6();
        obj.main();
    }
}
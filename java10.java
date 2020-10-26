import java.util.Scanner;
class java10{
    int main(){
        Scanner input=new Scanner(System.in);
        int term;
        try{
            System.out.println("----------------------------------------------------");
            System.out.println("Input number of terms is : ");
            term=input.nextInt();
        }catch(Exception e){
            System.out.println("Something Wrong ! Please Enter Numbers Only !");
            return main();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("The odd numbers are : ");
        int sum=0;
        for(int i=1;i<term+1;i++){
            int result=i;
            System.out.println(result);
            sum=sum+result;
            i=i+1;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("The Sum of odd Natural Number upto "+term+" terms is :"+sum);
        System.out.println("----------------------------------------------------");
        return 0;
    }
    public static void main(String[] args){
        java10 obj=new java10();
        obj.main();
    }
}
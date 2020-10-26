import java.util.Scanner;
class java9{
    int main(){
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("Input the number (Table to be calculated) : ");
            int value=input.nextInt();
            System.out.println("-------------------------------------------------");
            for(int i=1;i<value+1;i++){
                System.out.println(value+" X "+i+" = "+value*i);            
            }
            System.out.println("-------------------------------------------------");
        }catch(Exception e){
            System.out.println("-------------------------------------------------");
            System.out.println(" Please Enter Numbers Only !!!");
            System.out.println("-------------------------------------------------");
            return main();
        }
    return main();
    }
    public static void main(String args[]){
        java9 obj=new java9();
        obj.main();
    }
}
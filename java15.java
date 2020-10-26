import java.util.Scanner;
class java15{
    int main(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("-------------------------------------------------");
            System.out.println("Input number of rows : ");
            int value=input.nextInt();
            for(int i=0;i<value;i++){
                
            }            
            System.out.println("-------------------------------------------------");
        }catch(Exception e){
            System.out.println("-------------------------------------------------");
            System.out.println("Something Wrong! Please Enter Numbers Only !!!");
            System.out.println("-------------------------------------------------");
            return main();
        }
        System.out.println("-------------------------------------------------");
        return 0;
    }
    public static void main(String args[]) {
        java15 obj = new java15();
        obj.main();
    }
} 
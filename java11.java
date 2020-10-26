import java.util.Scanner;
class java11{
    int main(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("-------------------------------------------------");
            System.out.println("Input number of rows : ");
            int value=input.nextInt();
            int[] array=new int[value];
            for(int i=0;i<array.length;i++){
                int increment=i+1;
                array[i]=increment;
            }
            System.out.println("-------------------------------------------------");
            for(int i=0;i<array.length;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print(array[j]+" ");
                }
                System.out.println("");
            }
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
        java11 obj = new java11();
        obj.main();
    }
}
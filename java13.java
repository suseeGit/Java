import java.util.Scanner;
class java13{
    int main(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("-------------------------------------------------");
            System.out.print("Input number of rows : ");
            int value=input.nextInt();
            int[] array=new int[value];
            for(int i=0;i<array.length;i++){
                int increment=i+1;
                array[i]=increment;
            }
            System.out.println("-------------------------------------------------");
            int k=0;
            for(int i=0;i<array.length;i++){
                if(k<array.length){
                    int tri=array[i];
                    try{
                        for(int j=0;j<tri;j++){
                            System.out.print(" "+array[k]+" ");                    
                            k=k+1;
                        }
                    }catch(Exception e){
                        System.out.println(" Complete !!! ");
                        return 0;
                    }
                    System.out.println(" ");
                }
            }
            return 0;
        }catch (Exception e){
            System.out.println(" ");
            System.out.println("-------------------------------------------------");
            System.out.println("Something Wrong! Please Enter Numbers Only !!!");
            return main();
        }
    }
    public static void main(String args[]) {
        java13 obj = new java13();
        obj.main();
    }
}
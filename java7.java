import java.util.Scanner;
class java7{
    int main(){
        Scanner input=new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.print("Enter how many number of sum and avg : ");
        int numbers=input.nextInt();
        System.out.println("------------------------------------------");
        int[] array=new int[numbers];
        for(int i=0;i<array.length;i++){
            int j=i+1;
            System.out.println("Enter "+j+" Value : ");
            array[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("------------------------------------------");
        System.out.println("Sum of the "+array.length+" Numbers is : "+sum);
        int avg=sum/array.length;
        System.out.println("Avg of the "+array.length+" Numbers is : "+avg);
        System.out.println("------------------------------------------");
        return 0;
    }
    public static void main(String args[]){
    java7 obj=new java7();
    obj.main();
    }
}
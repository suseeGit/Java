import java.util.Scanner;
class DuplicateValueinArray{
    public static void main(String args[]){
        char[] array={'a','b','c','d','a','b'};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                System.out.println(array[i]);
                }else{
                }
            }
        }
    }
}
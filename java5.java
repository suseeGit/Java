import java.io.*;
import java.util.Scanner;
class java5{
    int main(){
        Scanner input = new Scanner(System.in);
        String value;
        String[] array={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","s","t","u","v","w","x","y","z"};
        String[] vowel={"a","e","i","o","u"};
        System.out.println("Input an alphabet: ");
        value=input.next();
        if(value.length()>0 && value.length()<2){ //find the input two are more

            for(int i=0;i<array.length;i++){   

                String small=array[i];//a

                String caps=small.toUpperCase();

                System.out.println(small);

                System.out.println(caps);

                if(value.equals(small) || value.equals(caps)){

                    System.out.println("its String value!!!");

                    for(int j=0;j<vowel.length;j++){

                        String vowelsmall=array[j];

                        String vowelcaps=small.toUpperCase();

                        if(value.equals(vowelsmall) || value.equals(vowelcaps)){
                            System.out.println("Input letter is Vowel");
                            return 0;
                        }else{
                            System.out.println("Input letter is Consonant");
                            return 0;                 
                        }
                    }
                }else{
                    System.out.println("Input is Not a alphabet !!!");
                    return main(); 
                }
            }
        }else{
            System.out.println("More then Two Values!!! ");
            return main();
        }
        return 0;
    }
    public static void main(String args[]) {
        java5 obj = new java5();
        obj.main();
    }
}
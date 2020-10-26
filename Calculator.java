import java.util.Scanner;
class Calculator{
    int main(){
        int choice;
        int x = 0;
        int y = 0;
        int answer =0 ;
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("1.Addition\n2.Subtration\n3.Multuplication\n4.Division\n5.Maximum"
                    + "\n6.Minimum\n7.Squre\n8.Squre Qube\n9.Squre Power Four\n10.Exit");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter Your Choice : ");
        choice=input.nextInt();
        if(choice>0&&choice<10)
        {
            if(choice<7){
                System.out.println("Enter First Number");
                x=input.nextInt();
                System.out.println("Enter Second Number");
                y=input.nextInt();
            }else if(choice<10){
                System.out.println("Enter Number");
                x=input.nextInt();
            }
        }else if(choice==10){
                System.out.println("Exit the Program...");
                return 0;
        }else{
            System.out.println("Please Enter Correct Option");
            return main();
        }
        switch(choice){
            case 1:addition(x,y);break;
            case 2:subtraction(x,y);break;
            case 3:multiplication(x,y);break;
            case 4:division(x,y);break;
            case 5:maximum(x,y);
            case 6:minimum(x,y);break;
            case 7:
                answer=x*x;
                System.out.println(answer);
                break;
            case 8:
                answer=x*x*x;
                System.out.println(answer);
                break;
            case 9:
                answer=x*x*x*x;
                System.out.println(answer);
                break;
        }
        System.out.println("----------------------------------------------------");
        return main();
    }
    static int addition(int x,int y){
        int answer=x+y;
        System.out.println(x+"+"+y+"="+answer);
        return answer;
    }
    static int subtraction(int x,int y){
        int answer=x-y;
        System.out.println(x+"-"+y+"="+answer);
        return answer;          
    }
    static int multiplication(int x,int y){
        int answer=x*y;
        System.out.println(x+"x"+y+"="+answer);
        return answer;      
    }
    static int division(int x,int y){
        int answer=0;
        try{
            answer=x/y;
            System.out.println(x+"/"+y+"="+answer);        
        }catch(Exception e){
            System.out.println("Unable to Divide By Zero");
        }
        return answer;
    }
    static int maximum(int x,int y){
        if(x>y){
            System.out.println(x+" is Maximum Value");
        }else if(x<y){
            System.out.println(y+" is Maximum Value");
        }else{
            System.out.println("Two Values are Same");
        }
        return 0;
    }
    static int minimum(int x,int y){
        if(x<y){
            System.out.println(x+" is Minimum Value");
        }else if(x>y){
            System.out.println(y+" is Minimum Value");
        }else{
            System.out.println("Two Values are Same");
        }
        return 0;
    }
    
    public static void main(String[] args)
    {   
        System.out.println("----------------------------------------------------");
        System.out.println("                    Calculator                      ");
       Calculator obj=new Calculator();
        obj.main();
    }
}
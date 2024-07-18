import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();
        
        if(inputYear % 4 == 0 && inputYear % 100 != 0){
            System.out.print("1");
        }else if(inputYear % 100 != 0 && inputYear % 400 == 0){
            System.out.print("1");
        }else if(inputYear % 400 == 0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        
        if(grade >= 90){
            System.out.print("A");
        }else if(grade >= 80){
            System.out.print("B");
        }else if(grade >= 70){
            System.out.print("C");
        }else if(grade >= 60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}
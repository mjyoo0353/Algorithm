import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(m >= 45){
            m -= 45;
            System.out.print(h + " " + m);
        }else{
            m = m - 45 + 60;
            if(h == 0){
                h = 23;
                System.out.print(h + " " + m);
            }else{
                h -= 1;
                System.out.print(h + " " + m);
            }
        }
    }
}
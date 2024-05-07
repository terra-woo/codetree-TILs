import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j=i;j<=100;j++){
            if(j>=90){
                System.out.print("A ");
            } else if(j>=80){
                System.out.print("B ");
            } else if(j>=70){
                System.out.print("C ");
            } else if(j>=60){
                System.out.print("D ");
            } else{
                System.out.print("F ");
            } 
        }
    }
}
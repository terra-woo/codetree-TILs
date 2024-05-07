import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for(int j=1;j<=i;j++){
            if(j%2==0 || j%3==0){
                System.out.print("1 ");
            } else{
                System.out.print("0 ");
            }
        }
        
    }
}
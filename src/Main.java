import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float a,i=1,b=0;
        System.out.print("Harmoniği alınacak sayıyı giriniz: ");
        a = sc.nextInt();
        while(i<=a){
            b =b+(1/i);
            i++;
        }
        System.out.print("Harmonik seri toplamlı sayı: ");
        System.out.printf("%.2f",b);
    }
}
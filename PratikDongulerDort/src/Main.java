import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0, r = 0 , f1 = 1 , f2 = 1 , f3 = 1 , fark = 0;
        System.out.print("N Değerini Giriniz : ");
        n = input.nextInt();

        System.out.print("R Değerini Giriniz : ");
        r = input.nextInt();

        while (n<r){
            if (n < r){
                System.out.print("N değeri R değerinden küçük olamaz. Lütfen Tekrar N Değerini Giriniz... : ");
                n = input.nextInt();
            }
        }

        for (int i = 1; i <= n; i++){
            f1 = f1 * i ;
        }
        fark = n - r;
        for (int i = 1; i <= fark; i++){
            f2 = f2 * i ;
        }
        for (int i = 1; i <= r; i++){
            f3 = f3 * i ;
        }

        System.out.println("N Sayısının Faktöriyel Hesabı : " + f1);
        System.out.println("R Sayısının Faktöriyel Hesabı : " + f3);
        System.out.print(n + " Sayısının " + r + " Kombinasyonu : " + (r * f2) / n);

    }
}

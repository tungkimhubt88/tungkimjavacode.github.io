import java.util.Scanner;

public class btvnb2 {
    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);
        System.out.println("Nhập vào số bất kì : ");
        int n = tk.nextInt();
        int giaiThua = 1;

            for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println(n + "! = " + giaiThua); 
        tk.close();
    }
}
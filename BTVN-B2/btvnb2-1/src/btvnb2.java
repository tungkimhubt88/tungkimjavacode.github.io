import java.util.Scanner;

public class btvnb2 {
    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);
        System.out.println("Nhập 3 số tự nhiên bất kì : ");
        double a = tk.nextDouble();
        double b = tk.nextDouble();
        double c = tk.nextDouble();
             if ((a + b > c) || (a + c > b) || (c + b > a)) {
            System.out.println("Đây là 3 cạnh của tam giácc");
        } 
             else {
            System.out.println("Đây không phải 3 cạnh của một tam giác");
        }
        tk.close();
    }
}

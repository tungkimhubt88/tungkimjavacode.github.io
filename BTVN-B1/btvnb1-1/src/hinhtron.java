import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);

        double r, p, s;

        System.out.println("Nhập bán kính của hình tròn : ");
        r = tk.nextDouble();

        p = r * 2 * 3.14;
        s = r * r * 3.14;

        System.out.println("Chu vi của hình tròn là : " + p + "\nDiện tích của hình tròn là : " + s);
        tk.close();

    }
}

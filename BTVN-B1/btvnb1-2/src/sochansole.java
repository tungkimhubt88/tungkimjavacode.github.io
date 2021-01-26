import java.util.Scanner;

public class sochansole {

    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);
        System.out.println("Nhập số a : ");
        int a = tk.nextInt();
        String cl = (a % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("Số " + a + " là số " + cl);
        tk.close();

    }

}

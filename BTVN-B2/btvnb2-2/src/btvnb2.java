import java.util.Scanner;
public class btvnb2 {
    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);
        int x, num1 = 0, num2 = 1;

        System.out.println("Nhập vào số lượng các số mà bạn muốn hiển thị: ");
        x = tk.nextInt();
        System.out.println(); 
        
        System.out.print("Chuỗi Fibonacci với "+x+" số là: ");
        int i=0;
        while(i <= x)
        {
            System.out.print(num1+" ");
             int sumOfPrevTwo = num1 + num2;
             num1 = num2;
             num2 = sumOfPrevTwo;
                i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Tùng Kim");
        tk.close();
    }
    
}
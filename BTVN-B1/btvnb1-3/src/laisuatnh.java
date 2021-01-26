import java.text.DecimalFormat;
import java.util.Scanner;

public class laisuatnh {
    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);

        long soNo = 100_000_000L;
        System.out.println("Số tiền đang nợ ngân hàng là : " + soNo);

        double lsThang, tlThang, ttThang;
        lsThang = (12 / 100) / 12;
        tlThang = soNo * lsThang;
        ttThang = (soNo / 12) + tlThang;

        System.out.println("Tiền lãi phải trả hàng tháng là : " + ttThang);
        
        tk.close();

    }
}

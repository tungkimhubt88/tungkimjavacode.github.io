import java.text.DecimalFormat;
import java.util.Scanner;

public class laisuatnh {
    public static void main(String[] args) throws Exception {
        double loan = 100_000_000d;
        double yearRate = 12d;

        double monthRate = ( yearRate /100 ) / 12;
        double earnings = loan * monthRate ;
        double totalEarnings = loan / 12 + earnings ;

        System.out.format("Số nợ của bạn là : %1.0f \n" , loan);
        System.out.format("Tiền lãi phải trả hàng tháng là : %1.0f \n" , earnings);
        System.out.format("Tổng số tiền phải trả hàng tháng là : %1.0f \n" , totalEarnings);
        
        tk.close();

    }
}

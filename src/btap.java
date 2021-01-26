import java.util.Scanner;

public class btap {
    public static void main(String[] args) throws Exception {
        Scanner tk = new Scanner(System.in);
        String name, add;
        int age;
        float weight, height, BMI;
        System.out.println("Enter your name : ");
        name = tk.nextLine();

        System.out.println("Enter your age : ");
        age  = Integer.parseInt(tk.nextLine());

        System.out.println("Enter your Address : ");
        add = tk.nextLine();
        System.out.println("Enter your height : ");
        height = tk.nextFloat();
        System.out.println("Enter your weight : ");
        weight = tk.nextFloat();
        BMI = weight / ( height * height);

        System.out.println("Hello my name is "+name+" , I am "+age+" year old this year , I from "+add);
        System.out.println("My BMI is " +BMI);
        tk.close();


    }
}

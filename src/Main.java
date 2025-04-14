import java.util.Date;

public class Main {
    public static void main(String[] args) {
        char c = 'A';
        String fullName = "Natnael Tessema";
        String[] fruit = {"Apple", "Banana", "Cherry"};
        Date d = new Date(0);
        System.out.println(c);
        System.out.println(fullName);
       // System.out.println(fruit[0] + fruit[1] + fruit[2]);
        System.out.println(d);

        for (int i = 0; i < fruit.length; i++){
            System.out.println(i + " " + fruit[i]);
        }
        System.out.println("ALL DONE!");
    }
}
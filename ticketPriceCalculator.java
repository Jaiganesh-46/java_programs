import java.util.*;
public class ticketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();
        int price = sc.nextInt();
        double totalPrice = 0.0 ;

        if(ticket < 50){
            totalPrice = ticket * price;
        } else if(ticket >= 50 && ticket <=100) {
            totalPrice = ticket * price;
            totalPrice = totalPrice - (totalPrice * 0.1);
        } else if(ticket > 100 && ticket <= 200) {
            totalPrice = ticket * price;
            totalPrice -= totalPrice * 0.2;
        } else if(ticket > 200 && ticket <= 400) {
            totalPrice = ticket * price;
            totalPrice -= totalPrice * 0.3;
        } else if(ticket > 400 && ticket <= 500) {
            totalPrice = ticket * price;
            totalPrice -= totalPrice * 0.4;
        } else if (ticket > 500) {
            totalPrice = ticket * price;
            totalPrice -= totalPrice * 0.5;
        }
        System.out.printf("%.2f",totalPrice);
    }
}

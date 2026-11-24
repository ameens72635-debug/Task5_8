class Payment{
    void pay(double amount){
        System.out.println("Processing generic payment of ₹" + amount);
    }
}
class CreditCard extends Payment{
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}
class UPI extends Payment{
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
public class Task8 {
    public static void main(String[] args) {
     Payment p=new Payment();
     CreditCard c =new CreditCard();
     UPI u=new UPI();
     p.pay(200);
     c.pay(300);
     u.pay(700);
    }
}

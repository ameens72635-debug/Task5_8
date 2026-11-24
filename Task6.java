class Book{
    String title;
    double price;
    Book(){
      this.title = "Unknown";
      this.price = 0.0;
    }
    Book(String title){
        this.title=title;
        this.price = 0.0;
    }
    Book(String title, double price){
        this.title=title;
        this.price = price;
    }
    void display(){
        System.out.println("Title:"+title);
        System.out.println("Price:"+price);
    }
}
public class Task6 {
    public static void main(String[] args) {
        Book b=new Book();
        b.display();
        Book bb=new Book("Apple");
        bb.display();
        Book bbb=new Book("Mango",29.009);
        bbb.display();
    }
}

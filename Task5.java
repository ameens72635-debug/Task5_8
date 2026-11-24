class UserRegistration{
    void register(String name, int userId){
        System.out.println("Registered user: " + name + " with ID: " + userId);
    }
    void register(int userId, String name){
       System.out.println("Registered ID: " + userId + " for user: " + name); 
    }
}
public class Task5 {
    public static void main(String[] args) {
        UserRegistration u=new UserRegistration();
        u.register("Ameen", 254);
        u.register(254, "Ameen");
    }
}

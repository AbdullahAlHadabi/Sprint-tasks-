public class Encapsulation {
    public static void main (String [] agrs) {

        Customer info = new Customer();

        info.setName("ABDULLAH");
        info.setEmail("A@gmail.com");
        info.setPhone(9090);


        System.out.println(info.getEmail());
        System.out.println(info.getPhone());
        System.out.println(info.getName());

    }

}

class Customer{
    private String name;
    private String email;
    private int phone;

    public void setName(String n){
        name = n;
    }

    public void setEmail(String e) {
        email = e;
    }

    public void setPhone(int p) {
        phone = p;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;

    }
}

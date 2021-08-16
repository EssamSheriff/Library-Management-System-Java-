package library.management.system;

enum Gender { male,female };

abstract public class Person {

    final private String First_name;
    final private String Last_name;
    private int Id;
    private String Password;
    private Gender Type;
    private String Address;
    private String E_mail;
    private String Call_phone;

    public Person(String First_name, String Last_name, int Id, String Password, Gender Type, String Address, String E_mail, String Call_phone) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Id = Id;
        this.Password = Password;
        this.Type = Type;
        this.Address = Address;
        this.E_mail = E_mail;
        this.Call_phone = Call_phone;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setType(Gender Type) {
        this.Type = Type;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setCall_phone(String Call_phone) {
        this.Call_phone = Call_phone;
    }
  
    public String getFirst_name() {
        return First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public int getId() {
        return Id;
    }

    public String getPassword() {
        return Password;
    }

    public Gender getType() {
        return Type;
    }

    public String getAddress() {
        return Address;
    }

    public String getE_mail() {
        return E_mail;
    }

    public String getCall_phone() {
        return Call_phone;
    }
    
    public void Get_details()
    {
        System.out.println("Name : "+ First_name+" "+Last_name);
        System.out.println("The ID is "+ Id); 
        System.out.println("Password is "+ Password);
        System.out.println("The Email : "+ E_mail);
        System.out.println("Gender : "+ Type);
        System.out.println("The Address is "+Address);
        System.out.println("His Phone is "+Call_phone);  
    }
    
abstract public void Get_all_details();   

}
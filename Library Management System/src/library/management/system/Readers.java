package library.management.system;

enum Payment{
cash,visa
}
public class Readers extends Person { 
    private int Age;
    private String Join_date;
    private boolean Is_blocked;
    private String Favorite_section;
    private Payment payment;
    static protected int num_of_readers=0;

    public Readers(int Age, String Join_date, boolean Is_blocked, String Favorite_section,
            String First_name, String Last_name, int Id, String Password, Gender Type,
            String Address, String E_mail, String Call_phone,Payment payment) {
        super(First_name, Last_name, Id, Password, Type, Address, E_mail, Call_phone);
        this.Age = Age;
        this.Join_date = Join_date;
        this.Is_blocked = Is_blocked;
        this.Favorite_section = Favorite_section;
      this.payment=payment;
        num_of_readers++;
        
    }

    public String getPayment() {
        return payment.toString();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

   
    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setJoin_date(String Join_date) {
        this.Join_date = Join_date;
    }

    public void setIs_blocked(boolean Is_blocked) {
        this.Is_blocked = Is_blocked;
    }

    public void setFavorite_section(String Favorite_section) {
        this.Favorite_section = Favorite_section;
    }

    public int getAge() {
        return Age;
    }

    public String getJoin_date() {
        return Join_date;
    }

    public boolean isIs_blocked() {
        return Is_blocked;
    }

    public String getFavorite_section() {
        return Favorite_section;
    }

    public static int getNum_of_readers() {
        return num_of_readers;
    }
    
    @Override
      public void Get_all_details(){
      super.Get_details();
      System.out.println("His Age is =  "+ Age + " years " );
      System.out.println("The join Date is "+ Join_date  );
      System.out.println("His Favoyrite section is = "+ Favorite_section );
      if(Is_blocked==false)
          System.out.println("This Reader isnot blocked");
      else
          System.out.println("This Reader is blocked ");
          
     }
    
}
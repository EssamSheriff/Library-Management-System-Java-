package library.management.system;

public class Librarians extends Person {
   private double Salary;
   private String Hire_date;
   private String Rank;
   static protected int num_of_librarians=0;

    public Librarians(double Salary, String Hire_date, String Rank, String First_name, String Last_name, int Id, String Password, Gender Type, String Address, String E_mail, String Call_phone) {
        super(First_name, Last_name, Id, Password, Type, Address, E_mail, Call_phone);
        this.Salary = Salary;
        this.Hire_date = Hire_date;
        this.Rank = Rank;
         num_of_librarians++;
    }
   
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setHire_date(String Hire_date) {
        this.Hire_date = Hire_date;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public double getSalary() {
        return Salary;
    }

    public String getHire_date() {
        return Hire_date;
    }

    public String getRank() {
        return Rank;
    }

    public static int getNum_of_librarians() {
        return num_of_librarians;
    }
    
    @Override
     public void Get_all_details(){
      super.Get_details();
      System.out.println("His Sallary is =  "+ Salary + " Doller" );
      System.out.println("His Hire Date is "+ Hire_date  );
      System.out.println("His Rank is = "+ Rank );
     }
}
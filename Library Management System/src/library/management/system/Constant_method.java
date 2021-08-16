package library.management.system;

import java.util.Scanner;

public class Constant_method {

    Scanner input = new Scanner(System.in);

    public int search_book(String name) {
        for (int i = 0; i < Constant.books.size(); i++) {
            if (Constant.books.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;

    }

    public int search_reader(int id) {

        for (int i = 0; i < Constant.readers.size(); i++) {
            if (id == Constant.readers.get(i).getId()) {
                return i;
            }
        }
        return -1;

    }

    public int search_empl(int id) {

        for (int i = 0; i < Constant.employees.size(); i++) {
            if (id == Constant.employees.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public int check(int SelectUser) {
        int num = -1;
       
        while (true) {
            System.out.println("Enter Your E-mail");
            String Email = input.next();
            System.out.println("Enter Your Password ");
            String Password = input.next();
            if (SelectUser == 1) {
                num = Librarian_Actions.log_in_Admin(Email, Password);
            } else if (SelectUser == 0) {
                num = Librarian_Actions.log_in_Reader(Email, Password);
            }

            if (num >= 0) {
                return num;
            } else {
                System.out.println("enter Again");
            }
        }

    }

    public String Enter_to_enum(Enum e1, Enum e2, String name) {

        while (true) {
            System.out.println("Enter the " + name + " of the new person");
            String gender = input.next();
            try {
                if (gender.toLowerCase().equals(e1.toString()) || gender.toLowerCase().equals(e2.toString())) {
                    return gender;
                }
            } catch (Exception e) {
                System.out.println("Your choise is wrong");
                System.out.println("Enter again");
            }

        }
    }
    
    
    
}
    
    
    
    
    
       
  /*  public int Enter_Integer(){
    
        int integer;
        try {
            integer=input.nextInt();
            return integer;
        } catch (Exception e) {
            System.out.println("Please Enter Integer Number !!");
            Enter_Integer();
        }
     
    return -1;
       
    }
   */


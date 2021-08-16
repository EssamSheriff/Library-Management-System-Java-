package library.management.system;

import java.util.Scanner;
import library.management.system.Constant;

public class Librarian_Actions implements Actions {

    Scanner input = new Scanner(System.in);
    Constant constant = new Constant();
    Constant_method constant_method = new Constant_method();

    public Librarian_Actions() {

    }

    //1-ADD NEW READER************************************************************
    public void add_reader() {

        System.out.println("Enter The New Reader Data, Please : ");
        System.out.println("Enter the first name of the new reader");
        String First_name = input.next();
        System.out.println("Enter the last name of the new reader");
        String Last_name = input.next();
        System.out.println("Enter the ID of the new reader");
        int Id = input.nextInt();
        System.out.println("Enter the Age of the new reader");
        int Age = input.nextInt();
        System.out.println("Enter the join date of the new reader");
        String Join_date = input.next();
        boolean Is_blocked = false;
        System.out.println("Enter the Favourite section of the new reader");
        String Favorite_section = input.next();
        System.out.println("Enter the Email of the new reader");
        String E_mail = input.next();
        System.out.println("Enter the password of the new reader");
        String Password = input.next();
        String gender = constant_method.Enter_to_enum(Gender.male, Gender.female, "Gender");
        System.out.println("Enter the Adress of the new reader");
        String Address = input.next();
        System.out.println("Enter the phone of the new reader");
        String Call_phone = input.next();
        String pay = constant_method.Enter_to_enum(Payment.cash, Payment.visa, "Payment Method");

        Readers r = new Readers(Age, Join_date, Is_blocked, Favorite_section, First_name, Last_name, Id, Password, Gender.valueOf(gender), Address, E_mail, Call_phone, Payment.valueOf(pay));
        constant.readers.add(r);
        System.out.println("The New Reader Is Added Successfully. ");
    }

    //2-REMOVE READER************************************************************
    public void remove_reader(int id) {
        boolean found = false;
        for (int i = 0; i < constant.readers.size(); i++) {
            if (id == constant.readers.get(i).getId()) {
                found = true;
                constant.readers.remove(i);
                Readers.num_of_readers--;
                System.out.println("The Reader Is Removed Successfully. ");
            }
        }

        if (found == false) {
            System.out.println("This Reader isnot found in the list, It isnot recorded");
        }
    }

    //3-ADD NEW EMPLOYEE************************************************************
    public void add_employee() {
        System.out.println("Enter The New Librarian Data, Please : ");
        System.out.println("Enter the first name of the new Employee");
        String First_name = input.next();
        System.out.println("Enter the last name of the new Employee");
        String Last_name = input.next();
        System.out.println("Enter the ID of the new Employee");
        int Id = input.nextInt();
        System.out.println("Enter the Salary of the new Employee");
        double Salary = input.nextDouble();
        System.out.println("Enter the Hire Date of the new Employee");
        String Hire_date = input.next();
        System.out.println("Enter the Rank of the new Employee");
        String Rank = input.next();
        System.out.println("Enter the Email of the new Employee");
        String E_mail = input.next();
        System.out.println("Enter the password of the new Employee");
        String Password = input.next();
        String gender = constant_method.Enter_to_enum(Gender.male, Gender.female, "Gender");
        System.out.println("Enter the Adress of the new Employee");
        String Address = input.next();
        System.out.println("Enter the phone of the new Employee");
        String Call_phone = input.next();
        Librarians l = new Librarians(Salary, Hire_date, Rank, First_name, Last_name, Id, Password, Gender.valueOf(gender), Address, E_mail, Call_phone);
        constant.employees.add(l);
        System.out.println("The New Employee Is Added Successfully. ");
    }

    //4-REMOVE EMPLOYEE************************************************************
    public void remove_employee(int id) {
        boolean found = false;
        for (int i = 0; i < constant.employees.size(); i++) {
            if (id == constant.employees.get(i).getId()) {
                found = true;
                constant.employees.remove(i);
                Librarians.num_of_librarians--;
                System.out.println("The Employee Is Removed Successfully. ");
            }
        }
        if (found == false) {
            System.out.println("This Employee isnot found in the list, It isnot recorded");
        }
    }

    //5-ADD NEW BOOK************************************************************
    public void add_book() {
        System.out.println("Enter The New Book Data, Please: ");
        System.out.println("Enter the Book Name : ");
        String Name = input.next();
        System.out.println("Enter the Author Name of the book : ");
        String Author = input.next();
        System.out.println("Enter the Book published date : ");
        String Published_date = input.next();
        System.out.println("Enter the Book language : ");
        String Language = input.next();
        System.out.println("Enter the Book Section : ");
        String Section = input.next();
        System.out.println("Enter the Book ID: ");
        int Id = input.nextInt();
        System.out.println("Enter the Book Price : ");
        int Price = input.nextInt();
        System.out.println("Enter the Book Quantity : ");
        int Quantity = input.nextInt();
        System.out.println("Enter the Book Edition : ");
        int Edition = input.nextInt();
        System.out.println("Enter the Num of the papers of the Book  : ");
        int Num_of_paper = input.nextInt();
        Book b = new Book(Name, Author, Published_date, Language, Section, Id, Price, Quantity, Edition, Num_of_paper);
        constant.books.add(b);
        System.out.println("The New Book Is Added Successfully. ");
    }

    //6-REMOVE BOOK************************************************************
    public void remove_book() {
        System.out.println("Enter The Name of the Book you want to remove ");
        String name = input.nextLine();
        boolean found = false;
        for (int i = 0; i < constant.books.size(); i++) {
            if (name.equals(constant.books.get(i).getName())) {
                found = true;
                constant.books.remove(i);
                Book.num_of_books--;
                System.out.println("The New Book Is Removed Successfully. ");
            }
        }
        if (found == false) {
            System.out.println("This book isnot found in the list, It isnot recorded");
        }
    }

    //7-SEARCH FOR READER********************************************************
    @Override
    public void search_of_reader(int id) {

        int num = constant_method.search_reader(id);

        if (num >= 0) {
            constant.readers.get(num).Get_all_details();
        } else {
            System.out.println("This Reader isnot found in the list, It isnot recorded");

        }

    }

    //8-SEARCH FOR EMPLOYEE********************************************************
    public void search_of_employee(int id) {

        int num = constant_method.search_empl(id);
        if (num >= 0) {
            constant.employees.get(num).Get_all_details();
        } else {
            System.out.println("This employees isnot found in the list, It isnot recorded");

        }

    }

    //9-SEARCH FOR A BOOK*******************************************************
    @Override
    public void search_of_books() {
        System.out.println("Enter The Name of the Book you want to search for :");
        String name = input.nextLine();
        int num = constant_method.search_book(name);
        if (num >= 0) {
            System.out.println(constant.books.get(num).toString());
        } else {
            System.out.println("This Book isnot found in the list, It isnot recorded");

        }

    }

    //10-Edit_salary********************
    public void Edit_salary(int id) {
        int num = constant_method.search_empl(id);
        if (num >= 0) {
            System.out.println("The old Salary is " + constant.employees.get(num).
                    getSalary());
            System.out.println("Enter the new Salary ");
            double salary = input.nextDouble();
            Constant.employees.get(num).setSalary(salary);

            System.out.println("Salary is updeted");

        } else {
            System.out.println("The employee is not found ");
        }

    }
    ///11-change_Rank***************

    public void Edit_rank(int id) {
        int num = constant_method.search_empl(id);
        if (num >= 0) {
            System.out.println("The old rank is " + constant.employees.get(num).
                    getRank());
            System.out.println("Enter the new Rank ");
            String rank = input.next();
            Constant.employees.get(num).setRank(rank);
            System.out.println("Rank is updated");

        } else {
            System.out.println("The employee is not found ");
        }

    }

//12-section 
    public void Edit_section(int id) {

        int num = constant_method.search_reader(id);
        if (num >= 0) {
            System.out.println("The old section is " + constant.readers.get(num).getFavorite_section());
            System.out.println("Enter the new section ");
            String section = input.next();
            Constant.readers.get(num).setFavorite_section(section);
            System.out.println("section is updated");
        } else {
            System.out.println("The reader is not found ");
        }

    }

    ///  5-payment Method/*******************
    public void Edit_Payment_method(int id) {
        int num = constant_method.search_reader(id);
        if (num >= 0) {
            System.out.println("The old Payment Method is " + constant.readers.get(num).getPayment());
            System.out.println("Do you Want To Change it ??");
            System.out.println("Please, Enter 'Y' for Accept");
            char Select = input.next().charAt(0);
            if (Select == 'Y' || Select == 'y') {
                if (constant.readers.get(num).getPayment().equals("cash")) {
                    Constant.readers.get(num).setPayment(Payment.visa);
                } else {
                    Constant.readers.get(num).setPayment(Payment.cash);
                }
                System.out.println("Payment Method is updated");
                System.out.println("The new Payment Method is " + constant.readers.get(num).getPayment());
            }
        } else {
            System.out.println("The reader is not found ");
        }

    }

    /// 14- Log_in for Admin
    static public int log_in_Admin(String Email, String Password) {
        boolean Check = false;
        for (int i = 0; i < Constant.employees.size(); i++) {
            if (Email.equals(Constant.employees.get(i).getE_mail())) {
                if (Password.equals(Constant.employees.get(i).getPassword())) {
                    System.out.println("Welcome " + Constant.employees.get(i).getFirst_name() + "  " + Constant.employees.get(i).getLast_name());
                    return i;
                }
            }
        }
        if (Check == false) {
            System.out.println("Your data is wrong");
            return -1;
        }
        return -1;
    }

    //// 15- Log in for Reader
    static public int log_in_Reader(String Email, String Password) {
        boolean Check = false;
        for (int i = 0; i < Constant.readers.size(); i++) {
            if (Email.equals(Constant.readers.get(i).getE_mail())) {
                if (Password.equals(Constant.readers.get(i).getPassword())) {
                    System.out.println("Welcome " + Constant.readers.get(i).getFirst_name() + " " + Constant.readers.get(i).getLast_name());
                    return i;
                }
            }
        }
        if (Check == false) {
            System.out.println("Your data is wrong");
            return -1;
        }
        return -1;
    }

    ///// 16- adding to order list
    @Override
    public void Add_to_order_list(int id) {
        String bookname;
        int id_book;
        int reader_id;

        while (true) {
            System.out.println("Enter the book name");
            bookname = input.nextLine();
            System.out.println(bookname);
            id_book = constant_method.search_book(bookname);
            if (id_book >= 0) {
                System.out.println("the book is found");
                break;
            } else {
                System.out.println("the book not found");
            }
            
            
                            System.out.println("Do you want to Exit ??     'y' to exit and 'n' to complete ");
                char Select = input.next().charAt(0);

            if (Select == 'Y' || Select == 'y') {
                return;
            }
        }

        while (true) {

            System.out.println("Enter the Reader id");
            int id_reader = input.nextInt();
            reader_id = constant_method.search_reader(id_reader);
            if (reader_id >= 0) {
                System.out.println("the reader is found");
                break;
            } else {
                System.out.println("the reader not found");
            }

                                      System.out.println("Do you want to Exit ??     'y' to exit and 'n' to complete ");
                char Select = input.next().charAt(0);
  if (Select == 'Y' || Select == 'y') {
                return;
            }

        }
        System.out.println("Enter the start date");
        String startdate = input.next();
        System.out.println("Enter the end date");
        String enddate = input.next();
        Order_list order = new Order_list(Constant.books.get(id_book).getId(), startdate, enddate, Constant.readers.get(reader_id).getId());
        Constant.List.add(order);
        System.out.println("Done");
    }

    ///////// 17- remove from order list 
    public void Remove_from_order_list() {
        boolean F_found = false;

        System.out.println("Enter Order number ?? ");
        int order_id = input.nextInt();

        for (int i = 0; i < Constant.List.size(); i++) {
            if (order_id == Constant.List.get(i).getId_order()) {
                F_found = true;
                Constant.List.get(i).Get_order_detalies();
                System.out.println("Are you Sure to Remove this Order ??");
                System.out.println(" 'Y' for yes ,,,, 'N' for No");
                char ch = input.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    Constant.List.remove(i);
                    Order_list.setNum_of_orders();
                    System.out.println("The order is removed ");
                } else {
                    System.out.println("the order is still available ");
                }

            }
        }

        if (F_found) {
            return;
        } else {
            System.out.println("wrong number !!!");
        }

    }

    ////18- search for order
    public void Search_order() {
        boolean Flag = false;
        while (true) {
            System.out.println("Enter the id order");
            int id = input.nextInt();
            for (int i = 0; i < constant.List.size(); i++) {
                if (id == Constant.List.get(i).getId_order()) {
                    Constant.List.get(i).Get_order_detalies();
                    return;
                }

            }
            if (Flag == false) {
                System.out.println("Wrong Id");
                System.out.println("Do you want to Exit ??     'y' to exit and 'n' to complete ");
                char ch = input.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    break;
                }

            }

        }

    }

    /// 19- Rent Function
    @Override
    public void rent_book(int id) {

        System.out.println("Enter The Name of the Book you want to search for :");
        String name = input.next();
        
        System.out.println("Enter The ID of the reader you want to search for : ");

        int numreader = constant_method.search_reader(input.nextInt());
        int numbook = constant_method.search_book(name);
        
        if (numbook >= 0 && numreader >= 0) {
            System.out.println("The Price is:  " + constant.books.get(numbook).getPrice());
            int Quantity = constant.books.get(numbook).getQuantity();
            System.out.println("The Quantity is:  " + Quantity);
            System.out.println("**********************************");
            if (constant.readers.get(numreader).isIs_blocked() == false) {
                Quantity--;
                constant.books.get(numbook).setQuantity(Quantity);
                Order_list order = new Order_list(constant.books.get(numbook).getId(), null, null, constant.readers.get(numreader).getId());
                Constant.List.add(order);
                System.out.println("Done !!");

            } else {
                System.out.println("You can't Rent  now");
            }

        } else {
            System.out.println("This Book isnot found in the list, It isnot recorded");

        }

    }

    //// 20- Blocked 
    public void Edit_Block_user() {
        System.out.println("Enter The ID of the reader you want to search for : ");
        int numreader = constant_method.search_reader(input.nextInt());
        if (numreader >= 0) {
            boolean block = constant.readers.get(numreader).isIs_blocked();
            if (block) {
                System.out.println("The User  is :  Blocked");

            } else {
                System.out.println("The User  is :  NOTBlocked");
            }

            System.out.println("Do You want to Change it ??");
            System.out.println(" 'Y' for YES ");
            char check = input.next().charAt(0);
            if (check == 'Y' || check == 'y') {
                constant.readers.get(numreader).setIs_blocked(!block);
                System.out.println("The User now is: " + constant.readers.get(numreader).isIs_blocked());
            } else {
                return;
            }

        } else {
            System.out.println("The reader is not found ");
        }

    }

}

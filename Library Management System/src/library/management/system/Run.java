package library.management.system;

import java.util.Scanner;

public class Run {


    //////************ Variables *******
    Scanner input = new Scanner(System.in);
    Constant_method constant_method = new Constant_method();
    String bookname;
    Librarian_Actions act = new Librarian_Actions();
    Reader_Actions Reader_act = new Reader_Actions();
    static int choice =0 ;

    /////************ FuncTions ***********
    
    public int log_in() {

        System.out.println("******Welcome To Library System********");
        while (true) {
            System.out.println("1- Librarian Functions ");
            System.out.println("2- Reader Functions");
            int F_choice = input.nextInt();
            if (F_choice == 1) {
               int id_index= constant_method.check(1);
                 choice=1;
                 return id_index;
            } else if (F_choice == 2) {
                int id_index =constant_method.check(0);
                choice = 2;
                return id_index;
            } else {
                System.out.println("Invalid choise ,Enter again");
            }
        }
    }

    public void run_application() {

        int id_index = log_in();
        
        while (true) {
            
            if (choice == 1) {
                System.out.println("1- ADD NEW READER");
                System.out.println("2- REMOVE A READER");
                System.out.println("3- SEARCH FOR A READER");
                System.out.println("4- Edit Section For Reader ");
                System.out.println("5- Edit Payment method for Reader");
                System.out.println("6- ADD NEW EMPLOYEE");
                System.out.println("7- REMOVE EMPLOYEE ");
                System.out.println("8- SEARCH FOR AN EMPLOYEE ");
                System.out.println("9- Edit Salary for Employee");
                System.out.println("10- Edit Rank for Employee");
                System.out.println("11- ADD NEW BOOK");
                System.out.println("12- REMOVE A BOOK");
                System.out.println("13- SEARCH FOR A BOOK");
                System.out.println("14- Add to Order list ");
                System.out.println("15- Remove from order list");
                System.out.println("16- Search in Order List");
                System.out.println("17- Block User");
                System.out.println("18- Rent Book");
                int answer = input.nextInt();
                switch (answer) {
                    case 1:
                        act.add_reader();
                        break;
                    case 2:
                        System.out.println("Enter The ID of the reader you want to remove");
                        act.remove_reader(input.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter The ID of the reader you want to search for : ");
                        act.search_of_reader(input.nextInt());

                        break;
                    case 4:
                        System.out.println("Enter The ID of the reader you want to edit his section : ");
                        act.Edit_section(input.nextInt());
                        break;
                    case 5:
                        System.out.println("Enter The ID of the reader you want to edit his Payment Method : ");
                        act.Edit_Payment_method(input.nextInt());

                        break;
                    case 6:
                        act.add_employee();

                        break;

                    case 7:
                        System.out.println("Enter The ID of the Employee you want to remove");
                        act.remove_employee(input.nextInt());

                        break;
                    case 8:
                        System.out.println("Enter The ID of the Enployee you want to search for :");
                        act.search_of_employee(input.nextInt());
                        break;
                    case 9:
                        System.out.println("Enter The ID of the Enployee you want to edit his Salary :");
                        act.Edit_salary(input.nextInt());
                        break;
                    case 10:
                        System.out.println("Enter The ID of the Enployee you want to edit his Rank :");
                        act.Edit_rank(input.nextInt());
                        break;
                    case 11:
                        act.add_book();
                        break;
                    case 12:
                        act.remove_book();
                        break;
                    case 13:
                        act.search_of_books();
                        break;
                    case 14:
                        act.Add_to_order_list(0);
                        break;
                    case 15:
                        act.Remove_from_order_list();
                        break;
                    case 16:
                        act.Search_order();

                        break;
                    case 17:
                        act.Edit_Block_user();
                        break;
                    case 18:
                        act.rent_book(0);
                        break;
                }
            } else if (choice == 2) {
                System.out.println("1- Add to Your order list");
                System.out.println("2- Search for a book");
                System.out.println("3- SEARCH FOR A READER");
                System.out.println("4- For Rent");
                int answer = input.nextInt();
                switch (answer) {
                    case 1:
                        Reader_act.Add_to_order_list(Constant.readers.get(id_index).getId());
                        break;
                    case 2:
                        Reader_act.search_of_books();
                        break;
                    case 3:
                        System.out.println("Enter Reader ID");
                        int Id_r = input.nextInt();
                        Reader_act.search_of_reader(Id_r);
                        break;
                    case 4:
                        Reader_act.rent_book(id_index);
                        break;
                }
            } 
            
            System.out.println("*************************");
            System.out.println("Press E to Exit ");
            System.out.println("Press L to Log_out ");
            System.out.println("Press any key to Continue ");
            char ch = input.next().charAt(0);
            if (ch == 'e' || ch == 'E') {
                System.out.println("Thanks for using the system");
                break;
            }else if (ch == 'l' || ch == 'L') {
                System.out.println("Thanks for using the system");
                run_application();
            }
        }

    }

}

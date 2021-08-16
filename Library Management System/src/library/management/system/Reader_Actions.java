package library.management.system;

import java.util.Scanner;
import library.management.system.Constant;

public class Reader_Actions implements Actions {

    Constant_method constant_method = new Constant_method();
    Scanner input = new Scanner(System.in);

    @Override
    public void Add_to_order_list(int id) {
        int id_book;
        while (true) {
            System.out.println("Enter the book name");
            String bookname = input.next();
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
        System.out.println("Enter the start date");
        String startdate = input.next();
        System.out.println("Enter the end date");
        String enddate = input.next();

        Order_list order = new Order_list(Constant.books.get(id_book).getId(), startdate, enddate, id);
        Constant.List.add(order);
        System.out.println("Done");
    }

    @Override
    public void search_of_books() {
        System.out.println("Enter The Name of the Book you want to search for :");
        String name = input.next();
        int index = constant_method.search_book(name);
        if (index >= 0) {
            System.out.println(Constant.books.get(index).toString());
        } else {
            System.out.println("The Book not Found");
        }
    }

    @Override
    public void rent_book(int id) {
        if (Constant.readers.get(id).isIs_blocked() == false) {

            System.out.println("Enter The Name of the Book you want to search for :");
            String name = input.nextLine();
            int numbook = constant_method.search_book(name);
            if (numbook >= 0 && id >= 0) {
                System.out.println("The Price is:  " + Constant.books.get(numbook).getPrice());
                int Quantity = Constant.books.get(numbook).getQuantity();
                System.out.println("The Quantity is:  " + Quantity);
                System.out.println("************************************************");
                System.out.println("Do you want to Rent it??  'y' for YES and 'n' For NO ");
            char Select = input.next().charAt(0);
            if (Select == 'Y' || Select == 'y') {
                Quantity--;
                Constant.books.get(numbook).setQuantity(Quantity);

                Order_list order = new Order_list(Constant.books.get(numbook).getId(), null, null, id);
                Constant.List.add(order);

                System.out.println("Done !!");

            }else{
                System.out.println("ok");
            }
            
            } else {
                System.out.println("This Book isnot found in the list, It isnot recorded");

            }

        } else {
            System.out.println("You can't Rent  now");
            System.out.println("becase you are Blocked");
        }

    }

    @Override
    public void search_of_reader(int id) {
        int index = constant_method.search_reader(id);
        if (index >= 0) {
            Constant.readers.get(index).Get_all_details();
        } else {
            System.out.println("Not Found");
        }
    }

}

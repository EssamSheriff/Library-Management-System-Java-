package library.management.system;

public class Order_list {
     private static int Num_of_orders=0;
private static int Total_numberOf_Orderds=0;
     private String Start_date;
     private String End_date;
     private int id_reader;  
     private int id_book;
     private int id_order;


    public Order_list(int id_book,String Start_date, String End_date, int id_reader) {
        Num_of_orders++;
        
        this.id_order= Num_of_orders;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.id_book=id_book; 
        this.id_reader =id_reader;
    
        Total_numberOf_Orderds++;
    }

    public static void setNum_of_orders() {
                Total_numberOf_Orderds--;
    }

        public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }
     
    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public static int getNum_of_orders() {
        return Num_of_orders;
    }


    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public String getEnd_date() {
        return End_date;
    }

    public void setEnd_date(String End_date) {
        this.End_date = End_date;
    }

    public int getId_reader() {
        return id_reader;
    }

    public void setId_reader(int id_reader) {
        this.id_reader = id_reader;
    }
     
   public void Get_order_detalies()
    {
        
        System.out.println("Order Number:  "+ id_order);
        System.out.println("Reader ID:  "+ id_reader);
        System.out.println("Book Id:  "+id_book);
        System.out.println("Start date:  "+Start_date);
        System.out.println("End date:   "+End_date);
    }

}
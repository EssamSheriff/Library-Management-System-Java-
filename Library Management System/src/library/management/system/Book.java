package library.management.system;


public class Book {
    
    final private String Name;
    final private String Author;
    private String Published_date;
    private String Language;
    private String Section;
    private int Id;
    private int Price;
    private int Quantity;
    private int Edition;
    private int Num_of_paper;
    static protected int num_of_books=0;

    public Book(String Name, String Author, String Published_date, String Language, String Section, int Id, int Price, int Quantity, int Edition, int Num_of_paper) {
        this.Name = Name;
        this.Author = Author;
        this.Published_date = Published_date;
        this.Language = Language;
        this.Section = Section;
        this.Id = Id;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Edition = Edition;
        this.Num_of_paper = Num_of_paper;
        num_of_books++;
    }

    public void setPublished_date(String Published_date) {
        this.Published_date = Published_date;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setEdition(int Edition) {
        this.Edition = Edition;
    }

    public void setNum_of_paper(int Num_of_paper) {
        this.Num_of_paper = Num_of_paper;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublished_date() {
        return Published_date;
    }

    public String getLanguage() {
        return Language;
    }

    public String getSection() {
        return Section;
    }

    public int getId() {
        return Id;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getEdition() {
        return Edition;
    }

    public int getNum_of_paper() {
        return Num_of_paper;
    }

    public static int getNum_of_books() {
        return num_of_books;
    }
 
    @Override
    public String toString() {
        return "Book{" + "Name=" + Name + ", Author=" + Author + ", Published_date=" + Published_date + ", Language=" + Language + ", Section=" + Section + ", Id=" + Id + ", Price=" + Price + ", Quantity=" + Quantity + ", Edition=" + Edition + ", Num_of_paper=" + Num_of_paper + '}';
    } 
    
}
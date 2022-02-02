class Author
{
  String name;
  String email;
  char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }
}
class Book
{
  private String name;
  private Author author;
  private double price;
  private int qtyInStock;

  public Book(String name, Author author, double price, int qtyInStock) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qtyInStock = qtyInStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQtyInStock() {
    return qtyInStock;
  }

  public void setQtyInStock(int qtyInStock) {
    this.qtyInStock = qtyInStock;
  }
}

public class EncapAbstractAssign1 {
  public static void main(String[] args) {
    Book obj = new Book("Learn C# fundamentals ",new Author("neeraj","neeraj.khanna@gla.ac.in",'M'),1200,4);
    Author Aobj = obj.getAuthor();

    System.out.println("Author Details ");
    System.out.println(Aobj.name + "\n" + Aobj.email+ "\n"+ Aobj.gender);
    System.out.println(obj.getName());
    System.out.println(obj.getPrice());
    System.out.println(obj.getQtyInStock());

  }
}

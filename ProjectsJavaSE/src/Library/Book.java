
package Library;

public class Book {
    private En_Type type;
    private En_Sample sample;
    private int price;
    private String name;
    private int idBook;
    private static int idGenerator =101;
    
 public Book(String name,En_Type type,En_Sample sample,int price){
     
     this.name=name;
     this.type=type;
     this.sample=sample;
     this.price=price;
     this.idBook=idGenerator;
     idGenerator++;
 }   

    public int getIdBook() {
        return idBook;
    }

    public En_Type getType() {
        return type;
    }

    public En_Sample getSample() {
        return sample;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + name + "/" + type  + "/" + sample +"/" + price+"/" +idBook+ "}";
    }


}

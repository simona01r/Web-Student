package Library;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.function.Predicate;

public class Library {

    static Scanner sc = new Scanner(System.in);
    private ArrayList<Book> myBook = new ArrayList<>();

    static Book b1 = new Book("A", En_Type.POEMS, En_Sample.POWERPOINT, 15);
    static Book b2 = new Book("B", En_Type.THEATRE, En_Sample.PDF, 10);
    static Book b3 = new Book("C", En_Type.DRAMA, En_Sample.WORD, 10);
    static Book b4 = new Book("D", En_Type.ROMANS, En_Sample.PRINTABLE, 10);
    static Book b5 = new Book("E", En_Type.COMEDIA, En_Sample.POWERPOINT, 10);

    public void addToLibrary() {
//        ADAUGARE BOOK creata in MAIN:
        myBook.add(b1);
        myBook.add(b2);
        myBook.add(b3);
        myBook.add(b4);
        myBook.add(b5);

        showBooks();
    }

    public void addByKeyboard() {

//        ADAUGARE BOOK DE LA TASTATURA: 
        System.out.println("Insert a title!");
        String name = sc.nextLine();

        System.out.println("What type?");
        String type = sc.nextLine();

        System.out.println("Choose a sample!");
        String sample = sc.nextLine();

        System.out.println("Price?");
        int price = sc.nextInt();
        sc.nextLine();

        myBook.add(new Book(name, En_Type.valueOf(type.toUpperCase()), En_Sample.valueOf(sample.toUpperCase()), price));

    }

    public void showBooks() {
        System.out.println(myBook);
//                   OR (not desired)->    When I call the function I need to specify what element(...si mai bine nu!!!)
//            for(Book b:myBook)
//            System.out.println(b);
    }

    public void deleteById() {
        Book temp = null;
        while (true) {
            System.out.println("Input id:");
            int n = sc.nextInt();
            sc.nextLine();

            for (Book b : myBook) {
                if (b.getIdBook() == n) {
                    temp = b;
                }
            }
            myBook.remove(temp);
            showBooks();

            System.out.println("Delete by ANOTHER id? Y/N");
            String answ = sc.nextLine();

            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Thank you!");
                break;
            }
        }
    }

//    LIST--> cand vreau sa sterg m.m. elem din ArrList!!!
//      public void deleteByPrice() {
//        List<Book> temp = null;
//        while (true) {
//
//            System.out.println("Insert price:");
//            int pr = sc.nextInt();
//            sc.nextLine();
//
//            for (Book b : myBook) {
//                if (b.getPrice() == pr) {
//                    temp.add(b);
//                }
//            }
//            myBook.removeAll(temp);
//            showBooks();
//
//            System.out.println("Delete by another price? Y/N");
//            String answer = sc.nextLine();
//            if (answer.equalsIgnoreCase("n")) {
//                System.out.println("Thanks!");
//                break;
//            }
//        }
//    }
//    
//    
    //LIST-->LAMDAAAAAAAAAAAAAAAAAAAAAAA 
//    public void deleteByPrice() {
//        ArrayList<Book> temp = new ArrayList<>();
//        while (true) {
//
//            System.out.println("Insert price:");
//            int pr = sc.nextInt();
//            sc.nextLine();
//
////           1) FORE!!!!
//            for (Book b : myBook) {
//                if (b.getPrice() == pr) {
//                    temp.add(b);
//                }
//            }
//            myBook.removeAll(temp);
//            showBooks();
//
////           2) FORI!!!!
////            for (int i = myBook.size()-1; i >= 0; i--) {
////                if (myBook.get(i).getPrice() == pr) {
////                    myBook.remove(i);
////                }
////            }
//
//
//            //    A KIND OF LAMDA!!!         
//            //myBook.stream().filter((book) -> (book.getPrice()==pr)).forEachOrdered((book) -> {
//            // temp.add(book);
//            //  });
//            
//            //     ANOTHER KIND OF LAMDA!!!       
//            // myBook.removeIf((s)->s.getPrice()==pr);
//            // Predicate p;
//            
//            System.out.println("Delete by another price? Y/N");
//            String answer = sc.nextLine();
//            if (answer.equalsIgnoreCase("n")) {
//                System.out.println("Thanks!");
//                break;
//            }
//        }
//    }

//              aceeasi met cu ITERATOR!!!!!!!!!!!!
    public void deleteByPrice() {
        Book temp = null;
        while (true) {

            System.out.println("Insert price:");
            int pr = sc.nextInt();
            sc.nextLine();

            Iterator<Book> it = myBook.iterator();
            while (it.hasNext()){
                    if ((it.next().getPrice())==pr ) {
                        it.remove();
                        showBooks();
                    }
                }

            System.out.println("Delete by another price? Y/N");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }
    public void deleteByType() {
        Book temp = null;

        while (true) {
            System.out.println("Input a type!");
            String t = sc.nextLine();

            for (Book b : myBook) {
                if (b.getType().equals(En_Type.valueOf(t.toUpperCase()))) {
                    temp = b;
                }
            }
            myBook.remove(temp);
            showBooks();

            System.out.println("Do you want to choos another type?Y/N");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

    public void deleteBy_Type_Sample() {

        Book temp = null;

        while (true) {
            System.out.println("Insert a price!");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println("Insert a sample!");
            String s = sc.nextLine();

            for (Book b : myBook) {
                if (b.getPrice() == n && b.getSample().equals(En_Sample.valueOf(s.toUpperCase()))) {
                    temp = b;
                }
            }
            myBook.remove(temp);
            showBooks();

            System.out.println("Delete by OTHER price & sample? Y/N");
            String answ = sc.nextLine();

            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Tanks!");
                break;
            }

        }
    }
}

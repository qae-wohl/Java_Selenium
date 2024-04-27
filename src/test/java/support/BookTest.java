package support;

import java.util.ArrayList;
import java.util.HashMap;

public class BookTest {

    public static void main(String[] args) {
        Book diary = new Book("src/test/resources/data/DiaryOfAWimpyKid.txt");
//        diary.readBook();
//        System.out.println(diary.getContent());
//        diary.searchFor(diary.content);

        Book harry = new Book("src/test/resources/data/HarryPotterAndTheSorcerersStone.txt");
        Book java = new Book("src/test/resources/data/JavaTheCompleteReference.txt");
        Book pride = new Book("src/test/resources/data/PrideAndPejudice.txt");


        ArrayList<Book> arrl = new ArrayList();
        arrl.add(diary);
        arrl.add(harry);
        arrl.add(java);
        arrl.add(pride);
        System.out.println(arrl);
        System.out.println(arrl.size());
        printBookContent(arrl);

        HashMap<Integer, ArrayList<Book>> library = new HashMap<>();
        library.put(123, arrl);
        System.out.println(library);




    }

    public static void printBookContent(ArrayList<Book> books) {

        for (int i=0; i < books.size(); i++)
            System.out.println(books.get(i).getContent());{
            System.out.println("");
        }
    }


}

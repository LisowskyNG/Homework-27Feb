import Homework27Feb.Author;
import Homework27Feb.Book;

public class Main {
    public static void main(String[] args) {
        Author valeriya = new Author("Валерия", "Новодворская");
        Author boris = new Author("Борис", "Немцов");

        Book proshanieSlav = new Book("Прощание славянки", valeriya, 2009);
        Book putinItogi = new Book("Путин.Итоги.10 лет", boris, 2008);

        System.out.println(boris.getName() +" "+ boris.getLastName());
        System.out.println(putinItogi.getTitle());
        System.out.println(putinItogi.getPublishedDate());

        System.out.println();

        System.out.println(valeriya.getName() +" "+ valeriya.getLastName());
        System.out.println(proshanieSlav.getTitle());
        System.out.println(proshanieSlav.getPublishedDate());

        proshanieSlav.setPublishedDate(2015);

        System.out.println();

        System.out.println(valeriya.getName() +" "+ valeriya.getLastName());
        System.out.println(proshanieSlav.getTitle());
        System.out.println(proshanieSlav.getPublishedDate());
    }
}
import Homework27Feb.Author;
import Homework27Feb.Book;

public class Main {
    public static void main(String[] args) {
       Author boris = new Author("Борис", "Немцов");
       Author valeriya = new Author("Валерия", "Новодворская");

       Book proshanieSlav = new Book("Прощание славянки", valeriya, 2009);
       Book putinItogi = new Book("Путин.Итоги.10 лет", boris, 2008);




    }
}
package Homework27Feb;

//import Homework27Feb.Author;
//import Homework27Feb.Book;

public class Main {
    public static void main(String[] args) {
        Author valeriya = new Author("Валерия", "Новодворская");
        Author boris = new Author("Борис", "Немцов");

        Book proshanieSlav = new Book("Прощание славянки", valeriya, 2009);
        Book putinItogi = new Book("Путин.Итоги.10 лет", boris, 2008);

        //System.out.println(valeriya.getName() +" "+ valeriya.getLastName());
        System.out.println(proshanieSlav.getAuthor().getName() +" "+ proshanieSlav.getAuthor().getLastName());
        System.out.println(proshanieSlav.getTitle());
        System.out.println(proshanieSlav.getPublishedDate());

        System.out.println();

        System.out.println(putinItogi.getAuthor().getName() +" "+ putinItogi.getAuthor().getLastName());
        System.out.println(putinItogi.getTitle());
        System.out.println(putinItogi.getPublishedDate());

        proshanieSlav.setPublishedDate(2015);

        System.out.println();

        System.out.println(proshanieSlav.getAuthor().getName() +" "+ proshanieSlav.getAuthor().getLastName());
        System.out.println(proshanieSlav.getTitle());
        System.out.println(proshanieSlav.getPublishedDate());

        System.out.println(valeriya);
        System.out.println(proshanieSlav);

        System.out.println(boris);
        System.out.println(putinItogi);
    }


}

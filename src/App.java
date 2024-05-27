public class App {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author martin = new Author("Джордж", "Мартин");

        Book book1 = new Book("Сказка о царе салтане", pushkin, 1831);
        Book book2 = new Book("Игра престолов", martin, 1996);

        System.out.println(book1);
        System.out.println(book2);
    }
}

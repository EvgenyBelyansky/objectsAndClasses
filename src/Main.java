public class Main {
    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println(" Имя - ");
        }
        Person sarah = new Person("Sarah", 30);

        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        sarah.setName("Jennifer");
        System.out.println("sarah.getAge() = " + sarah.getAge());
        System.out.println("sarah.getName() = " + sarah.getName());

        Person john = new Person("John", 18);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

        String phoneNumber = "8(993)4667872";
        String phoneNumber2 = "8(902) 183+27-55";
        System.out.println(NumberUtility.removeSymbols(phoneNumber));
        phoneNumber = NumberUtility.removeSymbols(phoneNumber);
        System.out.println(NumberUtility.validateCountry(phoneNumber));

        Book book = new Book("S.King", 100, "Book Publishing Ltd.");
        book.author = "L. Tolstoy";
        System.out.println(book.getAuthor());

    }

}

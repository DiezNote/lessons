package less.less7.less_7_1;

/**
 * Created by лтд on 22.11.2016.
 */
public class less_7_main {
    public static void main(String[] args) {
        Address NewAddress = new Address();

        NewAddress.setApartment(32);
        NewAddress.setCity("Одесса");
        NewAddress.setCountry("Украина");
        NewAddress.setHouse("16");
        NewAddress.setIndex(42556);
        NewAddress.setStreet("Южная");

        System.out.println("Номер квартиры: " + NewAddress.getApartment());
        System.out.println("Город: " + NewAddress.getCity());
        System.out.println("Страна: " + NewAddress.getCountry());
        System.out.println("Номер дома: " + NewAddress.getHouse());
        System.out.println("Почтовый интекс: " + NewAddress.getIndex());
        System.out.println("Название улицы: " + NewAddress.getStreet());
    }
}

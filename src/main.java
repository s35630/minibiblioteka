public class main {
    public static void main(String[] args) {
        System.out.println("=== ZADANIE 1 - KSIAZKI ===");
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Harry Potter", "J.K. Rowling", 400, true);
        Ksiazka k3 = new Ksiazka("1984", "George Orwell", 250, false);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        System.out.println();
        System.out.println("=== ZADANIE 2 - CZYTELNICY ===");
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 101, 0);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 102, 2);

        c1.wypiszDane();
        c2.wypiszDane();

        System.out.println();
        System.out.println("=== ZADANIE 3 I 4 - BIBLIOTEKA ===");
        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println();
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        System.out.println();
        System.out.println("Wypozyczenie ksiazki Harry Potter przez Jana Kowalskiego:");
        biblioteka.wypozyczKsiazke("Harry Potter", c1);

        System.out.println();
        biblioteka.wypiszDostepneKsiazki();
        c1.wypiszDane();

        System.out.println();
        System.out.println("Zwrot ksiazki Harry Potter przez Jana Kowalskiego:");
        biblioteka.zwrocKsiazke("Harry Potter", c1);

        System.out.println();
        biblioteka.wypiszDostepneKsiazki();
        c1.wypiszDane();
    }
}
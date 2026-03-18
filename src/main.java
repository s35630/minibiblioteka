public class main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Harry Potter", "J.K. Rowling", 400, true);
        Ksiazka k3 = new Ksiazka("1984", "George Orwell", 250, false);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 101, 0);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 102, 2);

        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println();
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Harry Potter");

        if (znaleziona != null) {
            System.out.println("Znaleziono ksiazke:");
            znaleziona.wypiszInfo();
        } else {
            System.out.println("Nie znaleziono ksiazki.");
        }

        System.out.println();
        c1.wypiszDane();
        c2.wypiszDane();
    }
}

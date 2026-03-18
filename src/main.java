public class main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300, true);
        Ksiazka k2 = new Ksiazka("Harry Potter", "Rowling", 400, true);
        Ksiazka k3 = new Ksiazka("1984", "Orwell", 250, true);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        k1.wypozycz();
        k1.wypiszInfo();

        k1.zwroc();
        k1.wypiszInfo();
        System.out.println("-------------------");
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 101, 0);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 102, 2);

        c1.wypiszDane();
        c2.wypiszDane();

        c1.zwiekszLiczbeWypozyczen();
        c1.wypiszDane();

        c2.zmniejszLiczbeWypozyczen();
        c2.wypiszDane();
    }
}

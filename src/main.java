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
    }
}

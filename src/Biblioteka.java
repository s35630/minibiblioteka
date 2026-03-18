public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano ksiazke do biblioteki.");
        } else {
            System.out.println("Brak miejsca w bibliotece.");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }

        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (ksiazka.isDostepna()) {
                ksiazka.wypozycz();
                czytelnik.zwiekszLiczbeWypozyczen();
            } else {
                System.out.println("Ksiazka nie jest dostepna.");
            }
        } else {
            System.out.println("Nie znaleziono ksiazki o tytule: " + tytul);
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (!ksiazka.isDostepna()) {
                ksiazka.zwroc();
                czytelnik.zmniejszLiczbeWypozyczen();
            } else {
                System.out.println("Ksiazka jest juz dostepna w bibliotece.");
            }
        } else {
            System.out.println("Nie znaleziono ksiazki o tytule: " + tytul);
        }
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {

        Adres adresKrakow = new Adres("Krakow", "Bagrowa", "78", "14", "30-733");

        Adres adresLegnica = new Adres("Legnica", "Nowowiejska", "26", "59-220");

        Osoba profesorJan = new Osoba("Jan", "Kowalski", 1980, "dr", adresKrakow);

        Osoba studentAnna = new Osoba("Anna", "Nowak", 1998, adresKrakow //ten sam aders bo mieszkaja w tym samym mieszkaniu
        );


        Osoba biznesmenPiotr = new Osoba("Piotr", "Kowalczyk", 1990, adresLegnica);

        profesorJan.dodajZnajomego(studentAnna);
        profesorJan.dodajZnajomego(biznesmenPiotr);

        studentAnna.dodajZnajomego(profesorJan);

        System.out.println(profesorJan);
        System.out.println(studentAnna);
        System.out.println(biznesmenPiotr);


        System.out.println();
        System.out.println("Znajomi profesora: ");
        for (Osoba znajomy : profesorJan.getZnajominaFb()) {
            System.out.println("- " + znajomy);
        }

        System.out.println();
        System.out.println("Znajomi anny: ");
        for (Osoba znajomy : studentAnna.getZnajominaFb()) {
            System.out.println("- " + znajomy);
        }
        System.out.println("\n Zadanie 1 \n");
        //ZADANIA
        //Poczytah sobiej o duzych liczbach czyi BigDecimal w java

        /*Zadania.Zadanie1.
         * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar penisa. Pordukt ma nazwe, cene i jesli jest to kondom to wymiar.
         *  Klient moze miec wiele produktow, produkt moze miec jednego klienta.
         *
         *  1) Napisz metode ktota znajduje klienta ktory wydal najwiecej.
         *
         *   2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa
         *
         *   3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na swoj rozmiar 😃
         */


        Client johny = new Client("John", "Wick", 28);
        Client roman = new Client("Roman", "Boski", 17);
        Client angelina = new Client("Angelina", "Jedwabna");

        //produkty
        Durex gumka  = new Durex("durex", 5.99, 28);
        johny.buy(gumka);
        List<Client> clients = new ArrayList<>();
        clients.add(johny);
        clients.add(angelina);
        clients.add(roman);
        //todo zmienic w ten sposob dla wszystkich produktow
        //poczytac o rodzajach wyjatkow w java, checked i unchecked
        // i pocztac o big decimalach

//        johny.buy("durex", 5.99, 28);
//        johny.buy("Cucumber", 1.99);
//        johny.buy("Waseline", 0.55);
//        roman.buy("durex", 5.99, 24);
//        roman.buy("Vodka Gorbachov", 6.12, 0.7, 40);
//        angelina.buy("Red Wine", 8.99, 0.7, 12);
//        angelina.buy("LM", 10.00, "Blue");
        System.out.println("\nTop client is: " + Client.bestBuyer(clients));
        System.out.println();
        Client.whoBuyCondom(clients);
        System.out.println();
        Client.whoPretendToHaveBiggerDick(clients);

        System.out.println("\nZadanie 2\n");
/*Zadania.Zadania.Zadanie2.
		 * Stwórz klasę Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).   //update produkty i klienci beda przez K zeby nie kolidowali z tymi z zad 1.
			Pracownik uzywa samochod (model, marka)

			1) Znajdz klienta który wydal najwiecej

			2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)

			3) Wyswietl 3 top pracownikow z najwieksza pensja

			4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
		 */
        Worker donald = new Worker("Donald", "Trump", 25000);
        Worker donaldPL = new Worker("Donald", "Tusk", 15000);
        Worker george = new Worker("George", "Washington", 0);
        Worker antoine = new Worker("Antoine de saint", "Exupery", 100);
        Klient marzena = new Klient("Marzena", "Chrzan");
        Klient ildefons = new Klient("Ildefons", "Galczynski");
        Car honda = new Car("Honda", "Accord");
        Car fiat = new Car("Fiat", "Panda");
        List<Klient> klienci = new ArrayList<>();
        List<Worker> workers = new ArrayList<>();

        //korzsytanie z samochodow
        george.useCar(honda, 5);
        george.useCar(honda, 5);
        george.useCar(fiat, 5);
        antoine.useCar(fiat, 5);
        antoine.useCar(fiat, 5);
        antoine.useCar(honda, 5);
        donald.useCar(honda, 23);

        //dodawanie pracownikow
        workers.add(donald);
        workers.add(donaldPL);
        workers.add(george);
        workers.add(antoine);

        //dodawanie klientow
        klienci.add(marzena);
        klienci.add(ildefons);

        //kupowanie
        ildefons.buy("Maslo", 1.00);
        ildefons.buy("Maslo", 1.00);
        ildefons.buy("Mleko", 1.20);
        marzena.buy("chrzan", 25);
        marzena.buy("chrzan", 25);
        marzena.buy("chrzan", 25);

        Klient.bestKlient(klienci);
        for (Klient klient : klienci) {
            System.out.println("\n" + klient.getName() + " " + klient.getLastName() + ", favourite article: " + klient.getFavourite());
        }
        System.out.println();
        Worker.top3Workers(workers);
        System.out.println();
        donald.checkCarUsage();
        antoine.checkCarUsage();
        george.checkCarUsage();


        System.out.println("\nzadanie3\n");
        /*Zadania.Zadanie3.
         * Stwórz system do zarządzania przedszkolem. W przedszkolu mamy dzieci oraz
         * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
         * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
         *
         * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
         * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych.
         *
         * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
         * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce.
         *
         * Kazda grupa ma przypisana sale (nazwa, kolor scian).
         *
         * -narysuj poprawny diagram uml do teog zagadnienia
         * -napisz metode która zwraca dziecko ktore ma najwiecej przewinien
         * -napisz metode ktora zwroci wychowawcow kwliafikowanych z pensja wieksza niz podany parametr


         */
        List<WychowacaKwalifikowany> kwalifikowani = new ArrayList<>();
        List<NieposluszneDziecko> niegrzeczneDzieci = new ArrayList<>();
        Wychowawca danuta = new Wychowawca("Danuta", "Grzybowa", "15.12.1969", 3599);
        Wychowawca kasia = new Wychowawca("Katarzyna", "Pomidorowa", "12.09.1975", 4100);
        WychowacaKwalifikowany mgrDanuta = new WychowacaKwalifikowany(danuta, "Potrafi karmic dzieci grzybami");
        WychowacaKwalifikowany mgrKasia = new WychowacaKwalifikowany(kasia, "gotuje pomidorowa zupe w 15 minut");
        Dziecko rysiu = new Dziecko("Ryszard", "Orzechowski", "01.02.2020");
        Dziecko krzys = new Dziecko("Krzystof", "Zych", "01.05.2020");
        NieposluszneDziecko rysiek = new NieposluszneDziecko(rysiu);
        NieposluszneDziecko krzysiek = new NieposluszneDziecko(krzys);
        Sala sala1 = new Sala("Sala nr 1", "Niebieskie");
        Sala sala2 = new Sala("Sala nr 2", "Zielone");
        Grupa grupa1 = new Grupa(mgrDanuta, sala1);
        Grupa grupa2 = new Grupa(mgrKasia, sala2);
        krzysiek.addPrzewinienia("Rzut krzeslem w kolege");
        rysiek.addPrzewinienia("Obnazanie sie");
        rysiek.addPrzewinienia("Wymioty");
        rysiek.addPrzewinienia("Salta ze stolu");
        niegrzeczneDzieci.add(krzysiek);
        niegrzeczneDzieci.add(rysiek);
        kwalifikowani.add(mgrDanuta);
        kwalifikowani.add(mgrKasia);
        grupa1.addDziecko(rysiu);
        grupa2.addDziecko(krzys);
        NieposluszneDziecko.getWorst(niegrzeczneDzieci);
        WychowacaKwalifikowany.wychowacyPowyzej(kwalifikowani, 3000);


        System.out.println("\n zadanie4 \n");
/*Zadania.Zadanie4.
		 * Ok to masz graczy ktorzy graja w turniejach. Turniej ma nazwe i miesiac. Gracz ma imie i nazwisko.
		 * Gracz zdobywa punkty za udzial w turnieju, za 1 miejsce 100, za 2 80 ... za 5 20 za 6 i dalej nic.

			0) UZYWAJ WYJATKOW GDZIE SIE DA:) nie bylo wyjatkow

			1) chcemy przechowywac dla kazdego gracza jakie pozycje zajmowal w jakim turnieju

			2) tak samo punkty jakie zdobyl z dnaego turnieju

			3) znajdz gracsa ktory byl najlepeszt w turniejach o danej nazwie, jesli nie ma to rzuc wyjatkiem

			4) znajdz gracza ktory zodbyl najwiecej 1 miejsc ze wszystkich turniejow

			5) znajdz gracza ktory ma najwyzsyz ranking z turrniejow ale nigdycnie mial 1 miejsca
		 */

        Gracz maria = new Gracz("Maria", "Sklodowska");
        Gracz walter = new Gracz("Walter", "White");
        Gracz dimitri = new Gracz("Dimitri", "Mendeleev");
        Turniej poker = new Turniej("Poker dla chemikow", "Marzec");
        List<Gracz> gracze = new ArrayList<>();
        Gracz mvp = null;
        Gracz mvpBezPierwszegoMiejsca = null;
        maria.dodajWynik(poker, 1);
        walter.dodajWynik(poker, 2);
        dimitri.dodajWynik(poker, 3);
        gracze.add(maria);
        gracze.add(walter);
        gracze.add(dimitri);
        maria.wyniki();
        for (Gracz gracz : gracze) {
            if (gracz.miejsce(poker) == 1) {
                System.out.println("\nNajlepszy gracz w turnieju " + poker + " to" + gracz);
            }
            if ((mvp == null) || (mvp.getIloscPierwszychMiejsc() < gracz.getIloscPierwszychMiejsc())) {
                mvp = gracz;
            }
            if ((mvpBezPierwszegoMiejsca == null || mvpBezPierwszegoMiejsca.getPunktacja() < gracz.getPunktacja()) && (gracz.getIloscPierwszychMiejsc() == 0)) {
                mvpBezPierwszegoMiejsca = gracz;
            }
        }
        System.out.println("Gracz ktory zajal najwieksza liczbe pierwszych miejsc to: " + mvp);
        System.out.println("Gracz z najwieksza liczba puntkow ktory nigdy nie mial peirwszego miejsca to : " + mvpBezPierwszegoMiejsca);


        System.out.println("\nzadanie 5\n");
/*Zadania.Zadanie5.
		 *  W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci
			oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.

			Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.

			Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)), sprzet moze byc naprawiany.
			 Chcemy przechowywac informacje o tym jaki trener uzywal kiedy
			jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie.


			-znajdz trenera ktory trenował najwiecej zwierzat
			-znajdz trenera ktory uzywał jakiegos sprzetu najwieksza liczbe razy
			-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
			-znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
			-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
		 */
        Trener ash = new Trener("Ash", "Kechum", "Alabastia");
        Trener uma = new Trener("Uma", "Thurman", "Berlin");
        Pies johnatan = new Pies("Johny Bravo", "spaniel", "Dluga", "Pilka tenisowa");
        Pterodaktyl kornelek = new Pterodaktyl("Kornelek", "Pterodaktyl", 15);
        Pterodaktyl igorek = new Pterodaktyl("Igorek", "Pterodaktyl", 32);
        Kot sierzantMiauczynski = new Kot("Sierzant Miauczynski", "kot norweski", 7);
        Sprzet bicz = new Sprzet("Bicz", "nowy");
        Sprzet paralizator = new Sprzet("Paralizator", "tragiczny");
        List<Trener> trenerzy = new ArrayList<>();
        List<Sprzet> wyposazenie = new ArrayList<>();
        List<Pterodaktyl> pterodaktyle = new ArrayList<>();
        Trener najwiecejZwierzat = null;
        ash.uzyjSprzetu(bicz);
        ash.uzyjSprzetu(bicz);
        paralizator.napraw();
        uma.uzyjSprzetu(paralizator);
        paralizator.napraw();
        uma.uzyjSprzetu(paralizator);
        wyposazenie.add(bicz);
        wyposazenie.add(paralizator);
        trenerzy.add(ash);
        trenerzy.add(uma);
        ash.trenujZwierze(kornelek);
        ash.trenujZwierze(sierzantMiauczynski);
        uma.trenujZwierze(johnatan);
        pterodaktyle.add(kornelek);
        pterodaktyle.add(igorek);
        System.out.println();
        for (Trener trener : trenerzy) {
            if (najwiecejZwierzat == null || najwiecejZwierzat.getTrenowaneZwierzeta().size() < trener.getTrenowaneZwierzeta().size()) {
                najwiecejZwierzat = trener;
            }
            for (Zwierze zwierze : trener.getTrenowaneZwierzeta()) {
                if (zwierze.getGatunek().equals("spaniel")) {
                    System.out.println(trener + " tresuje spaniela");
                }
            }
        }
        System.out.println("Trener z najwieksza iloscia zwierzat pod opieka to " + najwiecejZwierzat);

        for (Sprzet sprzet : wyposazenie) {
            Trener najczesciejUzywajacy = null;
            Integer value = null;
            for (Map.Entry<Trener, Integer> entry : sprzet.getHistoriaUzycia().entrySet()) {
                if (najczesciejUzywajacy == null || value < entry.getValue()) {
                    najczesciejUzywajacy = entry.getKey();
                    value = entry.getValue();
                }
            }
            System.out.println(sprzet + " najczesciej byl uzywany przez: " + najczesciejUzywajacy);
            if (sprzet.getLiczbaNapraw() >= 2) {
                System.out.println(sprzet + " byl naprawiany conajmniej 2 razy");
            }
        }
        for (Pterodaktyl pterodaktyl : pterodaktyle) {
            if (pterodaktyl.getTrener() == null) {
                System.out.println(pterodaktyl + " jest bezpanski");
            }
        }


        System.out.println("\nzadanie6\n");
/*Zadania.Zadanie6.
Napisz krótki program do zarządzania sklepem internetowym.
W sklepie pracuje obsługa(imie, nazwisko, adres, data rozpoczęcia pracy). Osoby z obsługi mogą zostać managerami.
Sklep może zarejestrować nowego klienta(imie, nazwisko, adres, data rejestracji). Klient może mieć wiele koszyków,
 	które mogą przechowywać wiele produktów(nazwa, cena).
W sklepie powinna być możliwość dokonania zakupu, co usuwa koszyk klientowi,
 	ale umieszcza jego odpowiednik w "historii zamówień".
*/
        AdresZamieszkania stuAdres = new AdresZamieszkania("Komorniki", "Bagienna", 12, "66-666");
        Obsluga stu = new Obsluga("Stewart", "Malutki", stuAdres, "12.12.2012");
        AdresZamieszkania tomcioAdres = new AdresZamieszkania("Sztokholm", "Kielbasiana", 1, 1, "12-234");
        Kupujacy tomcio = new Kupujacy("Tomcio", "Paluch", tomcioAdres, "14.12.2025");
        Artykul papierosy = new Artykul("Papierosy LM", 13.60);
        Artykul piwo = new Artykul("Piwo Tatra", 3.50);
        Artykul papierToaletowy = new Artykul("Papier Velvet", 5.60);
        Artykul chleb = new Artykul("chleb", 2.60);
        Koszyk koszyk1 = new Koszyk();
        Koszyk koszyk2 = new Koszyk();
        //todo dodaj relacje koszyk kupujacy
        //kupujacy ma wiele koszykow, koszykl ma 1 kupujacego
        stu.promocjaNaMenadzera();

        koszyk1.dodajArtykul(papierosy);
        koszyk1.dodajArtykul(papierToaletowy);
        koszyk1.dodajArtykul(chleb);
        koszyk1.dodajArtykul(piwo);

        koszyk2.dodajArtykul(papierToaletowy);
        koszyk2.dodajArtykul(chleb);
        koszyk2.dodajArtykul(piwo);
        koszyk2.dodajArtykul(piwo);
        koszyk2.dodajArtykul(piwo);

        tomcio.dodajKoszyk(koszyk1);
        tomcio.dodajKoszyk(koszyk2);
        tomcio.finalizujKoszyk(koszyk1);
        tomcio.finalizujKoszyk(koszyk2);

        System.out.println("\n zadanie7\n");
/*Zadania.Zadanie7.
Napisz program do zarządzania kursami.
Nauczyciel ma imię, nazwisko, datę zatrudnienia i może uczyć wielu języków
Student ma imię, nazwisko, język którego się uczy.
Student może mieć jednego nauczyciela
Nauczyciel może mieć wielu studentów

zbuduj program tak by dało się dodawać lekcje (termin)

-przypisywanie kursantowi Nauczyciela musi weryfikować język
-lekcja nie może być dodawana w przeszłości.  //update operowanie data wykracza to poza moje mozliwosci
-znajdz kursanta, który ma najwięcej lekcji
-znajdz nauczyciela, który ma najwięcej kursantów

*/
        Nauczyciel chrzanowski = new Nauczyciel("Zdzislaw", "Chrzanowski", "1.01.2025");
        Nauczyciel moniuszko = new Nauczyciel("Zdzislaw", "Moniuszko", "12.05.2024");
        List<Lekcja> lekcje = new ArrayList<>();
        Jezyk hiszpanski = new Jezyk("Hiszpanski");
        Jezyk niemiecki = new Jezyk("Niemiecki");
        Student michalina = new Student("Michalina", "Konopnicka", hiszpanski);
        Student charlie = new Student("Charles", "Manson", niemiecki);
        Student najwiecejLekcji = null;
        Nauczyciel najwiecejUczy = null;

        chrzanowski.dodajJezykNauzania(hiszpanski);
        moniuszko.dodajJezykNauzania(niemiecki);
        michalina.przypiszNauczyciela(chrzanowski);
        charlie.przypiszNauczyciela(moniuszko);

        Lekcja lekcja1 = new Lekcja(hiszpanski, chrzanowski, michalina, "17.12.2025, 15:00");
        Lekcja lekcja2 = new Lekcja(niemiecki, moniuszko, charlie, "17.12.2025, 17:00");
        Lekcja lekcja3 = new Lekcja(niemiecki, moniuszko, charlie, "18.12.2025, 17:00");
        lekcje.add(lekcja1);
        lekcje.add(lekcja2);
        lekcje.add(lekcja3);

        for (Lekcja lekcja : lekcje) {
            if (najwiecejLekcji == null || najwiecejLekcji.getLiczbaLekcji() < lekcja.getStudent().getLiczbaLekcji()) {
                najwiecejLekcji = lekcja.getStudent();
            }
            if (najwiecejUczy == null || najwiecejUczy.getStudenciNauczani().size() < lekcja.getNauczyciel().getStudenciNauczani().size()) {
                najwiecejUczy = lekcja.getNauczyciel();
            }
        }
        System.out.println("Najwiecej lekcji ma: " + najwiecejLekcji);
        System.out.println("Najwiecej lekcji prowadzi: " + najwiecejUczy);
    }
}

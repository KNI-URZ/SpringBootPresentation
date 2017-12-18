package com.presentation.data;

import com.presentation.entity.Address;
import com.presentation.entity.Person;
import com.presentation.repositories.AddressRepository;
import com.presentation.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class InjectData {

    private PersonRepository personRepository;
    private AddressRepository addressRepository;

    @Autowired
    public InjectData(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

//    @PostConstruct
    private void injectData() {
        List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("Jan","Nowak",39));
                add(new Person("Stanisław","Kowalski",25));
                add(new Person("Andrzej","Wiśniewski",20));
                add(new Person("Józef","Wójcik",36));
                add(new Person("Tadeusz","Kowalczyk",37));
                add(new Person("Jerzy","Kamiński",26));
                add(new Person("Zbigniew","Lewandowski",36));
                add(new Person("Krzysztof","Zieliński",24));
                add(new Person("Piotr","Szymański",34));
                add(new Person("Ryszard","Woźniak",23));
                add(new Person("Kazimierz","Dąbrowski",25));
                add(new Person("Marek","Kozłowski",34));
                add(new Person("Marian","Jankowski",24));
                add(new Person("Piotr","Mazur",31));
                add(new Person("Janusz","Wojciechowski",38));
                add(new Person("Władysław","Kwiatkowski",25));
                add(new Person("Adam","Krawczyk",35));
                add(new Person("Wiesław","Kaczmarek",27));
                add(new Person("Zdzisław","Piotrowski",21));
                add(new Person("Edward","Grabowski",24));
                add(new Person("Jan","Zając",27));
                add(new Person("Roman","Pawłowski",21));
                add(new Person("Mirosław","Michalski",40));
                add(new Person("Grzegorz","Król",35));
                add(new Person("Czesław","Jabłoński",33));
                add(new Person("Dariusz","Wróbel",37));
                add(new Person("Wojciech","Wieczorek",39));
                add(new Person("Jacek","Nowakowski",26));
                add(new Person("Eugeniusz","Majewski",39));
                add(new Person("Tomasz","Olszewski",25));
                add(new Person("Stefan","Stępień",39));
                add(new Person("Zygmunt","Jaworski",38));
                add(new Person("Leszek","Malinowski",26));
                add(new Person("Bogdan","Dudek",35));
                add(new Person("Jan","Adamczyk",37));
                add(new Person("Paweł","Pawlak",38));
                add(new Person("Franciszek","Górski",20));
                add(new Person("Piotr","Nowicki",38));
                add(new Person("Waldemar","Sikora",37));
                add(new Person("Piotr","Walczak",38));
                add(new Person("Robert","Witkowski",40));
                add(new Person("Mariusz","Baran",40));
                add(new Person("Włodzimierz","Rutkowski",34));
                add(new Person("Michał","Michalak",22));
                add(new Person("Jan","Szewczyk",30));
                add(new Person("Bogusław","Ostrowski",27));
                add(new Person("Witold","Tomaszewski",22));
                add(new Person("Aleksander","Pietrzak",32));
                add(new Person("Bronisław","Wróblewski",30));
                add(new Person("Wacław","Borowski",34));
                add(new Person("Bolesław","Nowak",25));
                add(new Person("Jan","Kowalski",39));
                add(new Person("Maciej","Wiśniewski",32));
                add(new Person("Artur","Wójcik",24));
                add(new Person("Edmund","Kowalczyk",23));
                add(new Person("Marcin","Kamiński",40));
                add(new Person("Lech","Lewandowski",36));
                add(new Person("Karol","Zieliński",26));
                add(new Person("Piotr","Szymański",32));
                add(new Person("Arkadiusz","Woźniak",35));
                add(new Person("Jan","Dąbrowski",20));
                add(new Person("Sylwester","Kozłowski",28));
                add(new Person("Lucjan","Jankowski",39));
                add(new Person("Julian","Mazur",40));
                add(new Person("Wiktor","Wojciechowski",24));
                add(new Person("Romuald","Kwiatkowski",39));
                add(new Person("Bernard","Krawczyk",31));
                add(new Person("Ludwik","Kaczmarek",39));
                add(new Person("Feliks","Piotrowski",36));
                add(new Person("Alfred","Grabowski",29));
                add(new Person("Alojzy","Zając",25));
                add(new Person("Przemysław","Pawłowski",29));
                add(new Person("Cezary","Michalski",24));
                add(new Person("Daniel","Król",31));
                add(new Person("Mikołaj","Jabłoński",21));
                add(new Person("Ignacy","Wróbel",28));
                add(new Person("Piotr","Wieczorek",40));
                add(new Person("Radosław","Nowakowski",35));
                add(new Person("Konrad","Majewski",26));
                add(new Person("Bogumił","Olszewski",22));
                add(new Person("Szczepan","Stępień",28));
                add(new Person("Gerard","Jaworski",27));
                add(new Person("Hieronim","Malinowski",28));
                add(new Person("Krystian","Dudek",38));
                add(new Person("Leonard","Adamczyk",39));
                add(new Person("Wincenty","Pawlak",29));
                add(new Person("Benedykt","Górski",26));
                add(new Person("Hubert","Nowicki",20));
                add(new Person("Sebastian","Sikora",30));
                add(new Person("Norbert","Walczak",38));
                add(new Person("Adolf","Witkowski",22));
                add(new Person("Łukasz","Baran",37));
                add(new Person("Emil","Rutkowski",40));
                add(new Person("Teodor","Michalak",29));
                add(new Person("Rudolf","Szewczyk",37));
                add(new Person("Joachim","Ostrowski",29));
                add(new Person("Jakub","Tomaszewski",29));
                add(new Person("Walenty","Pietrzak",26));
                add(new Person("Alfons","Wróblewski",38));
                add(new Person("Damian","Borowski",31));
                add(new Person("Maria","Nowak",20));
                add(new Person("Krystyna","Kowalska",28));
                add(new Person("Anna","Wiśniewska",30));
                add(new Person("Barbara","Wójcik",39));
                add(new Person("Teresa","Kowalczyk",26));
                add(new Person("Elżbieta","Kamińska",39));
                add(new Person("Janina","Lewandowska",23));
                add(new Person("Zofia","Zielińska",29));
                add(new Person("Jadwiga","Szymańska",40));
                add(new Person("Danuta","Woźniak",31));
                add(new Person("Halina","Dąbrowska",25));
                add(new Person("Irena","Kozłowska",39));
                add(new Person("Ewa","Jankowska",25));
                add(new Person("Małgorzata","Mazur",26));
                add(new Person("Helena","Wojciechowska",30));
                add(new Person("Grażyna","Kwiatkowska",38));
                add(new Person("Bożena","Krawczyk",25));
                add(new Person("Stanisława","Kaczmarek",27));
                add(new Person("Jolanta","Piotrowska",27));
                add(new Person("Marianna","Grabowska",35));
                add(new Person("Urszula","Zając",23));
                add(new Person("Wanda","Pawłowska",36));
                add(new Person("Alicja","Michalska",28));
                add(new Person("Dorota","Król",32));
                add(new Person("Agnieszka","Jabłońska",32));
                add(new Person("Beata","Wróbel",21));
                add(new Person("Katarzyna","Wieczorek",32));
                add(new Person("Joanna","Nowakowska",30));
                add(new Person("Wiesława","Majewska",33));
                add(new Person("Renata","Olszewska",32));
                add(new Person("Iwona","Stępień",32));
                add(new Person("Genowefa","Jaworska",35));
                add(new Person("Kazimiera","Malinowska",40));
                add(new Person("Stefania","Dudek",24));
                add(new Person("Hanna","Adamczyk",26));
                add(new Person("Lucyna","Pawlak",40));
                add(new Person("Józefa","Górska",26));
                add(new Person("Alina","Nowicka",33));
                add(new Person("Mirosława","Sikora",35));
                add(new Person("Aleksandra","Walczak",21));
                add(new Person("Władysława","Witkowska",29));
                add(new Person("Henryka","Baran",21));
                add(new Person("Czesława","Rutkowska",29));
                add(new Person("Lidia","Michalak",31));
                add(new Person("Regina","Szewczyk",26));
                add(new Person("Monika","Ostrowska",25));
                add(new Person("Magdalena","Tomaszewska",38));
                add(new Person("Bogumiła","Pietrzak",33));
                add(new Person("Marta","Wróblewska",33));
                add(new Person("Marzena","Borowska",37));
                add(new Person("Leokadia","Nowak",23));
                add(new Person("Mariola","Kowalska",20));
                add(new Person("Bronisława","Wiśniewska",24));
                add(new Person("Aniela","Wójcik",29));
                add(new Person("Bogusława","Kowalczyk",20));
                add(new Person("Eugenia","Kamińska",27));
                add(new Person("Izabela","Lewandowska",34));
                add(new Person("Cecylia","Zielińska",21));
                add(new Person("Emilia","Szymańska",27));
                add(new Person("Łucja","Woźniak",26));
                add(new Person("Gabriela","Dąbrowska",33));
                add(new Person("Sabina","Kozłowska",23));
                add(new Person("Zdzisława","Jankowska",25));
                add(new Person("Agata","Mazur",27));
                add(new Person("Edyta","Wojciechowska",34));
                add(new Person("Aneta","Kwiatkowska",31));
                add(new Person("Daniela","Krawczyk",31));
                add(new Person("Wioletta","Kaczmarek",26));
                add(new Person("Sylwia","Piotrowska",37));
                add(new Person("Weronika","Grabowska",23));
                add(new Person("Antonina","Zając",28));
                add(new Person("Justyna","Pawłowska",20));
                add(new Person("Gertruda","Michalska",22));
                add(new Person("Mieczysława","Król",40));
                add(new Person("Franciszka","Jabłońska",21));
                add(new Person("Rozalia","Wróbel",24));
                add(new Person("Zuzanna","Wieczorek",36));
                add(new Person("Natalia","Nowakowska",33));
                add(new Person("Celina","Majewska",24));
                add(new Person("Ilona","Olszewska",38));
                add(new Person("Alfreda","Stępień",33));
                add(new Person("Wiktoria","Jaworska",32));
                add(new Person("Olga","Malinowska",27));
                add(new Person("Wacława","Dudek",37));
                add(new Person("Róża","Adamczyk",20));
                add(new Person("Karolina","Pawlak",35));
                add(new Person("Bernadeta","Górska",36));
                add(new Person("Julia","Nowicka",39));
                add(new Person("Michalina","Sikora",29));
                add(new Person("Adela","Walczak",39));
                add(new Person("Ludwika","Witkowska",37));
                add(new Person("Honorata","Baran",23));
                add(new Person("Aldona","Rutkowska",30));
                add(new Person("Eleonora","Michalak",31));
                add(new Person("Violetta","Szewczyk",23));
                add(new Person("Felicja","Ostrowska",30));
                add(new Person("Walentyna","Tomaszewska",20));
                add(new Person("Pelagia","Pietrzak",36));
                add(new Person("Apolonia","Wróblewska",36));
                add(new Person("Brygida","Borowska",21));
            }
        };

        List<Address> addressList = new ArrayList<Address>() {
            {
                add(new Address("Rzeszów","Polna"));
                add(new Address("Rzeszów","Leśna"));
                add(new Address("Rzeszów","Słoneczna"));
                add(new Address("Rzeszów","Krótka"));
                add(new Address("Rzeszów","Szkolna"));
                add(new Address("Rzeszów","Ogrodowa"));
                add(new Address("Rzeszów","Lipowa"));
                add(new Address("Rzeszów","Brzozowa"));
                add(new Address("Rzeszów","Łąkowa"));
                add(new Address("Rzeszów","Kwiatowa"));
                add(new Address("Lublin","Polna"));
                add(new Address("Lublin","Leśna"));
                add(new Address("Lublin","Słoneczna"));
                add(new Address("Lublin","Krótka"));
                add(new Address("Lublin","Szkolna"));
                add(new Address("Lublin","Ogrodowa"));
                add(new Address("Lublin","Lipowa"));
                add(new Address("Lublin","Brzozowa"));
                add(new Address("Lublin","Łąkowa"));
                add(new Address("Lublin","Kwiatowa"));
                add(new Address("Kraków","Polna"));
                add(new Address("Kraków","Leśna"));
                add(new Address("Kraków","Słoneczna"));
                add(new Address("Kraków","Krótka"));
                add(new Address("Kraków","Szkolna"));
                add(new Address("Kraków","Ogrodowa"));
                add(new Address("Kraków","Lipowa"));
                add(new Address("Kraków","Brzozowa"));
                add(new Address("Kraków","Łąkowa"));
                add(new Address("Kraków","Kwiatowa"));
                add(new Address("Bydgoszcz","Polna"));
                add(new Address("Bydgoszcz","Leśna"));
                add(new Address("Bydgoszcz","Słoneczna"));
                add(new Address("Bydgoszcz","Krótka"));
                add(new Address("Bydgoszcz","Szkolna"));
                add(new Address("Bydgoszcz","Ogrodowa"));
                add(new Address("Bydgoszcz","Lipowa"));
                add(new Address("Bydgoszcz","Brzozowa"));
                add(new Address("Bydgoszcz","Łąkowa"));
                add(new Address("Bydgoszcz","Kwiatowa"));
                add(new Address("Łódź","Polna"));
                add(new Address("Łódź","Leśna"));
                add(new Address("Łódź","Słoneczna"));
                add(new Address("Łódź","Krótka"));
                add(new Address("Łódź","Szkolna"));
                add(new Address("Łódź","Ogrodowa"));
                add(new Address("Łódź","Lipowa"));
                add(new Address("Łódź","Brzozowa"));
                add(new Address("Łódź","Łąkowa"));
                add(new Address("Łódź","Kwiatowa"));
                add(new Address("Warszawa","Polna"));
                add(new Address("Warszawa","Leśna"));
                add(new Address("Warszawa","Słoneczna"));
                add(new Address("Warszawa","Krótka"));
                add(new Address("Warszawa","Szkolna"));
                add(new Address("Warszawa","Ogrodowa"));
                add(new Address("Warszawa","Lipowa"));
                add(new Address("Warszawa","Brzozowa"));
                add(new Address("Warszawa","Łąkowa"));
                add(new Address("Warszawa","Kwiatowa"));
                add(new Address("Wrocław","Polna"));
                add(new Address("Wrocław","Leśna"));
                add(new Address("Wrocław","Słoneczna"));
                add(new Address("Wrocław","Krótka"));
                add(new Address("Wrocław","Szkolna"));
                add(new Address("Wrocław","Ogrodowa"));
                add(new Address("Wrocław","Lipowa"));
                add(new Address("Wrocław","Brzozowa"));
                add(new Address("Wrocław","Łąkowa"));
                add(new Address("Wrocław","Kwiatowa"));
                add(new Address("Poznań","Polna"));
                add(new Address("Poznań","Leśna"));
                add(new Address("Poznań","Słoneczna"));
                add(new Address("Poznań","Krótka"));
                add(new Address("Poznań","Szkolna"));
                add(new Address("Poznań","Ogrodowa"));
                add(new Address("Poznań","Lipowa"));
                add(new Address("Poznań","Brzozowa"));
                add(new Address("Poznań","Łąkowa"));
                add(new Address("Poznań","Kwiatowa"));
                add(new Address("Sopot","Polna"));
                add(new Address("Sopot","Leśna"));
                add(new Address("Sopot","Słoneczna"));
                add(new Address("Sopot","Krótka"));
                add(new Address("Sopot","Szkolna"));
                add(new Address("Sopot","Ogrodowa"));
                add(new Address("Sopot","Lipowa"));
                add(new Address("Sopot","Brzozowa"));
                add(new Address("Sopot","Łąkowa"));
                add(new Address("Sopot","Kwiatowa"));
                add(new Address("Zielona Góra","Polna"));
                add(new Address("Zielona Góra","Leśna"));
                add(new Address("Zielona Góra","Słoneczna"));
                add(new Address("Zielona Góra","Krótka"));
                add(new Address("Zielona Góra","Szkolna"));
                add(new Address("Zielona Góra","Ogrodowa"));
                add(new Address("Zielona Góra","Lipowa"));
                add(new Address("Zielona Góra","Brzozowa"));
                add(new Address("Zielona Góra","Łąkowa"));
                add(new Address("Zielona Góra","Kwiatowa"));
            }
        };

        personRepository.save(personList);
        addressRepository.save(addressList);

        Random r = new Random();
        for (Person p : personList) {
            int myRandom = r.nextInt(100);
            p.getAddresses().add(addressList.get(myRandom));
            addressList.get(myRandom).getPersons().add(p);

        }
        personRepository.save(personList);
        addressRepository.save(addressList);
    }

}

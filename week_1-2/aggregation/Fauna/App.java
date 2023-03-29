import java.util.*;
//Country class

class Main {
    public static void main(String[] args) {
        // Create two Fauna objects

        Fauna PhilippineEagle = new Fauna("Philippine Eagle");
        Fauna Tarsier = new Fauna("Tarsier");

        // Create a country
        Country Philippines = new Country("Philippines");

        // Create a arraylist and add the fauna
        List<Fauna> listOfFauna = new ArrayList<Fauna>();

        listOfFauna.add(PhilippineEagle);
        listOfFauna.add(Tarsier);

        // now add this list to Country Class
        Philippines.setlistofFauna(listOfFauna);

        System.out
                .println("The fauna found from the " + Philippines.getName() + " are " + Philippines.getSportPersons());

    }
}

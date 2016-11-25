package com.company;

import java.util.ArrayList;

public class PhoneBook {                // Class that stores Person-objects using an ArrayList
    private ArrayList<Person> phonebook = new ArrayList<Person>();

    private void add(String name, String number){       // creates a Person-object with the given name and number
        phonebook.add(new Person(name, number));        // and adds it to the ArrayList inside the Phonebook
    }

    public void printAll(){                             // using a for-each loop to print all of the persons inside the Phonebook
        for (Person person:phonebook) {
            System.out.println(person);
        }
    }

    private String searchNumber(String name){           // given a name
        for (Person person:phonebook) {                 // loops through the ArrayLIst using a for-each loop
            if (person.getName().equals(name)) {        // for each person, checks the name against the given name
                return person.getNumber();              // if matched, returns the number associated with the person
            }
        }
        return "number not known";                      // else return "number not known"
    }

    public static void main(String[] args){
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println(number);

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println(number);
    }
}

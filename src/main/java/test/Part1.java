package test;

import model.Address;
import model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Part1 {

    public static void main(String [] args) {
        List<Person> persons = Arrays.asList(
                new Person("A", 15, new Address("Montreal")),
                new Person("B", 24, new Address("Sherbrooke")),
                new Person("C", 62, new Address("Montreal")),
                new Person("D", 8, new Address("Montreal")),
                new Person("E", 90, new Address("Quebec")),
                new Person("F", 34, new Address("Granby")),
                new Person("G", 21, new Address("Montreal"))
        );

        printStatus(persons);
		
		 /*
		  Should output:
		    D is young [8]
		    A is young [15]
		    G is young [21]
		    B is not that young [24]
		    F is not that young [34]
		    C is not that young [62]
		    E is not that young [90]
		   */
        Map<String, Integer> cs = getCityStats(persons);
				  /*
				    The following should print:
				    Quebec -> 1
				    Granby -> 1
				    Montreal -> 4
				    Sherbrooke -> 1
				  */
        assert cs != null;
        for (Map.Entry<String, Integer> entry : cs.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


    private static void printStatus(List<Person> persons) {
        // TODO
    }

    private static Map<String, Integer> getCityStats(List<Person> persons) {
        // TODO
        return null;
    }
}

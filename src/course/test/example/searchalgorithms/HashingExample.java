/*
 * Hashing is a technique used to quickly locate a data record given its search key. 
 * It involves mapping the search key to an index in a data structure, typically an array or a hash table. 
 * This allows for near-constant time retrieval, provided that the hashing function is well-designed and collisions are minimized
 * 
 */

package course.test.example.searchalgorithms;

import java.util.HashMap;

public class HashingExample {

    public static void main(String[] args) {
        // Create a hash map to store data
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insert key-value pairs into the hash map
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 35);

        // Retrieve data from the hash map
        String nameToFind = "Charlie";
        if (hashMap.containsKey(nameToFind)) {
            int age = hashMap.get(nameToFind);
            System.out.println(nameToFind + "'s age is " + age);
        } else {
            System.out.println(nameToFind + " not found in the hash map.");
        }
    }
}

/*
ArrayList:
1. **Add and Retrieve Elements**:
   Write a Java program that creates an `ArrayList` of strings. Add five different fruits to the list, then retrieve and print the third fruit in the list.
2. **Iterate and Remove Elements**:
   Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}. Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.
3. **Search for an Element**:
   Write a Java program that creates an `ArrayList` of characters. Add ten different characters to the list. Write a method that takes a character as an argument and returns the index of the character in the list. If the character is not found, return -1.
4. **Sort an ArrayList**:
   Create a Java program that initializes an `ArrayList` of integers with random values between 1 and 100. Add ten integers to the list. Sort the list in ascending order and print the sorted list.
5. **Convert ArrayList to Array and Vice Versa**:
   Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}. Convert the `ArrayList` to an array, print the array, then convert the array back to an `ArrayList` and print the `ArrayList`.

  */
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Third fruit in the list: " + fruits.get(2));

      ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 30) {
                iterator.remove();
            }
        }

        System.out.println("Modified list: " + numbers);

      ArrayList<Character> characters = new ArrayList<>();
        for (char ch = 'A'; ch <= 'J'; ch++) {
            characters.add(ch);
        }

        char searchChar = 'G';
        int index = findIndex(characters, searchChar);
        System.out.println("Index of " + searchChar + ": " + index);

      ArrayList<Integer> numbers2 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers2.add(rand.nextInt(100) + 1);
        }

        System.out.println("Original list: " + numbers2);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers2);

      ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        String[] fruitArray = fruits2.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(fruitArray));

        ArrayList<String> newFruitList = new ArrayList<>(Arrays.asList(fruitArray));
        System.out.println("ArrayList: " + newFruitList);
    
    
    }

  public static int findIndex(ArrayList<Character> list, char target) {
        return list.indexOf(target);

    
    }
}

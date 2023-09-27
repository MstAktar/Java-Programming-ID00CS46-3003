import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AddressBook addressBook = new AddressBook();
        addressBook.readAddress("address.txt");
        System.out.println(addressBook.toString());
    }
}

// Question-1: Create class AddressBook that has the following:
// - attribute name, type String, visibility private
// - attribute streetAddress, type String, visibility private
// - attribute postCode, type String, visibility private
// - attribute city, type String, visibility private
// - method "public void readAddress(String filename)"
// - Overridden method "public String toString()" that returns a String object "<name>,<streetAddress>,<postCode>,<city>" (Here <> encloses an attribute name)

// The method readAddress() reads the file given as parameter line by line and stores the information into the attributes, where the order is name, street address, postal code and city. There is only one address in each file. The file format is the following:

// T. Teacher
// Street 1
// 12345
// Oulu

// The test files to read have been uploaded into this exercise and are used internally. So, you don't need to include any files  or file content into your submission, just the class implementation is needed, as usual. 

// Hint: You can use the class Scanner to read the file. 
// Hint: to see how to override a method, see the slides/video on Section 2. (The annotation @Override may not be needed, but is shown for demonstration)

class AddressBook {
    private String name;
    private String streetAddress;
    private String postCode;
    private String city;

    public void readAddress(String filename) {
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            this.name = reader.nextLine();
            this.streetAddress = reader.nextLine();
            this.postCode = reader.nextLine();
            this.city = reader.nextLine();
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return this.name + "," + this.streetAddress + "," + this.postCode + "," + this.city;
    }
}

// Question-2: Create class Reader that has the following:
// - attribute ArrayList that contains elements of data type Integer, visibility private
// - attribute "Scanner reader" that is assigned null, visibility private
// - method "void readContents(String fileName)" that takes the filename as String parameter

// The method readContents() reads list of numbers from the file, then sorts the list by natural order (i.e. 1,2,2,8,77,...) and prints out the sorted numbers to the console, single number at each line. 

// Example file looks like this:

// 1
// 7
// 3

// The test files to read have been uploaded into this exercise and are used internally. So, you don't need to include any files  or file content into your submission, just the class implementation is needed, as usual. 

// Hint: You need to enclose the functionality within a try-catch-finally block
// Hint: For sorting Collections, there is a method sort() that takes a comparator as parameter. Here, use the Comparator.naturalOrder()

class Reader {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private Scanner reader = null;

    public void readContents(String fileName) {
    try {
        File file = new File(fileName);
        reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line = line.replaceAll("[^\\d]", ""); // remove non-numeric characters
            if (!line.isEmpty()) {
                list.add(Integer.valueOf(line));
            }
        }
        Collections.sort(list, Comparator.naturalOrder());
        for (Integer i : list) {
            System.out.println(i);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (reader != null) {
            reader.close();
        }
    }
}
}
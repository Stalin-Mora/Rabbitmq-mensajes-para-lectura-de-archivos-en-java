/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 *
 * @author Valeria
 */
public class leer {
    
static sha512 cambio=new sha512();
static archivo arch=new archivo();

	public static void findAllFilesInFolder(File folder) throws FileNotFoundException {
		for (File file : folder.listFiles()) {
			if (!file.isDirectory()) {
				System.out.println(file.getName());
                                
                                leer(file.getAbsolutePath());
                                String token=cambio.SHA512(file.getName());
                               arch.tokens.add(token);
			} else {
				findAllFilesInFolder(file);
			}
		}
	}

    public leer() {
    }
	
        
        public static void leer(String folder) throws FileNotFoundException{
            Map<String, Integer> words= new HashMap<String, Integer>();
            getWords(folder, words);
            int max = getMaxOccurance(words);
            for (Entry<String, Integer> word :
             words.entrySet()) {
 
            // Comparing values using geValue() method
            if (word.getValue() == max) {
 
                // Print and display word-count pair
                System.out.println(word);
            }
        }
           

    }
            static void getWords(String fileName,
                         Map<String, Integer> words)
        throws FileNotFoundException
    {
        // Creating a Scanner class object
        Scanner file = new Scanner(new File(fileName));
 
        // Condition check using hasNext() method which
        // holds true till there is word being read from the
        // file.
      // As the end of file content,condition violates
        while (file.hasNext()) {
 
            // Reading word using next() method
            String word = file.next();
 
            // Frequency count variable
            Integer count = words.get(word);
 
            // If the same word is repeating
            if (count != null) {
 
                // Incrementing corresponding count by unity
                // every time it repeats
              // while reading from the file
                count++;
            }
            else
 
                // If word never occurred after occurring
                // once, set count as unity
                count = 1;
            words.put(word, count);
        }
 
        // Close the file and free up the resources
        file.close();
    }
      static int getMaxOccurance(Map<String, Integer> words)
    {
        // Initially set maximum count as unity
        int max = 1;
 
        // Iterating over above Map using for-each loop
        for (Entry<String, Integer> word :
             words.entrySet()) {
 
            // Condition check
            // Update current max value  with the value
            // exceeding unity in Map while traversing
            if (word.getValue() > max) {
                max = word.getValue();
            }
        }
 
        // Return the maximum value from the Map
        return max;
    }      
        }



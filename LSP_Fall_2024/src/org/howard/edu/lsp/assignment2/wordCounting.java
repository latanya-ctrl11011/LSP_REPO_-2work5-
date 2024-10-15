// Tasks this program should complete:
    // Read the file
    // Process the text
    // Filter out the numbers
    // Count the occurrences
    // Display the result


    package org.howard.edu.lsp.assignment2;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.HashMap;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    
    public class wordCounting {
        public static void main(String[] args) throws Exception {
            // adding filepath
            String filepath = "src/org/howard/edu/lsp/assignment2/words.txt"; // the relative path to text file within the root of the project directory
    
            // creating a hashmap that will store the word counts
            HashMap<String, Integer> counts = new HashMap<>();
    
            // only accounts for words, not the punctuation in the text file
            Pattern wordPattern = Pattern.compile("\\b[a-zA-Z]+\\b");
    
    
            try {
                // reading the text file
            BufferedReader reading = new BufferedReader(new FileReader(filepath));
            String line;
    
            // reading the file line by line
            while ((line = reading.readLine()) != null) {
    
                Matcher matcher = wordPattern.matcher(line); // 
    
                // finding and counting each word
                while (matcher.find()) {
                    String word = matcher.group().toLowerCase();
                    counts.put(word, counts.getOrDefault(word, 0) + 1);
                }
    
                // split the string into words
                // String[] words = line.split("\\s+");
    
                // //processing each word
                // for (String word : words) {
                //     word = word.toLowerCase();
    
                //     if (!word.matches("\\d+")) { // excluding numbers
                //         // updating the word in the HashMap
                //         counts.put(word, counts.getOrDefault(word, 0)+ 1);
                //     }
                // }
    
            }
            reading.close();
            } catch (IOException e) {
                e.printStackTrace(); //handles the exception
            }
    
            for (HashMap.Entry<String, Integer> entry : counts.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            
    
        }
    }


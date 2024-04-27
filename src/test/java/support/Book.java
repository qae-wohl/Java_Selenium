package support;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    private String filePath;
    private String content;

    public Book(String filePath) {
        this.filePath = filePath;
        this.content = ""; // Initialize content as an empty string
        readBook();
    }

    public void readBook() {
        try {
            // Read all bytes from the file
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            // Convert bytes to string and store in content
            content = new String(fileBytes);
        } catch (IOException e) {
            System.err.println("Error reading Book: " + e.getMessage());
        }
    }

    public void searchFor(String text, String pat){
        Pattern pattern = Pattern.compile("\\bMom|\\bdiary\\b|straight\\b", Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("\\bMom|\\bdiary\\b|straight\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while(matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("Couldn't find!!");
        }

//        if(matcher.find()) {
//            System.out.println("We found the pattern you were looking for!");
//            System.out.println(matcher.group());
//        } else {
//            System.out.println("We did not find it!");
//        }

//        If text finds a pattern
//          Good message

    }

    public String getContent() {
        return content;
    }




}

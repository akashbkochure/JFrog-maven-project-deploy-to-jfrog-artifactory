package com.hishan.printers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomPrinter {
    private String author;

    public CustomPrinter(String author) {
        this.author = author;
    }

    public void print(String statement){

        System.out.println(author + " : " + getTime() +  " : " + statement);
    }

    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    private String getTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }
}

package Domain;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Media {
    private String name; //begge felter skal måske være final da de ikke ændre sig
    private List<String> genre;
    private String year;

    private ImageIcon image;


    //Media Creation from list and String in Database
    Media(String name, String year, List<String> genre, ImageIcon image) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.image = image;

    }

    public ImageIcon getImageMedia() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public List<String> getGenre() { //TODO make it list out the items as Strings and not as a list maybe
        return genre;
    }

    public abstract String getType();

    /*
    @Override
    public String toString() {
        return  "name= " + getName() + ", genre= " + getGenre() + ", image= " + getImageMedia() + ", Year= " + getYear();
    }

     */
}

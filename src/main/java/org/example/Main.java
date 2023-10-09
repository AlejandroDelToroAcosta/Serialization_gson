package org.example;
import com.google.gson.Gson;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Barco ship = new Barco(10, 9, "Libertdad");
        Gson gson = new Gson();
        String json = gson.toJson(ship);

        // Imprimir JSON
        System.out.println(json);


    }
}
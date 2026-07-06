package fr.diginamic.gson;

import com.google.gson.Gson;

public class TransformeEnJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
// Objet simple
        Personne p = new Personne("DURAND", 25);
        System.out.println(p); //méthode toString redéfinie dans Personne
// Conversion en JSON
        String json = gson.toJson(p);
        System.out.println(json);
    }
}

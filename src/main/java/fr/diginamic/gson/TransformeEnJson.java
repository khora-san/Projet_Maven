package fr.diginamic.gson;

import com.google.gson.Gson;

/**
 * Démontre la conversion d'un objet Java en JSON à l'aide de la librairie Gson.
 */
public class TransformeEnJson {

  /**
   * Point d'entrée du programme.
   *
   * @param args arguments de la ligne de commande (non utilisés)
   */
  public static void main(String[] args) {
    Gson gson = new Gson();

    // Objet simple
    Personne p = new Personne("DURAND", 25);
    System.out.println(p); // méthode toString redéfinie dans Personne

    // Conversion en JSON
    String json = gson.toJson(p);
    System.out.println(json);
  }
}
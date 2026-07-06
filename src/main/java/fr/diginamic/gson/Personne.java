package fr.diginamic.gson;

/**
 * Représente une personne avec un nom et un âge.
 */
public class Personne {

  String nom;
  int age;

  /**
   * Crée une nouvelle personne.
   *
   * @param nom le nom de la personne
   * @param age l'âge de la personne
   */
  public Personne(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Personne{"
        + "nom='" + nom + '\''
        + ", age=" + age
        + '}';
  }
}
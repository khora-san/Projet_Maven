package fr.diginamic.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Démontre l'utilisation d'un logger SLF4J.
 */
public class App {

  private static final Logger LOG = LoggerFactory.getLogger(App.class);

  /**
   * Point d'entrée du programme.
   *
   * @param args arguments de la ligne de commande (non utilisés)
   */
  public static void main(String[] args) {
    LOG.info("Bonjour depuis SLF4J !");
  }
}
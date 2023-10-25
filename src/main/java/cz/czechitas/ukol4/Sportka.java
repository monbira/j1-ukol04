package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;
/**
 * Třída pro losování Sportky.
 */
public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  public Sportka() {
    for (int i = 1; i <= 49; i++) {
      osudi.add(i);
    }
  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichat() {
    shuffle(osudi);
  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   *
   * @see List#subList(int, int)
   */
  public List<Integer> vylosovanaCisla() {

    return osudi.subList(0,6);
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dodatkoveCislo() {

    return osudi.get(6);
  }
}

package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  public Sportka() {
    for (int cisla = 1; cisla <= 49 ; cisla++) {
      osudi.add(cisla);
    }
  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichej() {
    Collections.shuffle(osudi);
  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   * @see List#subList(int, int)
   */
  public List<Integer> dejVylosovanaCisla() {
    List VylosovanaCisla = osudi.subList(0, 6);
    return VylosovanaCisla;
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dejDodatkoveCislo() {
    int DodatkoveCislo = osudi.get(6);
    return DodatkoveCislo;
  }
}
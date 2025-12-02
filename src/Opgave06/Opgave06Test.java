package Opgave06;

import Opgave06.Models.Spell;
import Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static void main(String[] args) {
        SpellsStorage storage = new SpellsStorage();
        ArrayList<Spell> spells = storage.getSpells();

        System.out.println(binarySearchSpell(spells,"Silencio"));
        System.out.println(binarySearchSpell(spells,"Riddikulus"));
        System.out.println(binarySearchSpell(spells,"Ascendio"));

    }

    public static Spell binarySearchSpell(ArrayList<Spell> list, String name) {
        Spell spell = null;
        int left = 0;
        int right = list.size() - 1;
        while (spell == null && left <= right) {
            int middle = (left + right) / 2;
            Spell s = list.get(middle);
            if (s.getName().compareTo(name) == 0)
                spell = s;
            else if (s.getName().compareTo(name) > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return spell;
    }
}

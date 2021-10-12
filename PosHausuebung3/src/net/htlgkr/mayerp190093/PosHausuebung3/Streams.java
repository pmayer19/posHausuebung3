package net.htlgkr.mayerp190093.PosHausuebung3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public double average(int[] numbers) {
        double avg = Arrays.stream(numbers)
                .average()
                .getAsDouble();
        return avg;

    }

    public List<String> upperCase(String[] strings) {
        List<String> myList = Arrays.asList(strings);

        myList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return myList;

    }

    public Weapons findWeaponWithLowestDamage(List<Weapons> weapons) {
        Weapons we = weapons.stream().min(Comparator.comparingInt(w -> w.getDamage())).orElse(null);
        return we;
    }

    public Weapons findWeaponWithHighestStrength(List<Weapons> weapons) {
        Weapons we = weapons.stream().max(Comparator.comparingInt(w -> w.getDamage())).orElse(null);
        return we;
    }

    public List<Weapons> collectMissileWeapons(List<Weapons> weapons) {
        return weapons.stream().filter(s -> s.getDamageType() == DamageType.MISSILE).collect(Collectors.toList());
    }

    public Weapons findWeaponWithLongestName(List<Weapons> weapons) {
        Weapons we = weapons.stream().max(Comparator.comparingInt(s -> s.getName().length())).orElse(null);
        return we;
    }

    public List<String> toNameList(List<Weapons> weapons) {
        return (List<String>) weapons.stream().map(Weapons::getName);
    }

    public int[] toSpeedArray(List<Weapons> weapons) {
        return weapons.stream().mapToInt(Weapons::getSpeed).toArray();
    }

    public int sumUpValues(List<Weapons> weapons) {
        return weapons.stream().mapToInt(Weapons::getValue).sum();
    }

    public long sumUpHashCodes(List<Weapons> weapons) {
        return weapons.stream().mapToInt(Weapons::hashCode).sum();
    }

    public List<Weapons> removeDuplicates(List<Weapons> weapons) {
        return (List<Weapons>) weapons.stream().map(Weapons::getName).distinct();
    }

    public void increaseValuesByTenPercent(List<Weapons> weapons) {
        weapons.stream().forEach(w -> w.setValue((int) (w.getValue() * 1.1)));
    }
}

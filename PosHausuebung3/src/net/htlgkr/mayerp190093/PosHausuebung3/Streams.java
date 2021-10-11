package net.htlgkr.mayerp190093.PosHausuebung3;

import java.util.ArrayList;
import java.util.Arrays;
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

//    public Weapons findWeaponWithLowestDamage(List<Weapons> weapons) {
//
//    }
//    public Weapons findWeaponWithHighestStrength(List<Weapons> weapons) {
//        List<Integer> myList = new LinkedList<>();
//        for (int i = 0; i < weapons.size(); i++) {
//            myList.add(weapons.get(i).getDamage());
//        }
//
//    }
    //    public List<Weapons> collectMissileWeapons(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public Weapons findWeaponWithLongestName(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public List<String> toNameList(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public int[] toSpeedArray(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public int sumUpValues(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public long sumUpHashCodes(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public List<Weapons> removeDuplicates(List<Weapons> weapons) {
    //        //implement this
    //    }
    //
    //    public void increaseValuesByTenPercent(List<Weapons> weapons) {
    //        //implement this
    //    }
}

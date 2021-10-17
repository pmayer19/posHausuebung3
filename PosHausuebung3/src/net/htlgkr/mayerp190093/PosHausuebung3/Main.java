/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author mayer
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        List<Weapons> list = new LinkedList<>();

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapons(
                s[0],
                CombatType.valueOf(s[1]),
                DamageType.valueOf(s[2]),
                Integer.parseInt(s[3]),
                Integer.parseInt(s[4]),
                Integer.parseInt(s[5]),
                Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());

        list.sort((w1, w2) -> Integer.compare(w1.getDamage(), w2.getDamage()));

        Printable p = (weapon) -> {
            for (int i = 0; i < weapon.size(); i++) {

                System.out.println(weapon.get(i).toString());
                System.out.println("-");
            }
        };
        p.print(list);

        Streams s = new Streams();

        //durchschnitts test:
        int[] ar = {1, 2, 4};
        System.out.println(s.average(ar));

        //toUppercase test:
        String[] arr = {"aa", "bb", "cc", "dd"};
        s.upperCase(arr);

//        //findWeaponWithLowestDamage test:
//        System.out.println(s.findWeaponWithLowestDamage(list));
//
//        //findWeaponWithHighestDamage test:
//        System.out.println(s.findWeaponWithHighestStrength(list));
//
//        //collectMissile weapons test:
//        List<Weapons> l1 = s.collectMissileWeapons(list);
//        for (Weapons weapons : l1) {
//            System.out.println(weapons);
//        }
//
//        //findWeaponWithLongestName test:
//        System.out.println(s.findWeaponWithLongestName(list));
//
//        //toNameList test:
//        List<String> l2 = s.toNameList(list);
//        for (String string : l2) {
//            System.out.println(string);
//        }
//        //toSpeedArray test:
//        int[] l3 = s.toSpeedArray(list);
//        for (int i = 0; i < l3.length; i++) {
//            System.out.println(l3[i]);
//        }
//        //sumUpHashCodes test:
//        System.out.println(s.sumUpHashCodes(list));
////        sumUpValues test:
//        System.out.println(s.sumUpValues(list));
        //removeDuplicates test:
//        List<Weapons> l4 = s.removeDuplicates(list);
//        for (Weapons weapons : l4) {
//            System.out.println(weapons);
//        } nicht funktionabel
        Predicate<Integer> isEven = (t) -> (t % 2) == 2;
        Predicate<Integer> isPositive = (t) -> (t > 0);
        Predicate<String> isShortWord = (t) -> (t.length() < 4);

        System.out.println(isEven.test(3));
        System.out.println(isPositive.test(3));
        System.out.println(isShortWord.test("halloo"));

        int result = IntStream.of(1, 2, 3, 4, 5, 6, 8, 9, 10)
                .filter(t -> t % 2 != 2)
                .map(t -> t * t)
                .reduce((a, b) -> a + b)
                .getAsInt();

    }
}

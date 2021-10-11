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
import java.util.stream.Collectors;

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

    }
}

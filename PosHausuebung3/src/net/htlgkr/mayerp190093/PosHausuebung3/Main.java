/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mayer
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("weapons.csv"));
        List<Weapons> weapons = new ArrayList<>();
        String line = fileScanner.nextLine();
        while (fileScanner.hasNextLine()) {
            line = fileScanner.nextLine();
            String[] parts = line.split(";");
            Weapons w = new Weapons(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]));
            weapons.add(w);
        }
        fileScanner.close();

        for (int i = 0; i < weapons.size(); i++) {
            System.out.println(weapons.get(i));
        }
    }
}

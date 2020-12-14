package com.todo_app;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command line application");
            System.out.println("=============================");
            System.out.println(" ");
            System.out.println("Command line arguments");
            System.out.println("    -l   List tasks");
            System.out.println("    -a   Add new task");
            System.out.println("    -r   Remove a task");
            System.out.println("    -c   Complete task");
        } else if (args[0].equals("-l")) {
            scan(Paths.get("../tennivalok.txt")); /*C:/Users/User/Documents/Greenfox/Todo/SzD-gen_todo_app/tennivalok.txt*/
        } else if (args[0].equals("-a")) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("../tennivalok.txt", true));
                writer.write("\n");
                for (int i = 1; i < args.length; i++) {
                    writer.write(args[i] + " ");
                }
                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Bad input");
            }
        }
    }

    static void scan(Path path) {
        try {
            Scanner fileScanner = new Scanner(path);
            int n = 1;
            if (!fileScanner.hasNextLine()) {
                System.out.println("Nincs mara tennivalod! :)");
            }
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(n + " " + data);
                n++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Bad input");
        }
    }
}

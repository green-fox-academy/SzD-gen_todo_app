package com.todo_app;

import java.io.File;
import java.io.FileNotFoundException;
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
        }
        else if (args[0].equals("-l")){
            scan(Paths.get("C:/Users/User/Documents/Greenfox/Todo/SzD-gen_todo_app/tennivalok.txt"));
        }
    }
    static void scan (Path path){
        try {
            Scanner fileScanner = new Scanner(path);
            int n = 1;
            if (!fileScanner.hasNextLine()){
                System.out.println("Nincs mara tennivalod! :)");
            }
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(n + " " + data);
                n++;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Bad input");
        }
    }
}

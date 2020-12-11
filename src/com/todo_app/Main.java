package com.todo_app;

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
    }
}

package com.company;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing Nothing...");
    }

    @Override
    public void undo() {
        System.out.println("Undoing Nothing...");
    }
}

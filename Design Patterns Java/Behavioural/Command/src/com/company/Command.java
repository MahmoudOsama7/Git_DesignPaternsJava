package com.company;

public interface Command {
    void execute(); //to do the needed job
    void undo(); //to do vice versa of the needed job
}

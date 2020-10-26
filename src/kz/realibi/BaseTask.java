package kz.realibi;

import java.util.Scanner;

public abstract class BaseTask {
    protected String text;

    void execute(){

    }

    public void setText(String text) {
        this.text = text;
    }
}

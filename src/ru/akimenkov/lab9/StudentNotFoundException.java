package ru.akimenkov.lab9;

import java.lang.*;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errMsg) {
        super(errMsg);
    }
}

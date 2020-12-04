package ru.akimenkov.lab9;

import java.lang.*;

public class EmptyStringException extends Exception{
    public EmptyStringException(String errMsg){
        super(errMsg);
    }
}
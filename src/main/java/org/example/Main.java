package org.example;
/*
Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
*/

public class Main {
    public static void main(String[] args) {

        char variable = 'g';
        try {
            numberChecker(variable);
            System.out.println("The character is a number: " + variable);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void numberChecker(char variable) {
        if (!Character.isDigit(variable)) {
            throw new IllegalArgumentException("The character is not a number: " + variable);
        }
    }
}






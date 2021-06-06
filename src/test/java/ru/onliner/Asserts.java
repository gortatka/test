package ru.onliner;

public class Asserts {
    public static Asserts asserts() {
        return new Asserts();
    }
    public void verifyFirstRefrigerator(boolean condition) {
Basic.basic().listOfRefragarators().stream().findFirst().stream().anyMatch(i->i.contains("ATLANT"));
    }
    public void verifyPrice(boolean condition) {
        Basic.basic().price().getText().equals("600,00 р.");
    }
}


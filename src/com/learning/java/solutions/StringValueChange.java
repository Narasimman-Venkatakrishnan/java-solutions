package com.learning.java.solutions;

public class StringValueChange {

    /*public static void main(String... doYourBest) {
        String name = "";
        changeToHomer(name);
        System.out.println("name : " + name);
    }

    static void changeToHomer(String name) {
        name = "Homer";
    }*/

    public static void main(String... mutableObjectExample) {
        StringBuilder name = new StringBuilder("Homer ");
        addSureName(name);
        System.out.println(name);
    }

    static void addSureName(StringBuilder name) {
        name.append("Simpson");
    }
}

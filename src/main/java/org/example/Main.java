package org.example;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList <String> usCities = new ArrayList<>();
        usCities.add("New York");
        usCities.add("Los Angeles");
        usCities.add("Chicago");
        usCities.add("Houston");
        usCities.add("Phoenix");
        usCities.add("Philadelphi a");
        usCities.add("San Antonio");
        usCities.add("San Diego");
        usCities.add("Dallas");
        usCities.add("San Jose");
        for (String cities:usCities) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(cities);
        }
    }
}
import java.util.Scanner;

public class AufgabeUebungTaschenrechner {
    public static void main(String[] args) {
        
        // Variablen definieren
        Scanner usr_input = new Scanner(System.in);
        
        double zahl_01;
        double zahl_02;
        char operator;
        double result;
        
        // User nach Werten fragen

        /*
        * Die einfachste Möglichkeit ist 3 mal eine Eingabe vom Benutzer zu fordern. 2 Zahlen und einen Operator.
        */
        // Eingabe des User mit importierter Scanner Methode in einer Variable speichern
        System.out.println("Gib die erste Zahl Deines Rechen-Terms ein:");
        zahl_01 = usr_input.nextDouble();

        System.out.println("Gib die zweite Zahl Deines Rechen-Terms ein:");
        zahl_02 = usr_input.nextDouble();

        System.out.println("Gib den Rechen-Operator ein:");
        operator = usr_input.next().charAt(0);

        /*
        * Eine andere Möglichkeit ist es mit java.scanner(), mit array slicing o.ä. die Eingabe eines kompletten Terms zu slicen.
        */

//        System.out.println("Hallo, bitte gib eine Rechenoperation mit 2 ganzzahligen Werten und einer der 4 Grundrechenarten nach dem Schema (4+3) ein: "); 

        // Mögliche Lösungsansätze
        /**
         * operator = char '+' in usr_input
         * if char in usr_input != [RegExp für Zahl]
         * indexOf() --> char '?'
         * 
         * Im Anschluss: String usr_input in getrennten Variablen speichern --> per if oder switch Methode aufrufen --> Berechnung --> Ausgabe
         */

        /**
         *  Variable slicen --> in getrennte Variablen --> Berechnung
         * Mögliche Ideen
         * a) direkt mit java.scanner()
         * b)  
        */ 
        
        // if or case Verzweigung, je nach Eingabe

        // if Variante
        if (operator == '*') {
            // Methode "multiplikation()" aufrufen
            multiplikation(zahl_01, zahl_02);
        } else if (operator == '/') {
            division(zahl_01, zahl_02);
            // Methode "addition()" aufrufen
        } else if (operator == '+') {
            addition(zahl_01, zahl_02);
            // Methode "substraktion()" aufrufen
        } else if (operator == '-') {
            // Methode "substraktion()" aufrufen
            subtraktion(zahl_01, zahl_02);
        }

/*
        // switch Variante
        // switch Verzweigung (switch(expression { case x: code block break; case y: code block break; default: code block}
        switch(operator) {
            // Methode "multiplikation()" aufrufen
            case "*":
            double result = multiplikation(zahl_01, zahl_02);
            break;
            // Methode "division()" aufrufen
            case "/":
            double result = division(zahl_01, zahl_02);
            break;
            // Methode "addition()" aufrufen
            case "+":
            double result = addition(zahl_01, zahl_02);
            break;
            // Methode "substraktion()" aufrufen
            case "-":
            double result = subtratktion(zahl_01, zahl_02);
            break;
            default:
            System.out.println("Bitte noch einmal versuchen.");
*/
        // Ausgabe 
        System.out.println("Das Ergebnis aus " + zahl_01 + operator + zahl_02 + " ist gleich: " + result);

/*
        // Methoden Aufrufe

        // Methode "multiplikation()" aufrufen
        double result = multiplikation(zahl_01, zahl_02);
        // Methode "division()" aufrufen
        double result = division(zahl_01, zahl_02);
        // Methode "addition()" aufrufen
        double result = addition(zahl_01, zahl_02);
        // Methode "substraktion()" aufrufen
        double result = subtratktion(zahl_01, zahl_02);

        // Ausgabe 
        System.out.println("Ergebnis: " + result);
*/

    }

    // Methoden erstellen:

    // Methode Multiplikation
    public static double multiplikation(double zahl_01, double zahl_02) {
        double result = zahl_01 * zahl_02;
        return result;
    }
    // Mehode Division
    public static double division(double zahl_01, double zahl_02) {
        double result = zahl_01 / zahl_02;
        return result;
    }
    // Methode Addition
    public static double addition(double zahl_01, double zahl_02) {
        double result = zahl_01 + zahl_02;
        return result;
    }
    // Methode Subtraktion
    public static double subtraktion(double zahl_01, double zahl_02) {
        double result = zahl_01 - zahl_02;
        return result;
    }
}
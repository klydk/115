
/*
* Write a method named repl that accepts a String and a number of repetitions... 
*/

public static String repl(String word, int rept) {
    String concatenation = "";
    
    for (int i = 0; i < rept; i++) {
        concatenation += word;
    }
    
    return concatenation;
}
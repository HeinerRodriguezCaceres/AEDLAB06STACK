package Ejercicio4;

public class Test {
	public static void main(String[] args) {
        String[] entradas = {
            "()()()[()]", 
            "(((()))[]", 
            "([[]][)", 
            "([{])}", 
            "[", 
            "[][][]{{{}}}"
        };

        for (String s : entradas) {
            System.out.println(s + " -> " + Application.symbolBalancing(s));
        }
    }

}

package br.com.bytebank.banco.teste;

public class TesteString { 

    public static void main(String[] args) { 
        
    	String nome = "Alura";

        String outra = nome.replace("A", "a");

        System.out.println(outra);
        
        
        String novo = nome.toUpperCase(); //também teste toUpperCase()

        System.out.println(novo);
        
        novo = nome.toLowerCase(); //também teste toUpperCase()

        System.out.println(novo);
        
        String mario = "Mario"; //object literal
        char c = mario.charAt(3); //char i
        System.out.println(c);

        int pos = mario.indexOf("rio");
        System.out.println(pos);

        String sub = mario.substring(1);
        System.out.println(sub);
        
        for(int i = 0; i < nome.length(); i++) {
            System.out.println(mario.charAt(i));
        } 
        
    }
}
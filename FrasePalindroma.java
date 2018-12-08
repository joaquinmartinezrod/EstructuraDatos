package Algoritmos.Examen1;

public class FrasePalindroma {
    boolean palindromo;
    public FrasePalindroma(){
        palindromo = false;
    }
    public void setPalindromo(boolean bool){
        palindromo = bool;
    }
    public void esPalindromo(String frase){
        frase=frase.replace(" ", "");
        frase=frase.replace(",", "");
        frase=frase.replace(".", "");

        int tam = frase.length()-1;
        int i = 0;

        setPalindromo(true);

        while(i < tam){
            if(frase.charAt(i)!=frase.charAt(tam))
                setPalindromo(false);
            i++;
            tam--;
        }
    }
    public boolean getPalindromo(){
        return palindromo;
    }
}

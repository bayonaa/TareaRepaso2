package es.iesmz.tests;

public class Vocales {
    public static int contarvocales(String cadena) {
        cadena = cadena.toLowerCase();
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                cont++;
            }
        }
        return cont;
    }
}

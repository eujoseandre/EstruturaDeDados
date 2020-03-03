package Aula01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

    public static void main(String[] args) throws IOException {

        char alfabeto[] = new char[]{' ', '$', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira uma frase: ");
        String frase = leitura.readLine();
        frase = frase.toUpperCase();
        
        System.out.println(frase);

        char palavra[] = frase.toCharArray();
        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (palavra[i] == alfabeto[j]) {
                    if (j < alfabeto.length - 1) {
                        palavra[i] = alfabeto[j + 1];
                    } else {
                        palavra[i] = alfabeto[2];
                    }
                    break;
                }
            }
        }

        String criptografado = "";
        for (int i = 0; i < palavra.length; i++) {
            criptografado += palavra[i];
        }
        System.out.println(criptografado);

        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (palavra[i] == alfabeto[j]) {
                    if (j > 0) {
                        palavra[i] = alfabeto[j - 1];
                    } else {
                        palavra[i] = alfabeto[alfabeto.length - 1];
                    }
                    break;
                }
            }
        }
        String descriptografado = "";
        for (int i = 0; i < palavra.length; i++) {
            descriptografado += palavra[i];
        }
        System.out.println(descriptografado);
    }
}

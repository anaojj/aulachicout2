package edu.br;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class atv2{
//         public static void main(String[] args) {
//                 try {
//                     FileReader fileReader = new FileReader("meuarquivo.txt");
//                     BufferedReader bufferedReader = new BufferedReader(fileReader);
                    
//                     bufferedReader.readLine();
                    
//                     String texto;
//                     while ((texto = bufferedReader.readLine()) != null) {
//                         System.out.println(texto);
//                     }
//                     bufferedReader.close();
//                 } catch (IOException e) {
//                     System.out.println("Erro ao escrever no arquivo: " + e.getMessage());

//                 }
//             }
//         }
    
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class atv2 {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String texto;
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
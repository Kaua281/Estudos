import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ContagemPalavras {
    public static void main(String[] args) {
        String path = "C:\\Users\\Aluno\\Downloads\\arquivo\\teste.txt";
        File arquivo = new File(path);
        try {
            //!Caso o arquivo não exista!/
            if (arquivo.exists() == false) {
                //*cria um arquivo (vazio)*/
                arquivo.createNewFile();
            }
            Scanner scanner = new Scanner(arquivo);
            int contadorPalavras = 0;
            while (scanner.hasNext()) {
                scanner.next();
                contadorPalavras++;

            }
            System.out.println("O arquivo contém " + contadorPalavras + " palavras.");
            scanner.close();
            
        } catch (IOException ex) {
            System.out.println("Arquivo não encontrado: " + path);
            ex.printStackTrace();

        }
    }

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) {
        //*Instancia um objeto do tipo File*/
        File arquivo = new File("C:\\Users\\Aluno\\Downloads\\arquivo\\teste.txt");
        try {
            //!Caso o arquivo não exista!/
            if (arquivo.exists() == false) {
                //*cria um arquivo (vazio)*/
                arquivo.createNewFile();
            }
            //!caso seja um diretório, é possível listar seus arquivos e diretórios
            //File[] arquivos = arquivo.listFiles();
            //!escreve no arquivo
            //*Intancia as classes FileWriter e BufferedWriter */
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Olá    mundo");
            bw.newLine();
            bw.close();
            fw.close();


            //!faz a leitura do arquivo
            //* Instancia as Classes FileReader e BufferedRead
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            //*br.ready() retorna True se o arquivo ainda tiver linhas para serem lidas
            while (br.ready()) {
                //lê a proxima linha
                String linha = br.readLine();
                //faz algo com a linha
                System.out.println(linha);
            }
            br.close();
            fr.close();
        } 
        catch (IOException ex) {
            //!Imprime a mensagem de erro e toda a pilha de chamadas até ali. Assim, é possível saber qual método dentro do arquivo causou o erro
            ex.printStackTrace();
            
        }
    }
}
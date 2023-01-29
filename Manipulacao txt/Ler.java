import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ler {

    public static void ler(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linha = br.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }

        } catch (
                IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}

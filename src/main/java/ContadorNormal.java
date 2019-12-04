import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContadorNormal {

    public void contar() throws IOException {
        File f = new File("santako.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String parenoel = "*<]:-DOo", ren = ">:o)", follet = "<]:-D";
        int parenoelC = 0, renC = 0, folletC = 0, lineC = 0;

        String line;

        System.out.println("\nMOSTRANDO CONTADOR NORMAL\n-----------------------------------------------------");

        while((line = br.readLine()) != null){
            if (line.contains(parenoel)) parenoelC++;
            if (line.contains(ren)) renC++;
            if (line.contains(follet)) folletC++;
            lineC++;
        }
        System.out.println("PareNoel: " + parenoelC);
        System.out.println("Ren: " + renC);
        System.out.println("Follet: " + folletC);

        System.out.println("LINEAS:  " + lineC);
    }
}
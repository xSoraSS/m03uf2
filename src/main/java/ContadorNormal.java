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
        int lineC = 0;
        String line;

        System.out.print("\nMOSTRANDO CONTADOR NORMAL\n-----------------------------------------------------");

        while((line = br.readLine()) != null){
            int parenoelC = 0, renC = 0, folletC = 0;
            if (line.contains(parenoel)) parenoelC++;
            if (line.contains(ren)) renC++;
            if (line.contains(follet)) folletC++; folletC= folletC-parenoelC;
            lineC++;

            System.out.println();
            if (parenoelC>0) System.out.print(" PareNoel: " + parenoelC);
            if (renC>0) System.out.print(" Ren: " + renC);
            if (folletC>0) System.out.print(" Follet: " + folletC);
        }

        System.out.println("\nLINEAS:  " + lineC);
    }
}
package IC.File;

import IC.specToys.Toy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static IC.File.Item.fileName;

public class FileCr {

    public static void writeToy(Toy winnerToy) {
        String result_string = 
        winnerToy.getName() + System.lineSeparator() +
        winnerToy.getQuan() + System.lineSeparator() +
        winnerToy.getWeight() + System.lineSeparator() +
        winnerToy.getId() + System.lineSeparator();

        try {
            File mytxt = new File(fileName);
            FileWriter fr = new FileWriter(mytxt);
            BufferedWriter br = new BufferedWriter(fr);

            br.write(result_string);
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}

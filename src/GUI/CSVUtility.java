package GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class CSVUtility {

    //create a method that will read the csv file
    //return a datastructure that supports a list of models for each
    //manufacturer
    public static TreeMap<String, TreeSet<String>> getMakeAndModel() {
        TreeMap<String, TreeSet<String>> makeAndModels = new TreeMap<>();
        File csvFile = new File("./src/GUI/carNames.csv");
        Scanner scanner = null;
        try {
            scanner = new Scanner(csvFile);

            while (scanner.hasNext()) {
                String[] record = scanner.nextLine().split(",");
                String make = record[0];
                String model = record[1];

                //Does this make (manufacturer) already exist in the map?
                if (!makeAndModels.keySet().contains(make)) {
                    makeAndModels.put(make, new TreeSet<String>());
                }
                makeAndModels.get(make).add(model);
            }
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return makeAndModels;
    }
}

package javaJdbc;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.code.gson;
public class javaJdbc {



	public static void main(String[] args) throws IOException {

//		        FileReader filereader = new FileReader("C:\\Users\\DELL\\Desktop\\student.csv");
//
//		        // create csvReader object and skip first Line
//		        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
//		        List<String[]> allData = csvReader.readAll();
//
//		        System.out.println(allData);
//
//		        // print Data
//		        for (String[] row : allData) {
//		            for (String cell : row) {
//		                System.out.print(cell + "\t");
//		            }
//		            System.out.println();
//		        }

		        FileWriter outputfile = new FileWriter("C:\\Users\\Personal\\Downloads\\writejson.json");

		        // create CSVWriter object filewriter object as parameter
		        JsonWriter writer = new JsonWriter();

		        // create a List which contains String array
		        List<String[]> data = new ArrayList<String[]>();
		        data.add(new String[] { "Name", "Class", "Marks" });
		        data.add(new String[] { "Aman", "10", "620" });
		        data.add(new String[] { "Suraj", "10", "630" });
		        ((JsonWriter) writer).writeAll(data);

		        // closing writer connection
		        writer.close();
		       

		    }
}



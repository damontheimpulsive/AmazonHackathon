import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import com.opencsv.CSVReader;

public class CSVClass {

	public static void main(String[] args) {

		CSVClass readCSVObject = new CSVClass();
		readCSVObject.readCSVFile();

	}

	private void readCSVFile() {

		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("E:\\prjctems\\Amazon_Chennai\\src\\Amazon.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] nextLine;

		HashMap<String, String> hm = new HashMap<String, String>();
		String ItemID = "";
		String currentvalue;
		String PrevItemID = "";
		String PrevValue = "";

		try {

			while ((nextLine = reader.readNext()) != null) {

				StringBuilder sBuilder = new StringBuilder();

				ItemID = nextLine[0];

				currentvalue = sBuilder.append(nextLine[1]).append(":").append(nextLine[2]).toString();

				if (ItemID.equalsIgnoreCase(PrevItemID)) {

					hm.put(ItemID, PrevValue + "," + currentvalue);
					PrevValue = PrevValue + "," + currentvalue;
				}

				else {

					hm.put(ItemID, currentvalue);
					PrevValue = currentvalue;
				}

				PrevItemID = ItemID;

			}

			Set<String> s = hm.keySet();
			for (String str : s) {

				System.out.println( str + "|" +  hm.get(str) );

				DataBasePersist(hm.get(str));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void DataBasePersist(String record) {
		
		
		
		

	}

}

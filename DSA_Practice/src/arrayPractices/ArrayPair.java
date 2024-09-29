package arrayPractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayPair {
	
	class Record {
	    String time;
	    String location;
	    String code;

	    Record(String time, String location, String code) {
	        this.time = time;
	        this.location = location;
	        this.code = code;
	    }

	    @Override
	    public String toString() {
	        return "Record{time='" + time + "', location='" + location + "', code='" + code + "'}";
	    }
	}

	public static void main(String[] args) {

//		int a[]= {1,2,3,4,5,6,7};
//	
//		
//		 for(int i=0; i<a.length; i++) {
//			 for(int j=0; j<a.length; j++) {
//				 System.out.println(a[i] +a[j]);
//			 }
//		 }
		
		

	
		        List<Record> records = new ArrayList<>();
		        records.add(new Record("3", "f", "9"));
		        records.add(new Record("2", "t", "9")); // duplicate based on code
		        records.add(new Record("8", "f", "8")); // unique

		        // Use LinkedHashSet to maintain insertion order while checking for duplicates
		        Set<String> seenCodes = new HashSet<>();
		        List<Record> uniqueRecords = new ArrayList<>();

		        for (Record record : records) {
		            if (!seenCodes.contains(record.code)) {
		                seenCodes.add(record.code);
		                uniqueRecords.add(record);
		            }
		        }

		        // Print the filtered list
		        System.out.println(uniqueRecords);
		    
		

    	
	}
	
	
}

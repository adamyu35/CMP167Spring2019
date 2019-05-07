package review;

public class review {
	 public static void main(String[] args) {
		 int[] studentIDs = {5534, 2238, 6598, 7922, 4973};
		 int[] numGrades = {4, 2, 3, 1, 2};
		 int[] grades = {87, 92, 33, 65, 79, 92, 88, 95, 75, 99, 68, 72};
		 
		 for (int i=0; i< studentIDs.length; i++) 
		 {
			 int nGrades=0;
			 
			 System.out.printf("Student ID = %d Count = %d Grades = ",studentIDs[i],numGrades[i]);
			 int index =0;
			 for(int j=0; j<numGrades[i] ; j++) {
				 System.out.print(" "+grades[index++]);
				 index++;
		 }
		     System.out.println();	 
	}
		

  }
}
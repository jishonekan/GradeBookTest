
package GradeBookTest;
import java.util.Scanner;

public class GradeBook {
	private String courseName;
	
	public GradeBook(String name) {
		courseName =name;
	}
	public void setName(String name) {
		courseName= name;
	}
    public String getName() {
    	
    	return courseName;
    }
    public void displayMsg
     () {
    	System.out.printf("welcome to grading on, \n%s\n\n", getName()); 	
    }
    public void classAverage() {
    	Scanner input = new Scanner(System.in);
    	int counter, total,grade, average;
    	total = 0;
    	counter = 1; 
    	while(counter<=10) {
    	System.out.print("Enter grade: ");
    	grade = input.nextInt();
    	total = total + grade;
    	counter = counter + 1;
    	}
    	average = total/10;
    	
    	System.out.printf("\nTotal of all 10 grades is %d\n" , total);
    	System.out.printf("Class average is %d\n" , average);
    }
    
    
}  

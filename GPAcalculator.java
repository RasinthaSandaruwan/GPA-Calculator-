import java.util.Scanner;

public class GPAcalculator{

	Scanner sc = new Scanner(System.in);

	String []sub;
	int []credit;
	String []grade;
	int s;
	double []gpa;
	double finalGPA,totolGPA;
	public void input(){

		//User can enter number of subjects
		System.out.print("Number of subjects: ");
		s=sc.nextInt();

		//store the all data in the array
		sub=new String[s];
		credit=new int[s];
		grade=new String[s];
		gpa=new double[s];

		System.out.println(" ");

		for (int i=0;i<s ;i++ ) {
			System.out.print("Subject 1: ");
			sub[i]=sc.next();

			System.out.print("Credit : ");
			credit[i]=sc.nextInt();
	
			System.out.print("Grade : ");
			grade[i]=sc.next();
			System.out.println("---------------------------");	
		}
				
	}

	public void calculation(){

		//Calculate GPA in the all subjects
		for (int i=0; i< s ;i++ ) {
			
				switch(grade[i]){
					case "A+":
					gpa[i]=credit[i]*4;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "A":
					gpa[i]=credit[i]*4;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "A-":
					gpa[i]=credit[i]*3.7;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "B+":
					gpa[i]=credit[i]*3.3;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "B":
					gpa[i]=credit[i]*3;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "B-":
					gpa[i]=credit[i]*2.7;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "C+":
					gpa[i]=credit[i]*2.3;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "C":
					gpa[i]=credit[i]*2;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "C-":
					gpa[i]=credit[i]*1.7;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "D+":
					gpa[i]=credit[i]*1.3;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "D":
					gpa[i]=credit[i]*1;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					case "E":
					gpa[i]=credit[i]*0;
					System.out.println("Sub "+(i+1)+" GPA :"+gpa[i]);
					break;

					default :
						System.out.print("Grade entered is invalide... pleace enter capital letter....");
				}
		}
		
		//Calculate total GPA
		for (int i=0;i<s ;i++ ) {
					totolGPA=totolGPA+gpa[i];
				}

				//Calculate final GPA
				finalGPA=totolGPA/s;	
				System.out.println("Total GPA :"+finalGPA);
	}

	public static void main(String[] args) {
		GPAcalculator ss = new GPAcalculator();
		ss.input();
		ss.calculation();
	}
}
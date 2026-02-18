// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
  	{

/***** DECLARATION SECTION *****/
	int JDNOne;

	int JDNTwo;

	int dayOne = 02;
	
	int monthOne = 02;

	int yearOne = 2020;

	String todayDate = "02/02/2020";
						

	 int dayTwo = 26;

	int monthTwo = 8;

	int yearTwo = 1918;


	String BDay = "08/26/1918";

	/***** INITIALIZATION SECTION *****/
																													
																															
																																	
	/***** CALCULATION & PROCESSING SECTION *****/	
	
	
	 int a2 = (14 - monthTwo) / 12;
																																						  	   
	int y2 = yearTwo + 4800 - a2;

	int m2 = monthTwo + 12 * a2 - 3;

																																									  	  
																																										  		
																																														
																																																
	JDNTwo = dayTwo 
		+ (153 * m2 + 2)/5
	 + 365 *  y2
	  + y2/4 
	  - y2/100 
	+ y2/400 
	- 32045;



	int a1 = (14 - monthOne) / 12;
																																																														 	   
   int y1 = yearOne + 4800 - a1;

 int m1 = monthOne + 12 * a1 - 3;
																																																											 		
																																																																					
		JDNOne = dayOne 
		+ (153 * m1 + 2)/5
	 + 365 *  y1
	  + y1/4 
	  - y1/100 
	+ y1/400 
	- 32045;


																																																																																							
	int difference = JDNOne - JDNTwo;


	/***** OUTPUT SECTION *****/
System.out.println("Julian Day Number for today's date," + todayDate + ", is" + JDNOne);
System.out.println("Julian Day Number for birthday," + BDay + ", is" + JDNTwo);
System.out.println("The difference in days is " + difference + ", which makes you approximately " + (difference/365) + " years old!");
  }																			
  }
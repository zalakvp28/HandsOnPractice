public class Population 
{
	public static void main(String[] args) 
	{ 
		 System.out.println("After 5 years population will be: " + population());
		 
		 // double populationperyear = currentPopulation * (1 + rate);
		
		 //double finalPopulation = Math.pow(populationperyear, timeInYears);
	} 
	
	public static int population()
	{
		 double currentPopulation = 1000000;
		 double rate = 0.1; // 10% (10/100)
		 int timeInYears = 5;
		 
		 double r = 1+rate; // this is the part of formula but i have separated here.
		 double findrate = Math.pow(r,timeInYears);   // formula ==> Final N = current N(1 + rate)^n(time)
		 
		 int finalPopulation = (int) (currentPopulation * findrate);
		 
		 //System.out.println("After 5 years population will be: " + finalPopulation);
		 
		 return finalPopulation;
	}
}
 

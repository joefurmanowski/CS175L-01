/**
   Simulates the growth and management of a roach population.
*/
public class RoachPopulation
{
	
   private double p;
   
   /**
	  Starts a roach population.
	  @param population the size of the initial roach population
   */
   public RoachPopulation(double population)
   {
	   p = population;
   }

   /**
	  Simulates a period in which the roaches breed, which doubles their population.
	  @return the new roach population after the breeding has taken place
   */
   public double breed()
   {
	   p = p * 2;
	   return p;
   }

   /**
	  Simulates spraying the roaches with insecticide, which reduces the population.
	  @param pct the percentage of the current roach population to spray
	  @return the new roach population after the spraying has taken place
   */
   public double spray(double pct)
   {
	   p = (p - (p * pct));
	   return p;
   }

   /**
	  Gets the current roach population.
	  @return the current number of roaches
   */
   public double getRoaches()
   {
	   return p;
   }
}

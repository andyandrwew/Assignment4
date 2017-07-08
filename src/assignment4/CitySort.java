package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitySort
{
	public static void main(String[] args)
	{
		List<String> cities = new ArrayList<>();
		
		cities.add("Atlanta");
		cities.add("New York");
		cities.add("Paris");
		cities.add("Venice");
		cities.add("Ibeza");
		cities.add("Berlin");
		
		Collections.sort(cities);
		
		System.out.println(cities);

	}
}

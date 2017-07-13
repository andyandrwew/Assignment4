package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class City
{
	String city;
	
	public City(String name)
	{
		city = name;
	}
	
	public String getCity()
	{
		return city;
	}
}

class CityCompartor implements Comparator<City>
{

	@Override
	public int compare(City o1, City o2)
	{
		// TODO Auto-generated method stub
		return o1.getCity().compareToIgnoreCase(o2.getCity());
	}
	
}

public class CitySort
{
	public static void main(String[] args)
	{
		List<City> cities = new ArrayList<>();
		
		cities.add(new City("Atlanta"));
		cities.add(new City("New York"));
		cities.add(new City("Paris"));
		cities.add(new City("Venice"));
		cities.add(new City("Ibeza"));
		cities.add(new City("Berlin"));
		
		Collections.sort(cities, new CityCompartor());
		for (Iterator<City> it = cities.iterator(); it.hasNext();)
		{
			System.out.println(it.next().getCity());

		}

	}
}

package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	String[] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
	float[] rainfall = {180, 200, 300, 500, 300, 200, 100, 300, 600, 300, 150, 300};


	public void settings()
	{
		size(500, 500);
		String[] m1 = months;
		//months[0] = "xxx";
		print(m1[0]);
		for(int i = 0; i < months.length; i++)
		{
			println("Month " + months[i] + "\t" + rainfall[i]);
		}

		for (String s : m1)
		{
			println(s);
		}

		//finding the month with the lowest rainfall:
		int minIndex = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] < rainfall[minIndex])
			{
				minIndex = i;
			}
		}

		println("The month with the lowest rainfall is " + months[minIndex] + " with " + rainfall[minIndex] + "mm");

		//finding the month with the highest rainfall:
		int maxIndex = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] > rainfall[maxIndex])
			{
				maxIndex = i;
			}
		}

		println("The month with the highest rainfall is " + months[maxIndex] + " with " + rainfall[maxIndex] + "mm");



	}

	public void setup() {
		colorMode(HSB);
		background(0);
		

		
	}

	
	public void draw()
	{	
	}

	public static void main(String[] args)
	{
		PApplet.main("ie.tudublin.Arrays");
	}

}

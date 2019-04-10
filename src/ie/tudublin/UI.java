package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	private ArrayList<Colour> Colour = new ArrayList<Colour>();

	//public Colour findColour(int value)
	//{

	//}

	public void loadColours() {
        Table table = loadTable("colours.csv", "colour");
        
        for (int i = 0; i < table.getRowCount(); i++) {
            Colour c = new Colour(table.getRow(i));
            Colour.add(c);
        }
	}
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void printColours() {
        int i = 1;
        for (Colour c : Colour) {
            System.out.println(i + ": " + c.toString());
            i++;
        }
    }
	
	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
        printColours();
	}
	
	public void draw()
	{
		rect(250, 400, 100, 200);
		//rect();
		//rect();
		//rect();
	}
}

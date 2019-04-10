package ie.tudublin;

import processing.data.TableRow;

public class Colours
{
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;
    

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String geColour()
    {
        return Colour;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int b) {
        this.value = value;
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value;
    }

    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
    }

    public Colour()
    {
        
    }

}
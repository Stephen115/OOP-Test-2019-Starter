package ie.tudublin;

import processing.data.TableRow;

public class Colours
{
    private String colour;
    private int r;
    private int g;
    private int b;
    private int value;
    

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

    public float getG() {
        return g;
    }

    public void setG(float g) {
        this.g = g;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float b) {
        this.value = value;
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
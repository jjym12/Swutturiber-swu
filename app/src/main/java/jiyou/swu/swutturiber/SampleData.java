package jiyou.swu.swutturiber;

public class SampleData {

    private String location;
    private String cafe;
    private String drink;
    private String addDrink;
    private String time;
    private String cal;
    private String price;

    public SampleData(String cafe, String drink, String location, String addDrink, String time, String cal, String price){
        this.cafe=cafe;
        this.drink=drink;
        this.location=location;
        this.addDrink = addDrink;
        this.time = time;
        this.cal = cal;
        this.price = price;
    }

    public String getCafe()
    {
        return this.cafe;
    }

    public String getDrink()
    {
        return this.drink;
    }

    public String getLocation()
    {
        return this.location;
    }

    public String getAddDrink()
    {
        return this.addDrink;
    }

    public String getTime()
    {
        return this.time;
    }

    public String getCal()
    {
        return this.cal;
    }

    public String getPrice()
    {
        return this.price;
    }
}

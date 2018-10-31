public class Article {
    private String name;
    private double price;
    private int count;

    public  Article(){
        name = "Default";
        price = 0.0;
        count = 0;
    }

    public Article(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public void set_name(String name){this.name = name;}
    public void set_price(double price){this.price = price;}
    public void set_count(int count){this.count = count;}

    public void show_me(){
        System.out.println("name: " + name + " - "  + "total price --> " + price*count);
    }
}

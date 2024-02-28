public class Book extends Product {


    private String auther;

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public double getDiscount() {
        return   getPrice()*0.20;
    }

    public String toString(){

        return "The original price =  "+getPrice()+"  You got a 20% discount = "+getDiscount()+"\t"+" The total price  after discount ="+(getPrice()-getDiscount());
    }

}
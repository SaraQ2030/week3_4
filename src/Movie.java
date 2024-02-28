public class Movie extends Product {

    private String dirctor;

    public Movie(String name, double price, String dirctor) {
        super(name, price);
        this.dirctor = dirctor;
    }

    public String getDirctor() {
        return dirctor;
    }

    public void setDirctor(String dirctor) {
        this.dirctor = dirctor;
    }

    @Override
    public double getDiscount() {
        return  getPrice()*0.15;
    }
    public String toString(){
        return "The original price =  "+getPrice()+" You got a 15% discount = "+getDiscount()+"\t"+" The total price  after discount ="+(getPrice()-getDiscount());
    }
}

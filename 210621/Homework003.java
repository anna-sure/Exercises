public class Homework003 {
    public static void main(String[] args) {

        Book book = new Book("jack of book",180);
        book.info();
        book.updatePrice();
        System.out.println("======================");
        book.info();

    }
}
class Book{
    String name;
    double price;
    public Book(String name,double price){
        //有形參name 必須寫this.name
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
        //方法體中，沒有price局部變量，this.price可以省略this
        if(price > 150){
            price = 150;
        } else if(price > 100 ){
            price = 100;
        }
    }
    public void info(){
        System.out.println("name = "+this.name+" price = "+this.price);
    }
}

public class ChangeBookPrice {
	public static void main(String[] args) {
		Book book = new Book("wild",300);
		book.info();
		book.updatePrice();
		book.info();
	}
}

class Book {
	String name;
	double price;
	
	public Book(String name, double price) { //给构造器可以直接赋值
		this.name = name;
		this.price = price;
	}
	
	public void updatePrice() {
		if(this.price > 150) { //此处this.可以省略
			this.price = 150;
		} else if(this.price > 100 ) {//不用写&& this.price <= 150条件，上面>150已有涵盖
			this.price =100;
		} 
	}
	
	public void info() {
		System.out.println("book "+this.name+" price is:"+this.price);
	}
	
}
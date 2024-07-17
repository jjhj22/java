package j0717_1;

import java.util.ArrayList;

public class Generic_Study2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("B1234","자바완전정복","김동형"));
		book.add(new Book("A534","스프링프레임워크","이상민"));
		book.add(new Book("F6021","포켓몬골드완전정복","유재학"));
		dvd.add(new DVD("M3G52","포켓몬초보자무따","전형준"));
		dvd.add(new DVD("Y76N3","지렁이게임초고수되기","황정아"));
		dvd.add(new DVD("C94J3","야너두웹툰몰래볼수있어","정한종"));
		
		//대여하기
		Library lib = new Library();
		lib.addRental(book.get(0), "이순신");
		lib.addRental(dvd.get(2), "김춘추");
		lib.showRentalList();
		
//		Rental <DVD>rent = new Rental<>(dvd.get(2),"이순신");
//		System.out.println(rent);
//		
//		Rental <Book>brent = new Rental<>(book.get(1),"김춘추");
//		System.out.println(brent);
	}

}

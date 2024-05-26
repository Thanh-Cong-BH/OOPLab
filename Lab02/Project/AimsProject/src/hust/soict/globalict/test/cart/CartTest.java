package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Alters", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.printCart();
        //anOrder.search(1);
        anOrder.search("Aladin");
        anOrder.search("Star Wars");
        anOrder.search("Shrek");
    }

}
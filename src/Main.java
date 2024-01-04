import models.Order;
import models.TShirt;

public class Main {
    public static void main(String[] args) {
        String[] Size1={"XL", "Medium", "Large"};
        String[] Size2={"Small", "Large"};
        String[] Size3={"Medium", "Large", "Extra Large"};
        String[] Size4={"Small", "Medium", "Large", "Extra Large"};

        // Creating T-shirt objects
        TShirt tshirt1 = new TShirt("Gorkhali Batman", 572, 1235, "Karuna", "You either die a hero or live long enough to see yourself be a villain",Size1 );
        TShirt tshirt2 = new TShirt("Nepal Flag", 681, 1780, "Himalaya", "I love Nepal", Size2);
        TShirt tshirt3 = new TShirt("Mountain View", 892, 1450, "Everest Wear", "Seek the peak", Size3);
        TShirt tshirt4 = new TShirt("Himalayan Sunset", 455, 1600, "Himalaya Treks", "Witness the beauty", Size4);

        //method for t shirt
        tshirt1.describeTShirt();
        tshirt2.describeTShirt();
        tshirt3.describeTShirt();
        tshirt4.describeTShirt();

        // Creating Order objects
        int[] orderedItems1 = {572, 681};
        TShirt[] orderedTShirts1 = {tshirt1, tshirt2};
        Order order1 = new Order("Gopal Sharma", "0486756465", orderedItems1, orderedTShirts1);

        int[] orderedItems2 = {455, 892};
        TShirt[] orderedTShirts2 = {tshirt4, tshirt3};
        Order order2 = new Order("Sunita Rai", "0456789234", orderedItems2, orderedTShirts2);

        int[] orderedItems3 = {572, 455};
        TShirt[] orderedTShirts3 = {tshirt1, tshirt4};
        Order order3 = new Order("Raju Rai", "0486756465", orderedItems3, orderedTShirts3);

        // Print bills for different orders
        System.out.println("Bill for Order 1:");
        order1.printBill();

        System.out.println("\nBill for Order 2:");
        order2.printBill();

        System.out.println("\n Bill for Order 3");
        order3.printBill();
    }
}

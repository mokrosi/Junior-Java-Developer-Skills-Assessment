public class ShoppingCart {

    // Calculate total price with discounts
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;
        // First, calculate sum of all prices using a loop
        for (double x : prices) {
            total += x ;
        }

        // Then apply discount based on customer type using switch:
        // "REGULAR": no discount
        // "PREMIUM": 10% discount
        // "VIP": 20% discount
        double discount = 0 ;
        switch (customerType) {
            case "PREMIUM":
                for (double d : prices) {
                    discount = (d * 0.1);
                }
                total -= discount ;
                break;
            case "VIP":
                for (double d : prices) {
                    discount = (d * 0.2);
                }
                total -= discount;
                break;
        }


        return total;
    }

    // Find most expensive item
    public static double findMostExpensive(double[] prices) {
        // Handle empty array
        if (prices == null) {
            return 0 ;
        }
        // Use loop to find highest price
        double highestPrice = 0 ;
        for (double d : prices) {
            if ( d > highestPrice) {
                highestPrice = d ;
            }
        }

        return highestPrice ;
        

    }

    // Count items above a certain price
    public static int countExpensiveItems(double[] prices, double threshold) {
        if (prices == null) {
            return 0;
        }
       
        // Count how many items cost more than threshold
        int count = 0 ;
        for (double d : prices) {
            if (d > threshold) {
                count++;
            }
        }

        return count ;

    }

    public static void main(String[] args) {
        double[] cart = { 25.99, 45.50, 12.99, 89.99, 15.75 };
        // Test with different customer types

        System.out.println("Regular customer total: $ " + calculateTotal(cart,
                "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart,
                "VIP"));

        // Find most expensive item
        System.out.println("most expensive item : " + findMostExpensive(cart));

        // Count items over $30
        System.out.println("Count items over $30 : " + countExpensiveItems(cart, 39));


    }
}

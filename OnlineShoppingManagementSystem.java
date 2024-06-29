import java.util.Scanner;

public class OnlineShoppingManagementSystem {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct(new Product("Laptop", 1000, 10, new String[]{"16GB RAM", "512GB SSD"}));
        productList.addProduct(new Product("Phone", 500, 20, new String[]{"128GB Storage", "12MP Camera"}));
        productList.addProduct(new Product("Headphones", 100, 30, new String[]{"Noise Cancelling", "Wireless"}));

        productList.displayProducts();

        Scanner scanner = new Scanner(System.in);
        String input;
        String[] tokens;
        String productName;
        int quantity;
        Product product;

        while (true) {
            System.out.print("Enter product name and quantity (or 'exit' to quit): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            tokens = input.split(" ");
            if (tokens.length != 2) {
                System.out.println("Invalid input. Please enter the product name followed by the quantity.");
                continue;
            }
            productName = tokens[0];
            try {
                quantity = Integer.parseInt(tokens[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity. Please enter a numeric value.");
                continue;
            }

            product = productList.findProduct(productName);
            if (product != null) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Purchased " + quantity + " of " + product.getName());
                } else {
                    System.out.println("Not enough quantity in stock.");
                }
            } else {
                System.out.println("Product not found.");
            }
        }

        productList.displayProducts();
        System.out.println("\nTotal Quantity: " + productList.getTotalQuantity());
        System.out.println("Total Price: " + productList.getTotalPrice());
    }
}

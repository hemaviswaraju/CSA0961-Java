import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineShoppingSystem {
    private JFrame frame;
    private JTextArea displayArea;
    private JTextField inputField;
    private ShoppingCart cart;
    private Product[] products;

    public OnlineShoppingSystem() {
        frame = new JFrame("Online Shopping System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayArea = new JTextArea(20, 40);
        displayArea.setEditable(false);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        inputField = new JTextField(40);
        frame.add(inputField, BorderLayout.NORTH);

        JButton addButton = new JButton("Add to Cart");
        addButton.addActionListener(new AddButtonListener());
        frame.add(addButton, BorderLayout.WEST);

        JButton viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new ViewCartButtonListener());
        frame.add(viewCartButton, BorderLayout.EAST);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(new CheckoutButtonListener());
        frame.add(checkoutButton, BorderLayout.SOUTH);

        JTextField paymentMethodField = new JTextField(10);
        frame.add(paymentMethodField, BorderLayout.SOUTH);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());
        frame.add(exitButton, BorderLayout.SOUTH);

        cart = new ShoppingCart();
        products = new Product[] {
            new Product("Product 1", 10.99),
            new Product("Product 2", 9.99),
            new Product("Product 3", 12.99),
            new Product("Product 4", 8.99),
            new Product("Product 5", 11.99)
        };

        displayArea.setText("Welcome to Online Shopping System!\n");
        displayArea.append("1. Display Products\n");
        displayArea.append("2. Add to Cart\n");
        displayArea.append("3. View Cart\n");
        displayArea.append("4. Checkout\n");
        displayArea.append("5. Exit\n");
        displayArea.append("Enter your choice: ");

        frame.pack();
        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText();
            int index = Integer.parseInt(input);
            if (index >= 1 && index <= products.length) {
                cart.addItem(products[index - 1]);
                displayArea.setText("Product added to cart!\n");
                displayArea.append("Welcome to Online Shopping System!\n");
                displayArea.append("1. Display Products\n");
                displayArea.append("2. Add to Cart\n");
                displayArea.append("3. View Cart\n");
                displayArea.append("4. Checkout\n");
                displayArea.append("5. Exit\n");
                displayArea.append("Enter your choice: ");
            } else {
                displayArea.setText("Invalid product index. Please try again.\n");
                displayArea.append("Welcome to Online Shopping System!\n");
                displayArea.append("1. Display Products\n");
                displayArea.append("2. Add to Cart\n");
                displayArea.append("3. View Cart\n");
                displayArea.append("4. Checkout\n");
                displayArea.append("5. Exit\n");
                displayArea.append("Enter your choice: ");
            }
        }
    }

    private class ViewCartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            displayArea.setText("Your cart contents:\n");
            for (Product product : cart.getItems()) {
                displayArea.append(product.getName() + " - $" + product.getPrice() + "\n");
            }
            displayArea.append("Total: $" + cart.calculateTotal() + "\n");
            displayArea.append("Welcome to Online Shopping System!\n");
            displayArea.append("1. Display Products\n");
            displayArea.append("2. Add to Cart\n");
            displayArea.append("3. View Cart\n");
            displayArea.append("4. Checkout\n");
            displayArea.append("5. Exit\n");
            displayArea.append("Enter your choice: ");
        }
    }

    private class CheckoutButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String paymentMethod = inputField.getText();
            if (paymentMethod.equalsIgnoreCase("cash") || paymentMethod.equalsIgnoreCase("credit")) {
                displayArea.setText("Checkout successful! Your total is: $" + cart.calculateTotal() + "\n");
                displayArea.append("Thank you for shopping with us!\n");
                displayArea.append("Goodbye!\n");
            } else {
                displayArea.setText("Invalid payment method. Please try again.\n");
                displayArea.append("Welcome to Online Shopping System!\n");
                displayArea.append("1. Display Products\n");
                displayArea.append("2. Add to Cart\n");
                displayArea.append("3. View Cart\n");
                displayArea.append("4. Checkout\n");
                displayArea.append("5. Exit\n");
                displayArea.append("Enter your choice: ");
            }
            frame.dispose();
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new OnlineShoppingSystem();
    }
}
package app;

import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Enter client data");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter lastname: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter birthdate (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthdateString);

        Client client = new Client(name,  lastName, birthDate);

        System.out.println(client);

        System.out.println("Enter order");
        System.out.println("Enter Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.nextLine());

        Order order = new Order(LocalDateTime.now(), orderStatus, client, new ArrayList<>());

        System.out.println("Enter total items ");
        int quantityItems = scanner.nextInt();

        System.out.println("Enter products");
        for (int i = 1; i <= quantityItems; i++) {
            System.out.println("Enter data to " + i +" item: ");
            System.out.println("Enter name: ");
            String productName = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter price: ");
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.println("Enter quantity: ");
            int orderQuantity = scanner.nextInt();
            OrderItem orderItem = new OrderItem(orderQuantity, productPrice,product);
            order.addItem(orderItem);
        }

        System.out.println(order);

        scanner.close();
    }
}

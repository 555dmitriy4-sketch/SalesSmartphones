package app;

public class Main {

        public static void main(String[] args) {

            String product1 = "smartphone";
            double price1 = 486.14;
            int quantity1 = 25;
            int days1 = 5;

            String product2 = "laptop";
            double price2 = 749.06;
            int quantity2 = 14;
            int days2 = 7;

            double totalSales1 = price1 * quantity1;
            double averageSales1 = totalSales1 / days1;

            double totalSales2 = price2 * quantity2;
            double averageSales2 = totalSales2 / days2;

            System.out.printf("Product No 1: %s,%n", product1);
            System.out.printf("total sales for %d days is EUR %.2f,%n", days1, totalSales1);
            System.out.printf("sales by day is EUR %.2f.%n%n", averageSales1);

            System.out.printf("Product No 2: %s,%n", product2);
            System.out.printf("total sales for %d days is EUR %.2f,%n", days2, totalSales2);
            System.out.printf("sales by day is EUR %.2f.%n", averageSales2);
        }
    }


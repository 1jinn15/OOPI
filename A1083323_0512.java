import java.util.Random;
import java.util.Scanner;

public class A1083323_0512{
    private static final int PORK_STOCK = 5000;
    private static final int BEEF_STOCK = 3000;
    private static final int VEGETABLE_STOCK = 1000;
    private static final int MIN_DUMPLINGS_PER_ORDER = 10;
    private static final int MAX_DUMPLINGS_PER_ORDER = 50;

    static int customerNum;
    private static int porkStock = PORK_STOCK;
    private static int beefStock = BEEF_STOCK;
    private static int vegetableStock = VEGETABLE_STOCK;

    public static void main(String[] args) throws Exception{
        System.out.println("How many customer at a time:?");
        Scanner sc = new Scanner(System.in);
        Integer numCustomers = sc.nextInt();
        Thread[] customerThreads = new Thread[numCustomers];
        
        for (int i = 0; i < numCustomers; i++) {
            customerThreads[i] = new Thread(new Customer());
            customerThreads[i].start();
        }

        for (int i = 0; i < numCustomers; i++) {
            try {
                customerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All customers have been served. Closing the dumpling shop.");
    }

    private static synchronized void serveDumplings(String dumplingType, int numDumplings) {
        if (dumplingType.equals("豬肉水餃")) {
            if (porkStock >= numDumplings) {
                System.out.println("Serving " + numDumplings + " " + dumplingType);
                porkStock -= numDumplings;
            } else {
                System.out.println("Insufficient " + dumplingType + " stock. Cannot serve the order.");
            }
        } else if (dumplingType.equals("牛肉水餃")) {
            if (beefStock >= numDumplings) {
                System.out.println("Serving " + numDumplings + " " + dumplingType);
                beefStock -= numDumplings;
            } else {
                System.out.println("Insufficient " + dumplingType + " stock. Cannot serve the order.");
            }
        } else if (dumplingType.equals("蔬菜水餃")) {
            if (vegetableStock >= numDumplings) {
                System.out.println("Serving " + numDumplings + " " + dumplingType);
                vegetableStock -= numDumplings;
            } else {
                System.out.println("Insufficient " + dumplingType + " stock. Cannot serve the order.");
            }
        }
    }

    static class Customer implements Runnable {
        private static final String[] DUMPLING_TYPES = {"豬肉水餃", "牛肉水餃", "蔬菜水餃"};

        @Override
        public void run() {
            Random rand = new Random();
            int numDumplings = rand.nextInt(MAX_DUMPLINGS_PER_ORDER - MIN_DUMPLINGS_PER_ORDER + 1)
                    + MIN_DUMPLINGS_PER_ORDER;
            String dumplingType = DUMPLING_TYPES[rand.nextInt(DUMPLING_TYPES.length)];

            try {
                Thread.sleep(3000);
                serveDumplings(dumplingType, numDumplings);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

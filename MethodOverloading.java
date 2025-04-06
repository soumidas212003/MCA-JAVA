class MathOperations {
    
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of 10 and 20: " + math.add(10, 20));
        System.out.println("Sum of 5, 10 and 15: " + math.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 4.5: " + math.add(5.5, 4.5));
    }
}

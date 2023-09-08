public class Main {
    public static void main(String[] args) {
        int a = -5;
        int b = 3;
        int product = umn(a, b);
        System.out.println(product);
        int result = multiply(4, 5);
        System.out.println(result);
    }

    public static int umn(int a, int b) {
        int product = 0;
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                product += a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                product -= a;
            }
        }
        return product;
    }
    public static int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        } else if (y > 0) {
            return (x + multiply(x, y - 1));
        } else {
            return -multiply(x, -y);
        }
    }
}

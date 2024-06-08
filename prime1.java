import java.util.*;

class prime {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        num = sc.nextInt();
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count <= 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}

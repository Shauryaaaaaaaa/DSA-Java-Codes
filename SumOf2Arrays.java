import java.util.*;

public class SumOf2Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input for array 1
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        // Input for array 2
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        // Create sum array of larger size
        int[] sum = new int[Math.max(n1, n2)];

        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        // Add digit by digit
        while (k >= 0) {
            int d = carry;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            carry = d / 10; // store carry
            d = d % 10;     // current digit

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        // First print carry if left
        if (carry > 0) {
            System.out.println(carry);
        }

        // Print sum array
        for (int val : sum) {
            System.out.println(val);
        }
    }
}



/*Step-by-step process:

start from rightmost digit (like we do in math).
That’s why we start from i = a1.length-1 and j = a2.length-1.
Add digits + carry
d = carry + (digit from a1 if exists) + (digit from a2 if exists)
Extract new carry and digit
carry = d / 10
digit = d % 10
Store digit in sum[k]
Move left (i--, j--, k--)
After loop
If still carry left → print it first.
Then print the sum array.*/
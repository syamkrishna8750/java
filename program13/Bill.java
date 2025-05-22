package syamkrishna;

import java.util.*;


interface BillGen {

    int calculate();
}

class ProductB implements BillGen {

    String name;
    int prod_id, quantity, unit_price, total;

    ProductB(String n, int p, int q, int u) {
        name = n;
        prod_id = p;
        quantity = q;
        unit_price = u;
    }

    public int calculate() {
        total = quantity * unit_price;
        return total;
    }
}

public class Bill {

    public static void main(String[] args) {
        ProductB[][] order;
        int n, i, j, m,b,c,d,sum;
        String a;
        System.out.println("Enter no.of order : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        order = new ProductB[n][];
        for (i = 0; i < n; i++) {
            System.out.println("Enter no.of Product : ");
            m = s.nextInt();
            order[i] = new ProductB[m];
            for (j = 0; j < m; j++) {
                System.out.println("Enter Product "+"Name: ");
                a=s.next();
                System.out.println("Enter product ID : ");
                b=s.nextInt();
                System.out.println("Enter product quantity : ");
                c=s.nextInt();
                System.out.println("Enter product unit_price : ");
                d=s.nextInt();
                ProductB pb=new ProductB(a, b, c, d);
                order[i][j]=pb;
                order[i][j].total=order[i][j].calculate();
            }
        }
        for (i = 0; i < n; i++){
            sum=0;
            System.out.println("Order no : " + (i+1));
            Date date =Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println();
            for(j=0;j<order[i].length;j++){
                System.out.println(order[i][j].prod_id + " " + order[i][j].name + " " +
                order[i][j].quantity + " " + order[i][j].total);
         }
            for(j=0;j<order[i].length;j++){
                sum=sum+order[i][j].total;
                System.out.println(sum);
            }
        }
    }
}
package oop1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Casper");
        product1.setDiscount(7);
        Product product2 = new Product();
        product2.setName("Lenovo");
        product2.setDiscount(7);
        Product product3 = new Product();
        product3.setName("Monster");
        product3.setDiscount(7);
        Product[] products = {product1,product2,product3};

        for(Product product: products){
            System.out.println(product.getName());
        }

    }
}
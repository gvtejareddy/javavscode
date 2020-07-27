package shipment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import polymorph.Product;

public class shipment implements Iterable<Product> {

    private final List<Product> products = new ArrayList<Product>();
    private List<Product> lightVanProduct= new ArrayList<Product>();
    private List<Product> heavyWeightProduct= new ArrayList<Product>();

    public void addProducts(Product product) {

        products.add(product);
    }

    public void replaceProducts(Product product) {

        final int index = products.indexOf(new Product("Door",34));
        products.set(index,product);
    }

    public void prepare() {
        products.sort(new SortbyWeight());
        for (Product product : products) {
            if (product.getWeight() > 20) {
                lightVanProduct.add(product);
            } else {
                heavyWeightProduct.add(product);
            }
        }
    }

    class SortbyWeight implements Comparator<Product> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Product a, Product b) {
            return a.getWeight() - b.getWeight();
        }
    }

    public static void main(String[] args) {
        shipment shipMent = new shipment();
        System.out.println(shipMent.products);
        shipMent.prepare();
        System.out.println(shipMent.products);
    }

    public shipment() {
        products.add(new Product("Door", 34));
        products.add(new Product("Window", 4));
        products.add(new Product("FloorPlanel", 24));
    }

    @Override
    public Iterator<Product> iterator() {
        // TODO Auto-generated method stub
        return products.iterator();
    }
}
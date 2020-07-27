package shipment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import polymorph.Product;

public class ProductCatalogue implements Iterable<Product> {

    private Set<Product> productCatalogue = new HashSet<Product>();

    private Set<String> dummElements =new HashSet<String>();

    private Set<String> dummYTreeElements =new TreeSet<String>();

    @Override
    public Iterator<Product> iterator() {
        // TODO Auto-generated method stub
        return productCatalogue.iterator();
    }

    public static void main(String[] args) {
        ProductCatalogue pc = new ProductCatalogue();
        pc.productCatalogue.add(new Product("door", 12));
        pc.productCatalogue.add(new Product("door", 12));

        pc.dummElements.add("india");
        pc.dummElements.add("srilana");
        pc.dummElements.add("usa");
        pc.dummElements.add("india");

        pc.dummYTreeElements.add("usaTree");
        pc.dummYTreeElements.add("indiaTree");
        pc.dummYTreeElements.add("srilankaTree");

        // for (Product product : pc.productCatalogue) {
        //     System.out.println(product.hashCode());
        // }

        Iterator<String> i = pc.dummElements.iterator(); 
        System.out.println(pc.dummElements);
        System.out.println(pc.productCatalogue);
        // while (i.hasNext()) 
        //     System.out.println(i.next().hashCode()); 

        System.out.println(pc.dummYTreeElements);

    }

}
package polymorph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Primate {

    String s1 = "null:value1|key2:value2|key3:value3|null:null";
    String s3 = "Good:Morning";
    HashMap<String, String> h1 = new HashMap<String, String>();



    public boolean hasHair() {
        return true;
    }

    public void getHashMap() {
        String[] s2 = s1.split("\\|");
        // System.out.println(Arrays.toString(s2));
        for (String a : s2) {
            System.out.println(a.split(":")[0] + ":" + a.split(":")[1]);
            h1.put(a.split(":")[0], a.split(":")[1]);
        }
        for (HashMap.Entry<String, String> entry : h1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
       
        Product door = new Product("door",24);
        Product window = new Product("window",34);
        Product floorPanel = new Product("floorPanel",2);
        Product stairs = new Product("stairs",34);
        Collection<Product> products= new ArrayList<Product>();
        products.add(door);
        products.add(window);
        products.add(floorPanel);
        products.add(stairs);
        final Iterator<Product> productIterator = products.iterator();

        while(productIterator.hasNext()){
            Product product = productIterator.next();
            if(product.getWeight() >20){
                System.out.println(product);
            }
            else{
                productIterator.remove();
            }   
        }
        System.out.println(products);

    }

}
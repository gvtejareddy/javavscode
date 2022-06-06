package LastOneMonthPreparation.One;

public class PrimitiveTypes{
    {System.out.println("newname");}

    public static void main(String[] args) {

        Integer i = new Integer(10);
 
        // Unboxing the Object
        int i1 = i;

        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println(ch);
 
        // Print statements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);

        {System.out.println("myname");}
        {System.out.println("newname");}
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
    }

}

// myname
// newname
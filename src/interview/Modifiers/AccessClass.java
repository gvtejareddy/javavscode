package interview.Modifiers;

public class AccessClass {

    public static void main(String[] args) {
        PrivateAccessMod pam = new PrivateAccessMod();
       // System.out.println(pam.myName); cannot access 

        //pam.canAccess();  cannot access 

        System.out.println(pam.accessableName); //Reddy

        DefaulClassAccess dca = new DefaulClassAccess();
        dca.canAcesssDefault(); //Default access


        ProtectedAccessModifiers pram = new ProtectedAccessModifiers();

        pram.canAcesssDefault();
    }

}

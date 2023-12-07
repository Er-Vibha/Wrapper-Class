public class WrapperTest {
    public static void main(String[] args) {
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0f;
        double d=60.0d;
        char c='V';
        boolean bool=true;
//Autoboxing = Converting Primitives to objects
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Character charobj=c;
        Boolean boolobj=bool;
        Double doubleobj=d;
        System.out.println("Printing Object values");
        System.out.println();
        System.out.println("Byte Object:"+b);
        System.out.println("Short Object:"+s);
        System.out.println("Int Object:"+i);
        System.out.println("Long Object:"+l);
        System.out.println("Float Object:"+f);
        System.out.println("Double Object:"+d);
        System.out.println("char Object:"+c);
        System.out.println("Bool Object:"+bool);
        System.out.println();
//Unboxing = Converting Objects to Primitives
        byte bval=byteobj;
        short sval=shortobj;
        int ival=intobj;
        long lval=longobj;
        float fval=floatobj;
        double dval=doubleobj;
        char cval=charobj;
        boolean boval=boolobj;
        System.out.println("Printing Primitive values");
        System.out.println();
        System.out.println("Byte Object:"+bval);
        System.out.println("Short Object:"+sval);
        System.out.println("Int Object:"+ival);
        System.out.println("Long Object:"+lval);
        System.out.println("Float Object:"+fval);
        System.out.println("Double Object:"+dval);
        System.out.println("char Object:"+cval);
        System.out.println("Bool Object:"+boval);
    }
}
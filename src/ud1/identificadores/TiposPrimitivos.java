package ud1.identificadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
    byte varByte = 127;
    short varShort = 32000;
    int varInt = 2000000000;
    long varLong = 400000000; 
    float varFloat = 2.5f;
    double varDouble = 35E23;
    char varChar = 'F';
    boolean varBoolean = true;
    String varString = "DAM";
    
        
        System.out.println("Tipo    NumBits   Valor");
        System.out.println("—----------------------");
        System.out.println("byte       8       " + varByte);
        System.out.println("short      16      " + varShort);
        System.out.println("int        32      " + varInt);
        System.out.println("long       64      " + varLong);
        System.out.println("float      32      " + varFloat);
        System.out.println("double     64      " + varDouble);
        System.out.println("char       16      " + varChar);
        System.out.println("boolean    1       " + varBoolean);
        System.out.println("String     ?       " + varString);
        //...
    }
}

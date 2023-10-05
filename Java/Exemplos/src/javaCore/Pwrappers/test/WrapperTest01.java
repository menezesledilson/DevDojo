package javaCore.Pwrappers.test;

public class WrapperTest01 {
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10F;
    double aDoubleP = 10D;
    char charP = 'W';
    boolean aBooleanP = false;

    //Tipos que não são mais primitivos
    Byte byteW = 127;
    Short shortW = 1;
    Integer intW = 1; //autoboxing
    Long longW = 10L;
    Float floatW = 10F;
    Double aDoubleW = 10D;
    Character charW = 'W';
    Boolean aBooleanW = false;

    int i = intW; //unboxing
    Integer intW2 = Integer.parseInt("1");

    public static void main(String[] args) {
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(Character.isDigit('A'));

    }




}

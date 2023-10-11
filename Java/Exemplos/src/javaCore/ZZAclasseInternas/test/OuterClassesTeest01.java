package javaCore.ZZAclasseInternas.test;

import java.io.OutputStream;

public class OuterClassesTeest01 {
    private String name = "Monkey";

    class Inner {
        public void printOuterClassAttributes() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeest01.this);
        }
    }

    public static void main(String[] args) {

        OuterClassesTeest01 outerClasses = new OuterClassesTeest01();
        Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTeest01().new Inner();
        new OuterClassesTeest01().new Inner();
        inner.printOuterClassAttributes();
        inner2.printOuterClassAttributes();
    }
}

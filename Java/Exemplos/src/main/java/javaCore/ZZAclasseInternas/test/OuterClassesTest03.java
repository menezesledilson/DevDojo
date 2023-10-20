package javaCore.ZZAclasseInternas.test;

public class OuterClassesTest03 {
    private String name ="William";
    static class Nested{
        private String lastName = "Suanr";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested =  new Nested();
        nested.print();

    }

}

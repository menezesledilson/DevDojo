package javaCore.ZZDoptional.test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional <String>  o1 = Optional.of("Aha o DevDojo bom");
        Optional <String>  o2 = Optional.ofNullable(null);
        Optional <String>  o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        String name = findName("--------------------");

        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
        String empty = nameOptional.orElse("EMPTY");
        //nameOptional.ifPresent();
        System.out.println(empty);

    }
    private  static  String findName(String name){
       List<String> list = List.of("William","DevDojo");
      int i =  list.indexOf(name);
       if (i != -1){
           return  list.get(i);
       }
       return  null;
    }
}

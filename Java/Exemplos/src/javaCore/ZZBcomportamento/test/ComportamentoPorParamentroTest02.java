package javaCore.ZZBcomportamento.test;

import javaCore.ZZBcomportamento.dominio.Car;
import javaCore.ZZBcomportamento.interfaces.CarPredicate;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ComportamentoPorParamentroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars,car->car.getColor().equals("green"));
        List<Car> redCars = filter(cars,car->car.getColor().equals("red"));

        System.out.println(greenCars);
        System.out.println(redCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}

//    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//        System.out.println(greenCars);
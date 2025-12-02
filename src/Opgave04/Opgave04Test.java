package Opgave04;

import Opgave04.Models.Car;
import Opgave04.Storage.CarStorage;

public class Opgave04Test {
    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage();

        System.out.println(carStorage.fasterThen(100));
        System.out.println(carStorage.findFirstCarByBrnad("Polestar"));

    }
}

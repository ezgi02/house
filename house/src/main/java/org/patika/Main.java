package org.patika;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.addHouse(new House(100000, 120, 3, 1));
        houseService.addHouse(new House(120000, 150, 4, 2));
        houseService.addHouse(new House(90000, 100, 2, 1));

        houseService.addVilla(new Villa(300000, 250, 5, 2));
        houseService.addVilla(new Villa(320000, 300, 6, 3));
        houseService.addVilla(new Villa(290000, 240, 4, 2));

        houseService.addSummerHouse(new SummerHouse(150000, 140, 3, 1));
        houseService.addSummerHouse(new SummerHouse(170000, 160, 4, 2));
        houseService.addSummerHouse(new SummerHouse(130000, 130, 2, 1));

        System.out.println("House List: " + houseService.getHouseList());
        System.out.println("Villa List: " + houseService.getVillaList());
        System.out.println("Summer House List: " + houseService.getSummerHouseList());

        System.out.println("Total Price of Houses: " + houseService.getTotalPriceofHouses());
        System.out.println("Total Price of Villas: " + houseService.getTotalPriceofVillas());
        System.out.println("Total Price of Summer Houses: " + houseService.getTotalPriceofSummerHouses());
        System.out.println("Total Price of All Properties: " + houseService.getTotalPriceofAllProperties());

        System.out.println("Average Square Meters of Houses: " + houseService.getAverageSquareMeterOfHouses());
        System.out.println("Average Square Meters of Villas: " + houseService.getAverageSquareMeterOfVillas());
        System.out.println("Average Square Meters of Summer Houses: " + houseService.getAverageSquareMeterOfSummerHouses());
        System.out.println("Average Square Meters of All Properties: " + houseService.getAverageSquareMetersOfAllProperties());

        int rooms = 3;
        int livingRooms = 1;
        System.out.println("Properties with " + rooms + " rooms and " + livingRooms + " living rooms: " + houseService.filterPropertiesByRoomsAndLivingRooms(rooms, livingRooms));
    }
}
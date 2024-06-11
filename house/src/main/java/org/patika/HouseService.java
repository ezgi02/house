package org.patika;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private List<House> houses = new ArrayList<>();
    private List<Villa> villas = new ArrayList<>();
    private List<SummerHouse> summerHouses = new ArrayList<>();

    //Liste şeklinde eklendi
    public void addHouse(House house) {
        houses.add(house);
    }
    public void addVilla(Villa villa) {
        villas.add(villa);
    }
    public void addSummerHouse(SummerHouse summerHouse) {
        summerHouses.add(summerHouse);
    }
    //listedeki evler döndürülüyor
    public List<House> getHouseList(){
        return houses;
    }
    public List<Villa> getVillaList(){
        return villas;
    }
    public List<SummerHouse> getSummerHouseList(){
        return summerHouses;
    }
    //Evlerin toplam fiyatlarını dönen bir metot
    public double getTotalPriceofHouses(){
        return houses.stream().mapToDouble(House::getPrice).sum();
    }
    //Vilların toplam fiyatlarını dönen bir metot
    public double getTotalPriceofVillas(){
        return villas.stream().mapToDouble(Villa::getPrice).sum();
    }
    //Yazlıkların toplam fiyatlarını dönen bir metot
    public double getTotalPriceofSummerHouses(){
        return summerHouses.stream().mapToDouble(SummerHouse::getPrice).sum();
    }
    //Tüm tipteki evlerin toplam  fiyatlarını dönen bir metot
    public double getTotalPriceofAllProperties(){
        return getTotalPriceofHouses()+getTotalPriceofVillas()+getTotalPriceofSummerHouses();
    }
    //Evlerin ortalama metrekaresini dönen bir metot
    public double getAverageSquareMeterOfHouses(){
        return houses.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }
    //Vilların ortalama metrekaresini dönen bir metot
    public double getAverageSquareMeterOfVillas(){
        return villas.stream().mapToDouble(Villa::getSquareMeters).average().orElse(0);
    }
    //Yazlıkların ortalama metrekaresini dönen bir metot
    public double getAverageSquareMeterOfSummerHouses(){
        return summerHouses.stream().mapToDouble(SummerHouse::getSquareMeters).average().orElse(0);
    }
    //Tüm tipteki evlerin ortalama metrekaresiini dönen metot
    public double getAverageSquareMetersOfAllProperties(){
        double totalSquareMeters=houses.stream().mapToDouble(House::getSquareMeters).sum()+
                villas.stream().mapToDouble(Villa::getSquareMeters).sum()+
                summerHouses.stream().mapToDouble(SummerHouse::getSquareMeters).sum();
        int totalCount=houses.size()+villas.size()+summerHouses.size();
        return totalCount==0 ? 0 : totalSquareMeters/totalCount;
    }
    // Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
    public List<Object> filterPropertiesByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<Object> filteredProperties = new ArrayList<>();

        filteredProperties.addAll(houses.stream()
                .filter(h -> h.getRooms() == rooms && h.getLivingrooms() == livingRooms)
                .collect(Collectors.toList()));

        filteredProperties.addAll(villas.stream()
                .filter(v -> v.getRooms() == rooms && v.getLivingrooms() == livingRooms)
                .collect(Collectors.toList()));

        filteredProperties.addAll(summerHouses.stream()
                .filter(s -> s.getRooms() == rooms && s.getLivingrooms() == livingRooms)
                .collect(Collectors.toList()));

        return filteredProperties;
    }
}

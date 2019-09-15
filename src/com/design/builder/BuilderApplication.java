package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 11:16
 * @Description:
 */
public class BuilderApplication {

    public static void main(String[] args) {

        HouseBuilder villaBuilder = new VillaBuilder();
        HouseBuilder villageBuilder = new VillageBuilder();
        HouseBuilder apartmentBuilder = new ApartmentBuilder();

        HouseDirector villaDirector = new HouseDirector();
        HouseDirector villageDirector = new HouseDirector();
        HouseDirector apartmentDirector = new HouseDirector();

        House villaHouse = villaDirector.buildHouse(villaBuilder);
        House villageHouse = villageDirector.buildHouse(villageBuilder);
        House apartmentHouse = apartmentDirector.buildHouse(apartmentBuilder);

        System.out.println("villaHouse别墅 = " + villaHouse);
        System.out.println("villageHouse城中村 = " + villageHouse);
        System.out.println("apartmentHouse公寓 = " + apartmentHouse);

    }

}
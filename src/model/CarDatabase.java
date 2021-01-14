package model;

/**
 * @author Tobias Mitterwallner
 * @version 1
 * @date 14.01.2020
 * @class CarDatabase
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CarDatabase {

    protected HashMap<String, Vehicle> cars = new HashMap<String, Vehicle>();
    public CarDatabase() {
        for(int i = 0; i <= 1000; i++){
            MagicGenerator mg = new MagicGenerator();
            Vehicle vh = new Vehicle();
            vh.setColor(mg.getRandomColor());
            vh.setLicensePlate(mg.getRandomLicencePlate());
            vh.setManufacturer(mg.getRandomManufacturer());
            vh.setModel(mg.getRandomModel(vh.getManufacturer()));
            vh.setOwner(mg.getRandomName());
            System.out.println("Created Vehicle with license plate:" + vh.getLicensePlate());
            cars.put(vh.getLicensePlate(), vh);
        }
    }

    public Vehicle[] search(String licenseplate, boolean exact) {
        long start = System.nanoTime();
        Vehicle[] vh;
        if (exact) {
            vh = new Vehicle[1];
            vh[0] = cars.get(licenseplate);
        } else {
            Iterator<String> iterator = cars.keySet().iterator();
            ArrayList<Vehicle> al = new ArrayList();
            while (iterator.hasNext()){
                Vehicle v = cars.get(iterator.next());
                if (v.getLicensePlate().contains(licenseplate)) {
                    al.add(v);
                }
            }
            vh = new Vehicle[al.size()];
            for (Vehicle v: al) {
                   vh[al.indexOf(v)] = v;
            }
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Results were found in: " +time +" ns!");
        return vh;
    }
}

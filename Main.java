import java.util.ArrayList; //importing the arraylist class
import java.util.Collections; //importing the collections class

public class Main{
    public static void main(String[]args){
        ArrayList <String> cars = new ArrayList<String>(); //creating an array list object
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Voxwagon");

        cars.add(0, "Mazda");
        cars.set(0, "Opel");
        cars.remove(1);
        String type = cars.get(0);
        //cars.clear();

        
        System.out.println(cars.size());
        System.out.println(type);
        System.out.println(cars);
        
        //Loop through an array list
        System.out.println("Looping through the array....");
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //using the for each loop to loop througjh the array
        System.out.println("using the for each loop...");

        for(String i :cars){
            System.out.println(i);

        }

        //sorting the array alphabetically
        Collections.sort(cars);
        System.out.println("Sorted arraylist" +cars);



    }
}
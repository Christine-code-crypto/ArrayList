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

        //Sort an array of integers numerically in ascending order 

        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        Collections.sort(numbers);
         for(int i:numbers){
            System.out.println(i);
         }

        //Reverse the order of the list using the reverseorder method
        System.out.println("reverseOrder");
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(60);
        marks.add(70);
        marks.add(80);
        marks.add(88);
        marks.add(90);

        Collections.sort(marks, Collections.reverseOrder());
        for(int i: marks){
            System.out.println(i);
        }
        //Reverse order for cars
        System.out.println("Reverse order for cars");
        ArrayList <String> magari = new ArrayList<String>(); //creating an array list object
        magari.add("Volvo");
        magari.add("Mercedes");
        magari.add("Toyota");
        magari.add("Voxwagon");

        Collections.sort(magari, Collections.reverseOrder());
        for(String i: magari){
            System.out.println(i);
        }






    }
}
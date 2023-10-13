public class Zoo {
    public static boolean comparerZoo;
    Animal[] animals;
    String name;
    String city;
      final int NBR=25;
    int i; /* Compteur d'animaux dans le zoo */

    public Zoo(String name, String city) {
        animals = new Animal[NBR];
        this.name = name;
        this.city = city;


    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + NBR;
    }


    public void addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal cannot be null.");
            return;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null || animals[i].equals(animal)) {
                animals[i] = animal;
                System.out.println(animal + " has been added to the zoo.");
                return;
            }
        }

        System.out.println("The zoo is full.");
    }







    public int searchAnimal(Animal animalToFind) {
        int i = 0;
        while (i < NBR) {
            if (animals[i].equals(animalToFind)) {
                return i; // L'animal a été trouvé à l'indice i
            }
            i++;

            return -1; // L'animal n'a pas été trouvé dans le zoo
        }
        return i;
    }



    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NBR > z2.NBR) {
            return z1;
        } else if (z1.NBR < z2.NBR) {
            return z2;
        } else {
            return null;
        }
    }

    public static boolean isZooFull(Zoo zoo){
        return (zoo.NBR >= zoo.animals.length);
    }

}

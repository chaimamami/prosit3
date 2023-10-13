public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("zooo", "friguia");

        System.out.println(Zoo.comparerZoo);

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 3, true);

        // Ajout d'animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);

        // Recherchez un animal par ses caractéristiques
        Animal searchAnimal = new Animal("Felidae", "Simba", 5, true);
        int foundIndex = myZoo.searchAnimal(searchAnimal);
        if (foundIndex != -1) {
            System.out.println("L'animal a été trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("L'animal n'a pas été trouvé.");
        }

        // Ajout d'un autre animal identique au premier (ceci sera refusé)
        myZoo.addAnimal(searchAnimal);

        // Remove an animal


    }
}



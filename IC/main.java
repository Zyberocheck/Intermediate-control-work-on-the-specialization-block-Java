package IC;

import IC.File.FileCr;
import IC.specToys.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static IC.File.Item.allToys;
import static IC.File.Item.winToy;

public class main {

    public static void main(String[] args) {
        Toy whale = new Toy("Кит ", 2, 30, 1);
        Toy monkey = new Toy("Обезьяна ", 1, 10, 2);
        Toy parrot = new Toy("Попугай ", 1, 45, 3);
        Toy shark = new Toy("Акула ", 6, 90, 4);
        Toy kolobok = new Toy("Колобок ", 2, 67, 5);
        

        addToNewWeight(whale, 12);
        addToNewWeight(monkey, 21);
        addToNewWeight(parrot, 15);
        addToNewWeight(shark, 67);
        addToNewWeight(kolobok, 17);
        

        System.out.println("Игрушки: ");
        showNewList(allToys);

        
        List<Toy> selectWinner = ToyMinWeight(allToys, 20);
        winToy.addAll(selectWinner);

        
        System.out.println("Игрушки оставшиеся: ");
        showNewList(winToy);

        
        Toy givedWinner = selectRandomToy(winToy);
        winToy.remove(givedWinner);

        
        System.out.println("Будет выдана: " + givedWinner.info());

        //пишем инфо в текстовый файл
        FileCr.writeToy(givedWinner);

    }

    private static List<Toy> ToyMinWeight(ArrayList<Toy> allToys, int minWeight) {
        List<Toy> result = new ArrayList<>();
        for (Toy currentToy : allToys) {
            if (currentToy.getWeight() <= minWeight) {
                result.add(currentToy);
            }
        }
        return result;
    }

    private static Toy selectRandomToy(ArrayList<Toy> winsToys) {
        Random rand = new Random();
        int winnerElement = rand.nextInt(winsToys.size());
        return winsToys.get(winnerElement);
    }

    private static void addToNewWeight(Toy newToy, int newWeight) {
        newToy.setWeight(newWeight);
        allToys.add(newToy);
    }

    private static void showNewList(ArrayList<Toy> myList) {
        int winListSize = myList.size();
        for (int i = 0; i < winListSize; i++) {
            System.out.print("Игрушка под номером " + i + ": " + myList.get(i).getName() + ", ");
        }
        System.out.println("");
    }
    
}

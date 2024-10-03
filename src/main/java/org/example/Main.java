package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void testCollectionsMethods(int size) {
        PrimesGenerator generator = new PrimesGenerator();

        int[] res = generator.generateRandomArray(size);

        System.out.println("Array: " + Arrays.toString(res));

        List<Integer> list =  new ArrayList<>();

        for (int num : res) {
            list.add(num);
        }

        System.out.println("List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        Collections.rotate(list, 1);
        System.out.println("One Shift List: " + list);

        Set <Integer> uniqueSet = new LinkedHashSet<>(list);

        list = new ArrayList<>(uniqueSet);
        System.out.println("Unique Elements List: " + list);

        List<Integer> duplicateList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num: list) {
            if (seen.contains(num)) {
                duplicateList.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println("Duplicate Elements List: " + duplicateList);

        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("Array from List: " + Arrays.toString(arr));

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : res) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Number Frequencies: " + countMap);
    }

    public static void testHuman() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("John", "Lock", 55));
        humans.add(new Human("Tom", "Sayer", 32));
        humans.add(new Human("Jack", "Shepard", 35));
        humans.add(new Human("Kate", "Austen", 28));
        humans.add(new Human("Charlie", "Pace", 27));

        //Элементы никак не упорядочиваются
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet:");
        printCollection(hashSet);

        // Элементы выводятся в том порядке, в котором они были добавлены
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nLinkedHashSet:");
        printCollection(linkedHashSet);

        //Элементы упорядочены по имени, затем по фамилии, затем по возрасту.
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nTreeSet:");
        printCollection(treeSet);

        //Элементы упорядочены по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\nTreeSet (by last name):");
        printCollection(treeSetByLastName);

        //Элементы упорядочены по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });

        treeSetByAge.addAll(humans);
        System.out.println("\nTreeSet (by age):");
        printCollection(treeSetByAge);
    }

    private static void printCollection(Collection<Human> collection) {
        for (Human human : collection) {
            System.out.println(human);
        }
    }

    public static Map<String, Integer> countWordInString(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z ]", "");

        Map<String, Integer> resMap = new HashMap<>();
        for(String s: str.split(" ")) {
            if(resMap.containsKey(s)) {
                resMap.put(s, resMap.get(s) + 1);
            }
            else {
                resMap.put(s, 1);
            }
        }

        return resMap;
    }

    public static <K, V> Map<V, K> invertMap(Map<K, V> originalMap) {
        Map<V, K> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }
}


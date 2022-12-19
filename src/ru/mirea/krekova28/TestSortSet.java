package ru.mirea.krekova28;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class TestSortSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(1);
        set.add(10);
        Set<Integer> treeSet = getInstance(set);
        System.out.println(treeSet);

    }
    public static <T> Set<T> getInstance(Set<T> hashSet)
    {
        Set<T> treeSet = hashSet.stream().collect(Collectors.toCollection(TreeSet::new));
        return treeSet;
    }
}

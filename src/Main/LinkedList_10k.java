package Main;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class LinkedList_10k {
    public static int count = 10000;
    public static String volume = "10k";

    public static void main(String[] args) {
        ImplementationForEachLinkedListCase implementationForEachLinkedListCase = new ImplementationForEachLinkedListCase();

        LinkedList<Integer> linkedList = new LinkedList<>();
        ListIterator<Integer> listIterator = null;

        implementationForEachLinkedListCase.implementation(volume, count, linkedList, listIterator);
    }
}

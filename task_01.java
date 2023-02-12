
/*
 * Создать список целых чисел(заполнить случайными числами), 
 * удалить из списка целые числа
 */

package j_hometask_03;

import java.util.ArrayList;
import java.util.Random;

public class task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list1.add(random.nextInt(0, 10));

        }
        System.out.print(list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else
                i++;
        }
        System.out.println(list1);

    }
}

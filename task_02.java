
/*
 *  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
package j_hometask_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list1.add(random.nextInt(0, 10));

        }
        System.out.print(list1);

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("Наименьшее число в списке " + list1.get(0));
        System.out.println("Максимальное число в списке " + list1.get(list1.size() - 1));
        int sum = 0;
        for (int i : list1) {
            sum += i;
        }
        System.out.println(" Среднее значение = " + sum / list1.size());

    }
}

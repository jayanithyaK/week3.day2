package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementsInArray {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		Collections.sort(list);

		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i - 1) == i) {
				continue;
			} else {
				System.out.println(i + " is the missing element");
				break;
			}
		}

	}

}

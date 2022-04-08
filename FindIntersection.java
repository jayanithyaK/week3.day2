package week3.day2;

import java.util.ArrayList;

public class FindIntersection {
	public static void main(String[] args) {
		String intersection="";
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
		list.add("2");
		list.add("11");
		list.add("4");
		list.add("6");
		list.add("7");
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("8");
		l.add("4");
		l.add("9");
		l.add("7");
for(int i=0;i<list.size();i++) {
	if(list.get(i)==l.get(i)) {
		intersection+=list.get(i)+" ";
	}
}
System.out.println(intersection.trim());
		}

}

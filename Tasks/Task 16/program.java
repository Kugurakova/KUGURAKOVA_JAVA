import java.util.Scanner;
class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(-3);
		list1.add(-5);
		list1.add(5);
		System.out.println("Add 4 elements");
		list1.print();
		list1.addToBegin(2);
		System.out.println("Add element 2 in top");
		list1.print();
		list1.insert(4,2);
		System.out.println("Add element 4 in center");
		list1.print();
		list1.reverse();
		System.out.println("reverse");
		list1.print();
		System.out.println("getCount = " + list1.getCount());
        list1.sort();
		System.out.println("sort");
		list1.print();
		System.out.println("contains -5 "+list1.contains(-5));
		System.out.println("indexOf -5 "+list1.indexOf(-5));
		System.out.println("contains 5 "+list1.contains(5));
		System.out.println("indexOf 5 "+list1.indexOf(5));
		System.out.println("contains 15 "+list1.contains(15));
		System.out.println("indexOf 15 "+list1.indexOf(15));
//		for (int i = 0; i < list1.count; i++) {
//			System.out.println("list1[" + i + "] = " + list1.lines[i]);
//		}

	}
}
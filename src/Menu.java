import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

	
		public Menu() {
			ArrayList<Abiturient> array = create_array();
			show_by_name(array);
			higher_then_some_mark(array);
			top_n(array);
		}

		
		public static  ArrayList<Abiturient> create_array(){
			ArrayList<Abiturient> array = new ArrayList<Abiturient>();
			System.out.print("Введіть кількість абітурієнтів: ");
			int size = (int)EnterN();
			for(int i = 0; i < size; i++) {
				Abiturient temp = new Abiturient();
				array.add(temp);
				}
			return array;
		}
		
		public static double EnterN() {
			Double n = -1.0;
			Scanner input = new Scanner(System.in);
			
			do{
				while(!input.hasNextDouble()) {
					input.next();
					System.out.println("Хибні дані");
				}
				n = input.nextDouble();
			}while(n < 0);
			return n;
			}
		
		public static Abiturient crate_Abiturient() { 
				Abiturient temp = new Abiturient();
				return temp;
		}
		
		public static void show_by_name(ArrayList<Abiturient> array) {
			System.out.print("Введіть ім'я для пошуку абітурієнтів: ");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			System.out.printf("Студенти іменем %s: \n", name);
			for(int i = 0; i < array.size(); i++) {
				if(name.compareTo(array.get(i).get_name()) == 0)
					System.out.print(array.get(i));
			}
		}
		
		public static void higher_then_some_mark(ArrayList<Abiturient> array) {
			System.out.print("Введіть бал: ");
			double mark = EnterN();
			System.out.println("Абітурієнти, середній бал яких більший за "+ mark);
			for(int i = 0; i < array.size(); i++) {
				if(mark < array.get(i).getValue())
					System.out.println(array.get(i));
			}			
		}
		
		public static void top_n(ArrayList<Abiturient> array) {
			System.out.print("Введіть кількість абітурієнтів: ");
			int n = (int)EnterN();
			if( n > array.size()) {
				System.out.println("Стількох абітурієнтів немає");
				n = array.size();
			}
			System.out.printf("Топ %d абітурієнтів по їх середньому балу:\n",n);
			Collections.sort(array, new Comparator<Abiturient>(){
				
				@Override
				public int compare(Abiturient o1, Abiturient o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
				
			});
			//Collections.sort(array,Collections.reverseOrder());
			
			for(int i = 0; i <  n; i++) 
				System.out.print(array.get(i));			
		}
		
}

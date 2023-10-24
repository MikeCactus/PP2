import java.util.*;

public class Abiturient {
	
	private String id, name, father_name, adress, phone_n;
	private Double mark;
	
	public Abiturient() {
		Scanner input = new Scanner(System.in);
		System.out.println("###############################\nВводьте дані про абітурієнта:");
		System.out.print("ID: ");
		this.id = input.next();
		System.out.print("Name: ");
		input.nextLine();
		this.name = input.next();
		System.out.print("По-батькові: ");
		input.nextLine();
		this.father_name = input.next();
		System.out.print("Адреса: ");
		input.nextLine();
		this.adress = input.next();
		System.out.print("Номер телефону: ");
		input.nextLine();
		this.phone_n = input.next();
		this.mark = this.setValue();
	}
	
	public double setValue() {
		double n = -1.0;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.print("Рейтинговий бал:");
			while(!input.hasNextDouble()) {
				input.next();
				System.out.print("Некоректні дані, спробуйте ще: ");
			}
			n = input.nextDouble();
		}while(n < 0.0);
		return n;
		}

	public Double getValue() {
		return this.mark;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public String toString() {
		return "#################"+"\n"+this.id+"\n"+this.name+" "+this.father_name+"\n"+this.adress+'\n'+this.phone_n+"\n"+this.mark+"\n";
	}
	
}



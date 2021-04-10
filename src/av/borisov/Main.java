package av.borisov;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		PersonList persons = new PersonList();
		
		persons.add(new Person("Иван","Иванов",new Date(23,6,1995), new Address("Связистов", "57", 160)));
		persons.add(new Person("Иван","Петров",new Date(28,9,2005), new Address("Электродная", "65к3", 94)));
		persons.add(new Person("Иван","Сидоров",new Date(29,9,2010), new Address("Электродная", "50", 16)));
		persons.add(new Person("Пётр","Иванов",new Date(31,8,2000), new Address("Связистов", "20", 47)));
		persons.add(new Person("Пётр","Петров",new Date(28,9,2005), new Address("Электродная", "65к3", 94)));
		persons.add(new Person("Пётр","Сидоров",new Date(14,12,1996), new Address("Новолинейная", "87", 54)));
		persons.add(new Person("Сидор","Иванов",new Date(15,3,2000), new Address("Электродная", "25/1", 94)));
		persons.add(new Person("Сидор","Петров",new Date(17,12,1992), new Address("Связистов", "42", 24)));
		persons.add(new Person("Сидор","Сидоров",new Date(2,2,2010), new Address("Связистов", "68", 55)));
		
		System.out.println("Все люди в списке: ");
		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println("\n\nВсе люди с фамилией Петров: ");
		for (Person person : persons.searchBySurname("Петров")) {
			System.out.println(person);
		}
		System.out.println("\n\nЛюди, живущие по адресу ул.Электродная, д.65к3, кв. 94: ");
		for (Person person : persons.searchByAddress(new Address("Электродная", "65к3", 94))) {
			System.out.println(person);
		}
		System.out.println("\n\nВсе люди, живущие на ул.Связистов: ");
		for (Person person : persons.searchByStreet("Связистов")) {
			System.out.println(person);
		}
		System.out.println("\n\nСамый старый: ");
		System.out.println(Collections.max(persons));
		System.out.println("\n\nСамый молодой: ");
		System.out.println(Collections.min(persons));
		System.out.println("\n\nВсе люди, родившиеся в промежутке с 01.04.2000 по 01.09.2010: ");
		for (Person person : persons.searchByDateRange(new Date(1,4,2000), new Date(31,8,2010))) {
				System.out.println(person);
		}
	}
}

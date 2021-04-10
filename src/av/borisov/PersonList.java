package av.borisov;

import java.util.*;

/**
 * Класс, описывающий массив из людей.
 * <p>Наследуется от класса {@code ArrayList<Person>} и реализует методы поиска.
 * @author Александр Борисов
 */
public class PersonList extends ArrayList<Person> {
	
	//При наследовании от класса ArrayList нужно это поле, без него вылезает предупреждение.
	private static final long serialVersionUID = 1L;
	
	/**
	 * Метод поиска людей по имени.
	 * @param name	имя человека
	 * @return		Возвращает массив людей с именем, переданным в качестве аргумента.
	 */
	public PersonList searchByName(String name) {
		Person[] subPersonArray = Arrays
		        .stream(this.toArray(size -> new Person[size]))
		        .filter(person -> person.getName().equals(name))
		        .toArray(size -> new Person[size]);
		PersonList subPersonList = new PersonList();
		subPersonList.addAll(Arrays.asList(subPersonArray));
		return subPersonList;
	}
	
	/**
	 * Метод поиска людей по фамилии.
	 * @param surname	фамилия человека
	 * @return			Возвращает массив людей с именем, переданным в качестве аргумента.
	 */
	public PersonList searchBySurname(String surname) {
		Person[] subPersonArray = Arrays
		        .stream(this.toArray(size -> new Person[size]))
		        .filter(person -> person.getSurname().equals(surname))
		        .toArray(size -> new Person[size]);
		PersonList subPersonList = new PersonList();
		subPersonList.addAll(Arrays.asList(subPersonArray));
		return subPersonList;
	}
	
	/**
	 * Метод поиска людей по адресу.
	 * @param address	объект "адрес"
	 * @return			Возвращает массив людей с адресом, переданным в качестве аргумента.
	 */
	public PersonList searchByAddress(Address address) {
		Person[] subPersonArray = Arrays
		        .stream(this.toArray(size -> new Person[size]))
		        .filter(person -> person.getAddress().equals(address))
		        .toArray(size -> new Person[size]);
		PersonList subPersonList = new PersonList();
		subPersonList.addAll(Arrays.asList(subPersonArray));
		return subPersonList;
	}
	
	/**
	 * Метод поиска людей по улице.
	 * @param street	название улицы
	 * @return			Возвращает массив людей, проживающих по улице,
	 * 					название которой передаётся в качестве аргумента.
	 */
	public PersonList searchByStreet(String street) {
		Person[] subPersonArray = Arrays
		        .stream(this.toArray(size -> new Person[size]))
		        .filter(person -> person.getAddress().getStreet().equals(street))
		        .toArray(size -> new Person[size]);
		PersonList subPersonList = new PersonList();
		subPersonList.addAll(Arrays.asList(subPersonArray));
		return subPersonList;
	}
	
	/**
	 * Метод поиска людей по дате рождения.
	 * @param d1	начальная дата
	 * @param d2	конечная дата
	 * @return		Возвращает массив людей, родившихся в указанный промежуток времени.
	 */
	public PersonList searchByDateRange(Date d1, Date d2) {
		PersonList subPersonList = new PersonList();
		for (Person person : this) {
			if (person.getBirthDate().compareTo(d1)>=0
					&& person.getBirthDate().compareTo(d2)<0) {
				subPersonList.add(person);
			}
		}
		return subPersonList;
	}
}

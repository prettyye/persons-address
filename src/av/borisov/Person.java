package av.borisov;

/**
 * Класс, описывающий человека.
 * <p>Реализует интерфейс {@code Comparable}, позволяющий сравнивать двух людей по возрасту.
 * @author Александр Борисов
 */
public class Person implements Comparable<Person>{
	
	//Переменные имени, фамилии, даты рождения и адреса.
	private String name;
	private String surname;
	private Date birthDate;
	private Address address;
	
	/**
	 * Конструктор класса {@code Person}. Создаёт объект "человек" с заданными параметрами.
	 * @param name			имя
	 * @param surname		фамилия
	 * @param birthDate		дата рождения
	 * @param address		адрес проживания
	 */
	public Person(String name, String surname, Date birthDate, Address address) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	/**
	 * Геттер метод для имени.
	 * @return	Возвращает имя данного человека.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Геттер метод для фамилии.
	 * @return	Возвращает фамилию данного человека.
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Геттер метод для даты рождения.
	 * @return	Возвращает дату рождения данного человека.
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	
	/**
	 * Геттер метод для адреса проживания.
	 * @return	Возвращает адрес проживания данного человека.
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * Метод, возвращающий строковое представление объекта.
	 * @return	Возвращает строковое представление объекта "человек".
	 */
	@Override
	public String toString() {
		return name+" "+surname+" "+birthDate+" | "+address;
	}
	
	/**
	 * Метод, сравнивающий данного человека с другим по возрасту.
	 */
	@Override
	public int compareTo(Person p) {
		return -this.birthDate.compareTo(p.birthDate);
	}
}

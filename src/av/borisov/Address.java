package av.borisov;

/**
 * Класс, описывающий адрес.
 * @author Александр Борисов
 */
public class Address {
	
	//Переменные улицы, дома и квартиры
	private String street;
	private String house;
	private int apartment;
	
	/**
	 * Конструктор класса {@code Address}. Создаёт объект "адрес" с заданными параметрами.
	 * @param street
	 * @param house
	 * @param apartment
	 */
	public Address(String street, String house, int apartment) {
		this.street = street;
		this.house = house;
		this.apartment = apartment;
	}
	
	/**
	 * Геттер метод для улицы.
	 * @return	Возвращает поле "улица" из адреса.
	 */
	public String getStreet() {
		return this.street;
	}
	
	/**
	 * Геттер метод для дома.
	 * @return	Возвращает поле "дом" из адреса.
	 */
	public String getHouse() {
		return this.house;
	}
	
	/**
	 * Геттер метод для квартиры.
	 * @return	Возвращает поле "квартира" из адреса.
	 */
	public int getApartment() {
		return this.apartment;
	}
	
	/**
	 * Метод, возвращающий строковое представление объекта.
	 * @return	Возвращает строковое представление объекта "адрес".
	 */
	@Override
	public String toString() {
		return "ул."+street+", д."+house+", кв."+apartment;
	}
	
	/**
	 * @see {@link #Object.equals()}
	 */
	@Override
	public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address address = (Address) o;

        if (!street.equals(address.street)) {
            return false;
        }
        if (!house.equals(address.house)) {
            return false;
        }
        if (apartment != address.apartment) {
            return false;
        }
        return true;
    }
}

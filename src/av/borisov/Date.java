package av.borisov;

/**
 * Класс, описывающий дату.
 * <p>Реализует интерфейс {@code Comparable}, позволяющий сравнивать двух людей по возрасту.
 * @author Александр Борисов
 */
public class Date implements Comparable<Date>{
	
	//Переменные дня, месяца и года.
	private int day;
	private int month;
	private int year;
	
	//Метод, приводящий числа к формату, пригодному для отображения даты.
	private String numberFormat(int number) {
		if (number < 10) {
			return "0"+number;
		}
		else {
			return String.valueOf(number);
		}	
	}
	
	/**
	 * Метод, сравнивающий данную дату с другой.
	 */
	public int compareTo(Date d) {
		if (this.year!=d.year) {
			return this.year-d.year;
		}
		else if (this.month!=d.month) {
			return this.month-d.month;
		}
		else {
			return this.day-d.day;
		}
	}
	
	/**
	 * Конструктор класса {@code Date}. Создаёт объект "дата" с заданными параметрами.
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	/**
	 * Метод, возвращающий строковое представление объекта.
	 * @return	Возвращает строковое представление объекта "дата".
	 */
	@Override
	public String toString() {
		return numberFormat(day)+"."+numberFormat(month)+"."+year;
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

        Date date = (Date) o;

        if (day != date.day) {
            return false;
        }
        if (month != date.month) {
            return false;
        }
        if (year != date.year) {
            return false;
        }
        return true;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Formatter;


/**
 Класс Products содержит поля и
 методы для работы с продуктами. Каждый объект этого класса представляет отдельный продукт,
 который имеет идентификатор, название, цену, бренд и количество.
 */

public class Products {
    private String id;
    private String name;
    private String price;
    private String brand;
    private int quantity;


    /**
     Products(): конструктор по умолчанию, который инициализирует все поля объекта значением "None" или 0.
     */

    public Products() {
        id = "None";
        name = "None";
        price = "None";
        brand = "None";
        quantity = 0;
    }

    /**
     Products(Products other): конструктор копирования, который создает новый объект на основе существующего объекта типа Products.
     */
    public Products(Products other) {
        id = other.id;
        name = other.name;
        price = other.price;
        brand = other.brand;
        quantity = other.quantity;
    }

    /**
     Products clone(): метод, который создает копию объекта типа Products.
     */

    public Products clone() {
        return new Products(this);
    }

    /**
     boolean equal(Products other): метод,
     который сравнивает текущий объект типа Products с другим объектом типа Products.
     */

    public boolean equal(Products other) {
        return (id.equals(other.id) &&
                name.equals(other.name) &&
                price.equals(other.price) &&
                brand.equals(other.brand) &&
                quantity == other.quantity);
    }

    /**
     void readingFile(BufferedReader reader): метод,
     который считывает данные о продукте из переданного объекта BufferedReader.
     */


    public void readingFile(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        String[] fields = line.split(",");

        id = fields[0];
        name = fields[1];
        price = fields[2];
        brand = fields[3];
        quantity = Integer.parseInt(fields[4]);
    }

    /**
     void writeTable(Formatter formatter): метод,
     который форматирует и выводит информацию о продукте в переданный объект Formatter.
     */


    public void writeElement() {
        System.out.println(id + ", " +
                name + ", " +
                price + ", " +
                brand + ", " +
                quantity + ", ");
    }

    public void writeTable(Formatter formatter) {
        formatter.format("%-15s %-15s %-15s %-15s %-10d\n", id, name, price, brand, quantity);
    }
}

/**
 Методы clone() и equal() реализуют механизмы клонирования объектов и сравнения их между собой,
 что может быть полезно для создания копий и поиска дубликатов продуктов.
 Метод readingFile() читает данные из файла и заполняет поля объекта. Метод writeElement()
 выводит информацию о продукте в консоль, а метод writeTable() форматирует и выводит информацию о продукте
 в виде таблицы, что может быть полезно для вывода большого количества информации о продуктах в удобочитаемом
 виде.
 */

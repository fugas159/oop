//Задача: Система учета транспортных средств
//Условие:
//Создайте базовый класс Vehicle (Транспортное средство) с полями:
//make (марка)
//model (модель)
//year (год выпуска)
//
//В этом классе реализуйте метод:
//getDescription() — который возвращает строку с информацией о транспортном средстве в формате:
//        "Марка: [make], Модель: [model], Год: [year]"
//Создайте два дочерних класса:
//        1. Car (Автомобиль), который имеет дополнительное поле:
//numberOfDoors (количество дверей) И переопределяет метод getDescription() для добавления информации о количестве дверей.
//        2. Motorcycle (Мотоцикл), который имеет дополнительное поле:
//hasSidecar (есть ли коляска) И переопределяет метод getDescription() для добавления информации о наличии коляски.
//
//Требования:
//В каждом классе создайте конструктор для инициализации полей.
//В классе Main создайте объекты классов Car и Motorcycle, вызовите их методы getDescription() и выведите информацию на экран.
public class Vehicle {
    String make;
    String model;
    int year;
    int drive;

    public Vehicle(String make, String model, int year,int drive) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.drive = drive;
    }

    public String getDescription() {
        return " Марка: " + make + ", " + " Модель: " + model + " ," + " Год выпуска: " + year+","+ " Мощность двигателя: "+ drive;

    }

}


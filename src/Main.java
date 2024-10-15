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
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "Atenza", 2015, 166, 4);

        System.out.println(car.getDescription());

        System.out.println(" ");

        Motorcycle motorcycle = new Motorcycle("Honda", "Africa Twin", 2020, 62, false);

        System.out.println(motorcycle.getDescription());

    }
}

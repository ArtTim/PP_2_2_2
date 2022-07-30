package web.model;

import org.springframework.stereotype.Repository;

//1. Создайте еще один контроллер, замаппленный на /cars.
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
@Repository
public class Car {
    private String model;
    private String color;
    private int price;

    public Car() {
    }

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

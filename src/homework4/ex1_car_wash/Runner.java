package homework4.ex1_car_wash;

public class Runner {
    public static void main(String[] args) {
        //Создать легковую машину (атрибуты: чистая/грязная, размеры(ширина,высота,длина), наличие круиз контроля)
        //Создать автобус (атрибуты: чистый/грязный, размеры(ширина,высота,длина), макс количество пассажиров)
        //Создать автомойку
        //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
        //Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
        //Категории автомобилей:
        //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
        //иначе считается маломерной.
        //тариф 4000 - для крупных авто.
        //тариф 2000 - для маломерных.
        //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
        //5 автобусов(12х3х2.3)
        //Посчитать и вывести: сколько мэрия заплатит денег за мойку всех машин.

        Car cityHallCar = new Car(false, 5, 2, 1.8, true);
        Bus cityHallBus = new Bus(false, 12, 3, 2.3, 16);
        CarWash carWash = new CarWash(5, 4);

        carWash.washVehicles(cityHallBus, cityHallCar);
    }
}
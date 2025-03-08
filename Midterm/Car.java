package Midterm;
import java.util.ArrayList;

    class Car {
        void show(Car c) {
            System.out.println("Car Object: " + c);
        }
    
        void display() {
            show(this);  // ส่งออบเจ็กต์ปัจจุบันไปให้ show()
        }

        public static void main(String[] args) {
            Car car = new Car();
            car.display();
        }
    }





    public class Car {
        // Attributes
        String brand;
        String color;
        int speed;
    
        // Constructor（建構子）
        public Car(String brand, String color, int speed) {
            this.brand = brand;
            this.color = color;
            this.speed = speed;
        }
    
        // Behaviors（行為）：方法
        public void accelerate(int increase) {
            speed += increase;
            System.out.println(brand + " is now going at " + speed + " km/h.");
        }
    
        public void brake() {
            speed = 0;
            System.out.println(brand + " has stopped.");
        }
    
    
        public static void main(String[] args) {
            // 建立物件
            Car myCar = new Car("Toyota", "Red", 50);
    
            // 存取屬性
            System.out.println("Car brand: " + myCar.brand);
            System.out.println("Car color: " + myCar.color);
            System.out.println("Car speed: " + myCar.speed);
    
            // 呼叫行為（方法）
            myCar.accelerate(20);  // 加速
            myCar.brake();         // 煞車
        }
    }
    


public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        float height = 1.87F; // Введите рост в метрах
        float weight = 98F; //Введите вес в кг
        int myIndex = bmi.calculate(height, weight);
        System.out.println("Index: " + myIndex);
    }
}
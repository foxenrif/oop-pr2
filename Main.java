public class Main {
    public static void main(String[] args) {
        // Створення об'єкта DataProcessor
        DataProcessor dataProcessor = new DataProcessor();

        // Виклик методу processData з різними аргументами
        dataProcessor.processData("Dataset 1", 1, 2, 3, 4, 5);
        dataProcessor.processData("Dataset 2", 10, 20, 30);
        dataProcessor.processData("Dataset 3", 100, 200);
        dataProcessor.processData("Empty Dataset");
    }
}

public class DataProcessor {

    // Вкладений клас Data
    public static class Data {
        private String name;
        private int[] values;

        // Конструктор класу Data
        public Data(String name, int[] values) {
            this.name = name;
            this.values = values;
        }

        // Метод display для виведення даних
        public void display() {
            System.out.println("Name: " + name);
            System.out.print("Values: ");
            for (int value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Метод processData з аргументами змінної довжини
    public void processData(String name, int... values) {
        Data data = new Data(name, values);
        data.display();
    }
}

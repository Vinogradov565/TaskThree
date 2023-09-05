public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction attraction1 = park.new Attraction("Карусель", "10:00 - 18:00", 150.0);
        Attraction attraction2 = park.new Attraction("Горки", "11:00 - 19:00", 200.0);

        attraction1.printInfo();
        attraction2.printInfo();
    }
}

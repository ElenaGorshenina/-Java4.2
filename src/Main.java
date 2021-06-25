public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();

        double bodyMassIndex = service.calculate(59, 1.78); //bodyMass-kilogram, height-meter
        System.out.println("Индекс массы тела:");
        System.out.printf("%.2f\n", bodyMassIndex);

    }
}

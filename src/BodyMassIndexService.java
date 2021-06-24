public class BodyMassIndexService {
    public double calculate(double bodyMass, double height) {
        double bodyMassIndex = bodyMass / (height * height);
        //String formattedDouble = String.format("%.2f", bodyMassIndex);
        return bodyMassIndex;
    }
}

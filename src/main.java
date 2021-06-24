public class main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();

        double bodyMassIndex = service.calculate(59, 1.78); //bodyMass-kilogram, height-meter
        System.out.println("Индекс массы тела:");
        System.out.println(bodyMassIndex); //как вывести 2 цифры после запятой?

        if (bodyMassIndex<18.5){
            System.out.println("Недостаточная масса тела");
        } else {
            if (bodyMassIndex>=18.5 && bodyMassIndex<25){
                System.out.println("Норма");
            } else {
                if (bodyMassIndex>=25){
                    System.out.println("Избыточная масса тела");
            }
        }
    }
}}

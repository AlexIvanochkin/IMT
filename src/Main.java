public class Main {
    public static void main(String[] args) {
        BMiService service = new BMiService();
        int height = 160; // писать в сантиметрах
        int weight = 84; // писать в килограммах
        int BodyMassIndex = service.calculate(height , weight);
        System.out.println("Индекс массы тела");
        System.out.println(BodyMassIndex);
        if ( BodyMassIndex <=16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (BodyMassIndex >= 16 && BodyMassIndex <= 18) {
            System.out.println("Недостаточная (дефицит) масса тела");
        }
        if (BodyMassIndex >= 19 && BodyMassIndex <= 25) {
            System.out.println("Норма");
        }
        if (BodyMassIndex >= 26 && BodyMassIndex <= 30) {
            System.out.println("Избыточная масса тела");
        }
        if (BodyMassIndex >= 31 && BodyMassIndex <= 35) {
            System.out.println("Ожирение первой степени");
        }
        if (BodyMassIndex >= 36 && BodyMassIndex <= 40) {
            System.out.println("Ожирение второй степени");
        }
        if (BodyMassIndex >= 41) {
            System.out.println("Ожирение третьей степени");
        }
    }
}
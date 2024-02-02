public class BMiService {
    public int calculate(int height, int weight) {

        int BodyMassIndex = ((weight * 10000 / (height * height))); // чтобы компенисровать разницу метров и сантиметров

        return BodyMassIndex;
    }

}

public class BmiService {
    public int calculate(float height, float weight) {
        float index = weight / (height * height);
        return (int) index;
    }
}

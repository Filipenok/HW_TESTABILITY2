public class BmiService {
    public int calculate (double weightInKg, double heightInM) {
        int index = (int) (weightInKg / (heightInM * heightInM));
        return index;
    }

}

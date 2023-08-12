public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate(98,1.87);
        System.out.println(index);

        index = service.calculate(78, 1.78);
        System.out.println(index);

        index = service.calculate(104.3, 2.10);
        System.out.println(index);
    }
}

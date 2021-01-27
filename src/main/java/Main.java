public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);

        // производим проверку
        // если true то PASS
        // если  false то FAIL
        boolean passed = expected == actual;

        //выводим результат
        System.out.println(passed);

    }
}


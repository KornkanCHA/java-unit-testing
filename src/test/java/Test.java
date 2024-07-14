public class Test {
    public void test001() {
        Payment order1 = new Payment();
        double total = order1.getTotal(120.0);
        assert total == 114.0;
    }
}

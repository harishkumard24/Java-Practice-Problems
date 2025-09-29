package Question2;

public class TestCalculator {
    public static void testAdd(){
        Calculator cal = BasicCalculator.getInstance();
        assert(cal.put(10)
                .put(30)
                .add()
                .put(40)
                .add()
                .neg()
                .read()== -80);
        }


    public static void testSub(){
        Calculator cal = BasicCalculator.getInstance();
        assert(cal.put(100)
                .put(10)
                .sub()
                .put(10)
                .sub()
                .neg()
                .read()== -80);
    }

    public static void testDiv(){
        Calculator cal = BasicCalculator.getInstance();
        assert(cal.put(100)
                .put(10)
                .div()
                .put(10)
                .div()
                .neg()
                .read()== -1);
    }

    public static void testMul() {
        Calculator cal = BasicCalculator.getInstance();
        assert (cal.put(5)
                .put(3)
                .mul()
                .put(2)
                .mul()
                .neg()
                .read() == -30);
    }

    public static void testNeg() {
        Calculator cal = BasicCalculator.getInstance();
        assert (cal.put(25)
                .neg()
                .read() == -25);
    }

    public static void testClear() {
        Calculator cal = BasicCalculator.getInstance();
        assert (cal.put(50)
                .clear()
                .read() == 0);
    }

    public static void testClearAll() {
        Calculator cal = BasicCalculator.getInstance();
        assert (cal.put(100)
                .put(200)
                .clearAll()
                .read() == 0);
    }

        public static void main(String[] args){
            testAdd();
            testSub();
            testDiv();
            testMul();
            testNeg();
            testClear();
            testClearAll();
    }
}

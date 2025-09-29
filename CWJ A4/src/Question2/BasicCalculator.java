package Question2;

public class BasicCalculator implements Calculator{

    int[] cells;
    int t;
    private BasicCalculator(){
        cells=new int[2];
    }
    @Override
    public Calculator put(int n) {
        cells[t]=n;
        t=(t+1)%n;
        return this;
    }

    @Override
    public int read() {
        return cells[0];
    }

    @Override
    public Calculator neg() {
        cells[0] = -cells[0];
        return this;
    }

    @Override
    public Calculator add() {
        cells[0]=cells[0]+cells[1];
        t=1;
        return this;
    }

    @Override
    public Calculator sub() {
        cells[0] = cells[0] - cells[1];
        t=1;
        return this;
    }

    @Override
    public Calculator mul() {
        cells[0] = cells[0] * cells[1];
        t=1;
        return this;
    }

    @Override
    public Calculator div() {
        cells[0] = cells[0] / cells[1];
        t=1;
        return this;
    }

    @Override
    public Calculator clear() {
        cells[0]=0;
        t=0;
        return this;
    }

    @Override
    public Calculator clearAll() {
        cells[0]=cells[1]=0;
        t=0;
        return this;
    }

    public static Calculator getInstance(){
        Calculator cal = new BasicCalculator();
        cal.clearAll();
        return cal;
    }
}

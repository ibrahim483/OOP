public class Main {
    public static void main(String[] args) {
        Samplar sinus = new dedefault();
        Signal signal = new Signal(sinus);

        signal.register(new TextView());
        signal.register(new GraphView());

        for (int i = 0; i < 100; i++) {
            signal.tick();
        }
    }
}

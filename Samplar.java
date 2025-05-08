public interface Samplar {
    int sample();
}

class sinusSignal implements Samplar {
    private int x = 0;

    @Override
    public int sample() {
        x++;
        return (int) (Math.sin(x)*100);

    }
    
}

class dedefault implements Samplar {
    private int counter = 0;

    @Override
    public int sample() {
        return counter++;
    }

    
}

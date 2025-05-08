public interface Observer {
    void update(int value);
}

 class TextView implements Observer{

    @Override
    public void update(int value) {
        System.out.println("the text view value is "+ value);
    }
    
}

class GraphView implements Observer{

    @Override
    public void update(int value) {
        int counter = 0;
        System.out.println("the graph view value is "+ value);
        while (counter != value) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }
    
}

public class GenerickQueue<T> {

    private Object data[] = null;
    public int numObjetos = 0;

    public void insert(T element, int i) {

        if (numObjetos == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < numObjetos; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = numObjetos - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        numObjetos++;
    }
    public void add(T element) {
        insert(element, numObjetos);
    }
    public T delete(int i) {
        Object aux = data[i];

        for (int j = i; j < numObjetos - 1; j++) {
            data[j] = data[j + 1];
        }

        numObjetos--;
        return (T) aux;
    }
    public GenerickQueue<Float> cola = new GenerickQueue<>();

    public void enqueue(Float element) {
        cola.add(element);
    }

    public Float dequeue() {
        return (Float) cola.delete(0);
    }
}

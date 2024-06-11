public class GenericsClass1<T,U> {
    T obj1; // An object of type T
    U obj2; // An object of type U



    GenericsClass1(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public GenericsClass1(T obj1) {
        this.obj1 = obj1;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
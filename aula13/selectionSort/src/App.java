public class App {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();

        lista.add(new Animal(10, "Totó", "Cão"));
        lista.add(new Animal(4, "Kamara", "Gato"));
        lista.add(new Animal(49, "Leoa", "Leão"));
        lista.add(new Animal(3, "Lamas", "Tigre"));
        lista.add(new Animal(32, "Kita", "Onça"));

        lista.add(new Animal(12, "Arnaldo", "Peixe"));
        lista.add(new Animal(9, "Limado", "Baleia"));
        lista.add(new Animal(23, "Tigresa", "Golfinho"));
        lista.add(new Animal(31, "Jabuta", "Jabuti"));
        lista.add(new Animal(1, "Carato", "Lontra"));

        lista.selectionSort();
        lista.print();        
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro d1 = new Cachorro();
        Gato g1 = new Gato();
        Leao l1 = new Leao();
        d1.emitirSom();
        d1.dormir("Summer");
        g1.emitirSom();
        g1.dormir("Buzz");
        l1.emitirSom();
        l1.dormir("Alex");
        l1.tipoDeAnimal();
        
    }
}

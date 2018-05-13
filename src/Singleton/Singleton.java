package Singleton;

/**
 * A example of basic and necessary components the Singleton Class
 *
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    /**
     * Crear una instancia unica de Singleton
     *
     * @return Singleton
     */
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
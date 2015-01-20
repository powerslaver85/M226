package designPatterSingleton;

//TODO: Study & Comment

/**Singleton
 * Singleton DesignPattern Demo Class
 *
 */

public class Singleton {
    private static Singleton instance = null;
    protected Singleton() {
        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
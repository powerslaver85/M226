package designPatterSingleton;

//TODO: Study & Comment

/**SingletonInstatiator
 * Singleton DesignPattern Demo Instatiator
 */
public class SingletonInstatiator {
    public SingletonInstatiator() {
        Singleton instance = Singleton.getInstance();
        Singleton anotherInstance =
                new Singleton();
    }
}
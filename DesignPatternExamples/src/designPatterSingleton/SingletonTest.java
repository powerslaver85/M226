package designPatterSingleton;

//TODO: Study & Comment

/** SingletonTest
 * Created by Powerslave on 20.01.15.
 */
import org.apache.log4j.Logger;
import org.junit.Assert;
import junit.framework.TestCase;


public class SingletonTest extends TestCase {
    private Singleton sone = null, stwo = null;
    private static Logger logger = Logger.getRootLogger();
    public SingletonTest(String name) {
        super(name);
    }
    public void setUp() {
        logger.info("getting singleton...");
        sone = Singleton.getInstance();
        logger.info("...got singleton: " + sone);
        logger.info("getting singleton...");
        stwo = Singleton.getInstance();
        logger.info("...got singleton: " + stwo);
    }
    public void testUnique() {
        logger.info("checking singletons for equality");
        Assert.assertEquals(true, sone == stwo);
    }
}
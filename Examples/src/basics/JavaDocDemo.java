//Titel: JavaDocDemo.java | Author: Ramon Schenk | Date: 02/09/2014
package basics;

/** Beschreibung der Klasse JavaDocDemo
*
* @author Ramon Schenk
* @author Jane Doe
* @version 6.0z Build 9000 Jan 3, 1970.
*/
public class JavaDocDemo {

		/** Description of myIntField */
		public int myIntField;
		/** Beschreibung DemoClass() 
		 *  Text...
		 */
		public void DemoClass() 
		{
			// Blah Blah Blah...
		}
		
		/** Beschreibung DemoMethode(int a, String b)
		 * 
		 * @param a			Beschreibung a
		 * @param b			Beschreibung b
		 * @return			Beschreibung Returnwert c
		 */
		public Object DemoMethode(int a, int b)
		{
			int c = a + b;
			// Blah Blah Blah...
			return c;
		}
	}
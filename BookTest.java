package excercice11;

	import junit.framework.TestCase;

	public class BookTest extends TestCase {
		
		public void Constructor () {
			new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
			new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
			new Book("Pat Conroy", "Beach Music", 9.50, 1996);
		}
			
}

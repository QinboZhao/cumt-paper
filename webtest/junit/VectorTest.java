import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class VectorTest {
	
	Vector<Object> v0= null;
	VectorTest vt =null;
	@Rule
	   public ExpectedException thrown= ExpectedException.none();
	@Before
	
	public void setUp() throws Exception {
		 vt = new VectorTest();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVectorIntInt() {
		v0 = new Vector<Object>(3,2);
		assertEquals(3, v0.elementData.length);
		assertEquals(2, v0.capacityIncrement);
	}

	@Test
	public void testVectorInt() {
		v0 = new Vector<Object>(5);
		assertEquals(5, v0.elementData.length);
		assertEquals(0, v0.capacityIncrement);
	}

	@Test
	public void testVector() {
		v0 = new Vector<Object>();
		assertEquals(10, v0.elementData.length);
		assertEquals(0, v0.capacityIncrement);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testVectorEx() {
		v0 = new Vector<Object>(-1);
		
	}
	@Test
	public void testVectorEx2() {
		v0 = new Vector<Object>(0,0);
		assertEquals(0, v0.elementData.length);
		assertEquals(0, v0.capacityIncrement);
	}
	@Test
	public void testVectorCollectionOfQextendsE() {
		Collection<Object> c = new ArrayList<Object>();
		c.add(1);
		v0 = new Vector<Object>(c);
		assertEquals((int) Math.min((c.size() * 110L) / 100,
                Integer.MAX_VALUE), v0.elementData.length);
		assertEquals(0, v0.capacityIncrement);
	}
	
	@Test
	public void testEnsureCapacity1() {
		v0 = new Vector<Object>(1,2);
						 
		v0.addElement(1);
		v0.ensureCapacity(4);
		
		assertEquals(4 , v0.elementData.length);				
		assertEquals(2, (vt.getSpecificedFieldObject(v0)));
	}
	@Test
	public void testEnsureCapacity2() {
		v0 = new Vector<Object>(1,2);
		v0.ensureCapacity(3);
		assertEquals(3, v0.elementData.length);
	
	}

	@Test
	public void testEnsureCapacity3() {
		v0 = new Vector<Object>(1,0);
		v0.ensureCapacity(3);
		assertEquals(3 , v0.elementData.length);
	
	}
	@Test

	public void testEnsureCapacity4() {
		v0 = new Vector<Object>(1,0);
		v0.ensureCapacity(2);
		assertEquals(2 , v0.elementData.length);
	
	}
	@Test
	public void testEnsureCapacity5() {
		v0 = new Vector<Object>(5,0);
		v0.ensureCapacity(0);
		assertEquals(5 , v0.elementData.length);
	
	}
	
	
	@Test
	public void testSize() {
		v0 = new Vector<Object>();
		assertEquals(0, v0.size());
	}
	
	@Test
	public void testContains()
	{
		v0 = new Vector<Object>();
		assertFalse(v0.contains(1));		
		v0.addElement(2);
		assertTrue(v0.contains(2));
	}
	
	@Test
	public void testindexOf()
	{
		v0 = new Vector<Object>();
		assertEquals(-1, v0.indexOf(1));	
		v0.addElement(2);
		assertEquals(0, v0.indexOf(2));	
	}
	
	@Test
	public void testindexOf2()
	{
		v0 = new Vector<Object>();
		assertEquals(-1, v0.indexOf(null,0));	
		v0.addElement(2);
		assertEquals(-1, v0.indexOf(null,0));	
		
		v0.addElement(null);
		assertEquals(1, v0.indexOf(null,0));	
		
		assertEquals(0, v0.indexOf(2,0));	
		assertEquals(-1, v0.indexOf(2,1));	
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testsetElementAtEX()
	{
		v0 = new Vector<Object>();		
		v0.setElementAt(2, 0);
		
	}
	
	@Test
	public void testsetElementAt()
	{
		v0 = new Vector<Object>();
		v0.addElement(1);
		v0.setElementAt(2, 0);
		assertEquals(2, v0.elementData[0]);
	}
	

	@Test	
	public void testremoveElementAt() 
	{  
		v0 = new Vector<Object>();
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		thrown.expectMessage(" >= ");  
        v0.removeElementAt(0);
	}
	
	@Test	
	public void testremoveElementAt2() 
	{  
		v0 = new Vector<Object>();
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		thrown.expectMessage("<0");  
        v0.removeElementAt(-1);
	}
	
	@Test	
	public void testremoveElementAt3() 
	{  
		v0 = new Vector<Object>();
		v0.addElement(1);
		v0.removeElementAt(0);
		
		assertEquals(null, v0.elementData[0]);
		assertEquals(2 , (vt.getSpecificedFieldObject(v0)));
		
		
		assertEquals(2 , (vt.getSpecificedFieldObject(v0)));
	}
	
	@Test	
	public void testremoveElementAt4() 
	{  
		v0 = new Vector<Object>(4,0);
	
		v0.addElement(1);
		v0.addElement(2);
		v0.addElement(null);
		v0.addElement(4);
		
		int index=1;
		int j= v0.elementCount-index-1;
		
		  Object[] o = {new Integer(1),null,new Integer(4)};
		v0.removeElementAt(1);
		

		for (int i = 0; i < v0.elementData.length; i++) {
			if(i<v0.elementCount)
			assertEquals(o[ i ], v0.elementData[i]);  	
			else
				assertEquals(null, v0.elementData[i]);
        }
		assertEquals(4, v0.elementData.length);

		//assertEquals(10 , (vt.getSpecificedFieldObject(v0)));
	}
	@Test	
	public void testaddElement()
	{
		v0 = new Vector<Object>(0,0);
		v0.addElement(1);
		assertEquals(1, v0.elementData.length);
		assertEquals(1, v0.elementData[0]);
		assertEquals(1 , (vt.getSpecificedFieldObject(v0)));
	}
	@Test	
	public void testremoveElement()
	{
		v0 = new Vector<Object>();
		assertFalse(v0.removeElement(1));
		
		v0.addElement(1);
		assertTrue(v0.removeElement(1));
		assertEquals(4 , (vt.getSpecificedFieldObject(v0)));
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testgetEX()
	{
		v0 = new Vector<Object>();
		v0.get(0);
	}
	
	@Test()
	public void testget()
	{
		
		
		v0 = new Vector<Object>();
		v0.addElement(1);
		assertEquals(1, v0.get(0));;
	}
	
	 public Object getSpecificedFieldObject(Vector<Object> v) {
		 
		 
	        Class<?> clazz = Vector.class.getSuperclass();
	            Object object = null;
	            try {
	                Field field = clazz.getDeclaredField("modCount");
	                field.setAccessible(true);
	                
	                object = field.get(v);
	            }
	            catch (NoSuchFieldException e) {
	                e.printStackTrace();
	            }
	            catch (SecurityException e) {
	                e.printStackTrace();
	            } 
	            catch (IllegalArgumentException e) {
	                e.printStackTrace();
	            }
	            catch (IllegalAccessException e) {
	                e.printStackTrace();
	            }
	        return object;

	    }
	 
}

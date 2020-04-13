// Time Complexity : 
//Peek - O(1) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {

	Integer current;
	Iterator<Integer> iter;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	  this.iter =iterator;
	  if(iterator.hasNext()) {
		  current = iterator.next();
	  }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       return current;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer result = current;
		
		if(iter.hasNext()) {
			current = iter.next();
		}else {
			current = null;
		}
	    return result;
	}
	
	@Override
	public boolean hasNext() {
		if(current==null)
			return false;
		
		return true;
	    
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,6,7,9,3,5,6,8);
		Iterator<Integer> iterator = list.iterator();
		PeekingIterator peekIterator = new PeekingIterator(iterator);
		System.out.println(peekIterator.next());
		System.out.println(peekIterator.peek());
		System.out.println(peekIterator.hasNext());

		System.out.println(peekIterator.next());
		System.out.println(peekIterator.peek());

		System.out.println(peekIterator.next());
		System.out.println(peekIterator.peek());
		System.out.println(peekIterator.peek());
		System.out.println(peekIterator.peek());
		System.out.println(peekIterator.hasNext());

		System.out.println(peekIterator.next());
		System.out.println(peekIterator.next());
		System.out.println(peekIterator.hasNext());


	}

}

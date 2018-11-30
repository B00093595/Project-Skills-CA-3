// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class ListReferenceBased implements ListInterface {
  // reference to linked list of items
  private Node head; 
  private int numItems; // number of items in list

  public ListReferenceBased() {
    
    head = null;
    numItems = 0; 
  }  // end default constructor

  public boolean isEmpty() {
    if(numItems == 0){
      return true;
    }
    else{
      return false;
    }
  }  // end isEmpty

  public int size() {
    return numItems;
  }  // end size

  private Node find(int index) {
  // --------------------------------------------------
  // Locates a specified node in a linked list.
  // Precondition: index is the number of the desired
  // node. Assumes that 1 <= index <= numItems+1 
  // Postcondition: Returns a reference to the desired 
  // node.
  // --------------------------------------------------
    Node curr = head;
   
    if(index == 0)
    {
    	curr = head;
    }
    else if(index < numItems && index > 0)
    {
    	for(int i = 0; i < index; i++) 
        {
          curr = curr.getNext(); 
        }//end for
    }
	Node prev = null;
	
	   
	if(index == 0)
    {
		prev = curr;
	}
	else if(index > numItems)
	{
		System.out.println("Invalid Index");
	}
	else
	{
		for(int i = 0; i < index; i++)
		{
			prev = curr;
			curr = curr.getNext();
		}
	}
    return prev;
  } // end find

  public Object get(int index) throws ListIndexOutOfBoundsException {
  Object tmp = 0;                
  if(index < 0 || index >= numItems){
      if(index == 0) {

        return tmp = head.getItem();
      }
      else if(index != 0){
        Node previousNode = find(index);
        return tmp = previousNode.getNext().getItem();

        }
      }//close nested if 
      return tmp;
    }
  
    public void add(int index, Object item)
                  throws ArrayIndexOutOfBoundsException{
    	
       if(index < 0 || index > numItems){
         throw(new ArrayIndexOutOfBoundsException("Bad insert (bad index(" + index + "), max(" + numItems + "))!"));
       }             
      if(index == 0){
    		Node newNode = new Node(item);
    		newNode.setNext(head);
    		head = newNode;
    		numItems++;
        }
    	else if(index > 0 && index < numItems)
    	{
    	 
    		Node previousNode = find(index);
    		Node newNode = new Node(item);
    		newNode.setNext(previousNode.getNext());
    		previousNode.setNext(newNode);

  
    	}
    	else 
    	{
    		Node previousNode = find(index);
    		Node newNode = new Node(item);
    		//newNode.setNext(previousNode.getNext());
    		previousNode.setNext(newNode);
    		numItems++;
    	}
    }

  public void remove(int index) 
                   throws ListIndexOutOfBoundsException {

    if(index == 0) {
        head = head.getNext();
        numItems--;
        return;
    }
    else if(index != 0){

        Node previousNode = find(index);
        previousNode.setNext(previousNode.getNext().getNext());
        numItems--;
    }
    else if(index > 0) 
    {
    	
    	Node previousNode = find(index -1);
    	previousNode.setNext(previousNode.getNext());
    	numItems --;
    	
    }
  }   // end remove

  public void removeAll() {
      head = null;
      numItems = 0;
  } // end removeAll
  public void display(){
      //Loops through the array and print out the items 
    Node curr = head;
    while(curr != null)
    {
    	System.out.println(curr.getItem());
    	curr = curr.getNext();
    }
  }
  public void check () {
	  if (isEmpty()==true) {
		  System.out.println("THE List Is Empty");
		  
	  }
	  else {
		 System.out.println("Not Empty");
		  
	  }
  }
}// end ListReferenceBased
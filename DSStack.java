package glassdoorFAQ;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DSStack
{
	protected int array[];
    protected int top, size, len;
    
    // Constructor
    public DSStack(int n)
    {
        size = n;
        len = 0;
        array = new int[size];
        top = -1;
    }
    
    // Check if stack is empty
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    // Check if stack is full
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    
    // Get the size of the Stack
    public int getSize()
    {
        return len ;
    }
    
    // Peek - Returns top of Stack
    public int peek()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        else
        	return array[top];
    }
    
    // Push - Add an element to the Stack
    public void push(int i)
    {
        if( top + 1 >= size )
            throw new IndexOutOfBoundsException("Overflow Exception");
        if( top + 1 < size )
            array[++top] = i;
        len++ ;
    }
    
    // Pop - Remove an element from the Stack
    public int pop()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return array[top--];
    }
    
    // Display - Display all elements of the Stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    
    public static void main(String[] args)
    {
                
        //System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack\n");
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        // Creating object of class DSStack
        DSStack stack = new DSStack(n);
        
        // Stack Operations
        System.out.println("Continue? y or n");
        char ch;
        ch = scan.next().charAt(0);
        
        //do{
        while(ch == 'y' || ch == 'Y')
        {
            
        	System.out.println("Stack Operations\n");
            System.out.println("1. Push\t2. Pop");
            //System.out.println("2. Pop");
            System.out.println("3. Peek\t4. Display");
            //System.out.println("4. Display");
            System.out.println("\nOther Operations\n");
            System.out.println("5. Check empty\t6. Check full\t7. Get Size");
            //System.out.println("6. Check full");
            //System.out.println("7. Get Size");
            System.out.println("\nEnter your choice\n");
            int choice = scan.nextInt();
            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    stack.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stack.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("Peek Element = " + stack.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 4:
            	System.out.println("Stack elements: ");
            	stack.display();
            	break;
            case 5 : 
                System.out.println("Empty status = " + stack.isEmpty());
                break;                
            case 6 :
                System.out.println("Full status = " + stack.isFull());
                break;                 
            case 7 : 
                System.out.println("Size = " + stack.getSize());
                break;                         
            default : 
                System.out.println("Invalid Operation\n ");
                break;
            }
           }
            /* display stack */
            //stack.display();            
            //System.out.println("\nDo you want to continue (Type y or n) \n");
            //ch = scan.next().charAt(0);
           
        //} while (ch == 'Y'|| ch == 'y');                 
    }
}

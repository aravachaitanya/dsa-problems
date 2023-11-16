package com.dsa.stack;

/**
 * @author chaitanyaarava
 *
 */
public class StackImplementation {

	int top = -1;
	int[] arr = new int[1];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StackImplementation si = new StackImplementation();

		si.push(10);
		si.push(11);
		si.push(12);

		System.out.println(si.peek());
		System.out.println(si.pop());
		System.out.println(si.peek());
		System.out.println(si.isEmpty());
		System.out.println(si.pop());
		System.out.println(si.peek());
		System.out.println(si.pop());
		System.out.println(si.isEmpty());
		System.out.println(si.pop());
		System.out.println(si.isEmpty());
		System.out.println(si.pop());
		System.out.println(si.isEmpty());
		

	}

	/**
	 * This method will remove an element from stack.
	 * 
	 * @return
	 */
	protected int pop() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty");
		}
		return top--;

	}

	/**
	 * This method will return the top element from stack.
	 * 
	 * @return
	 */
	protected int peek() {
		return arr[top];

	}
	
	/**
	 * This method will check if stack is empty or not.
	 * 
	 * @return
	 */
	protected boolean isEmpty() {
		return top == -1 ? true : false;
	}

	/**
	 * This method will push element to stack.
	 * 
	 * @param num
	 */
	protected void push(int num) {
		if (top < arr.length - 1) {
			arr[++top] = num;
		} else {
			int[] newArray = new int[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				newArray[i] = arr[i];
			}
			arr = newArray;
			arr[++top] = num;
		}

	}

}

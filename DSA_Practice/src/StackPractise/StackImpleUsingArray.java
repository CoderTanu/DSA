package StackPractise;

import java.util.Scanner;
import java.util.Stack;

public class StackImpleUsingArray {
   
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("ENTER THE SIXE OF STACK:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		stack stack = new stack(n);
		stack.push(1);
		stack.printStack();
		stack.push(2);
		stack.printStack();
		stack.push(3);
		stack.printStack();
		stack.push(5);
		stack.printStack();
		stack.push(4);
		stack.printStack();
		stack.push(6);
		stack.printStack();
		
		System.out.println(stack);
		
		//pop(delete the element)
		
		System.out.println(stack.pop());
		
		//top
		System.out.println(stack.top());
		
		//
		
		System.out.println(stack.size());
		
		System.out.println(stack.empty());
	}	

}
	
	class stack{
//		int size=10000;
//		int arr[] = new int[size];
//		int top = -1;
		
		
		int size;
		int arr[];
		int top;
		
		public stack(int stackSize) {
			size = stackSize;
			arr = new int [stackSize];
			top = -1;
		}
		
		
		
		//push
		void push(int x) throws Exception {
			if(top>=size-1) {
				throw new Exception("stack is full--overflow condition");
			}
			top++;
			arr[top]=x;
		}
		
		//pop
		int pop(){
			int x=arr[top];
			top--;
			return x;
			
		}
		
		//top
		int top() {
			return arr[top];
		}
		
		int size(){
			return top+1;
		}
		
		boolean empty(){
			return(top == -1);
		}
		
		public void printStack() {
			for(int i=0; i<=top-1; i++) {
				System.out.print(arr[i]);
				if(i!=top) {
					System.out.print(",");
				}
				
			}
			System.out.println();
		}
		
	}

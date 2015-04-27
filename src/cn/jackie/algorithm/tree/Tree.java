package cn.jackie.algorithm.tree;

import java.util.Stack;


/**
 * 
 * 
 * @author lzh
 *
 */
public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	
	//使用给定key查找(假设非空树)
	public Node find(int key){
		Node current = root;  //从根开始
		while(current.iData != key) {
			if(key < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;
			if(current == null)
				return null;
		}
		return current;
	}
	
	public void insert(int id,double dd){
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		if(root==null)
			root = newNode;
		else{
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(id<current.iData){
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
		
	}
	
	public boolean delete(int key){
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData !=key){
			parent = current;
			if(key < current.iData){
				isLeftChild = true;
				current = current.leftChild;
			}
			else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		if(current.leftChild==null && current.rightChild==null){
			if(current == root)
				root = null;
			else if(isLeftChild)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}
		
		else if(current.rightChild==null)
			if(current == root)
				root = current.leftChild;
			else if(isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		
		else if(current.leftChild==null)
			if(current == root)
				root = current.rightChild;
			else if(isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		
		else
		{
			Node successor = getSuccessor(current);
			
			if(current == root)
				root = successor;
			else if(isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			successor.leftChild = current.leftChild;
		}
		
	private Node getSuccessor(Node delNode){
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while(current !=null){
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor != delNode.rightChild)
		{
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	
		
	
	/**
	 * 遍历调度：
	 * 1:先序遍历
	 * 2:中序遍历
	 * 3:后续遍历
	 */
	
	public void traverse(int traverseType){
		switch(traverseType){
			case 1:System.out.print("\nPreorder traversal:");
				preOrder(root);
				break;
			case 2:System.out.print("\nInorder traversal: ");
				inOrder(root);
				break;
			case 3:System.out.print("\nPostorder traversal:");
				postOrder(root);
				break;
		}
		System.out.println();
	}
	
	
	//先序遍历
	private void preOrder(Node localRoot){
		if(localRoot != null){
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	//中序遍历
	private void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}
	
	//后续遍历
	private void postOrder(Node localRoot){
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}
	
	private void displayTree(){
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("...................................");
		while(isRowEmpty==false){
			Stack localStack = new Stack();
			isRowEmpty = true;
			
			for(int j=0;j<nBlanks;j++)
				System.out.print(' ');
		}
	}
}

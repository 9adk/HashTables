package javapractice;

public class MyLinkedList<K> {
	public INode head;
	public INode tail;

	/**
	 * Searching the key in linked list
	 * 
	 * @param key
	 * @return
	 */
	public INode<K> search(K key) {
		if (tail != null && tail.getKey().equals(key)) {
			return tail;
		} else {
			INode temp = head;
			while (temp != null && temp.getNext() != null) {
				if (temp.getKey().equals(key)) {
					return temp;
				}
				temp = temp.getNext();
			}
		}
		return null;
	}

	/**
	 * Appending the node to linked list
	 * 
	 * @param newNode
	 */
	public void append(INode<K> newNode) {
		if (head == null) {
			this.head = newNode;
		}
		if (tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * Deleting the node from the linked list
	 * 
	 * @param myMapNode
	 */
	public void deleteNode(INode myMapNode) {
		INode temp3 = head;
		INode prev = null;
		while (!temp3.getKey().equals(myMapNode.getKey())) {
			prev = temp3;
			temp3 = temp3.getNext();
		}
		prev.setNext(temp3.getNext());

	}

	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}

	public String toString() {
		return "MyLinkedListNode{" + head + "}";
	}
}

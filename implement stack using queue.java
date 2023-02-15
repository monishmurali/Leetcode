class MyStack {
	
	private Queue<Integer> queue = new LinkedList<>();

	public void push(int x) {
    // add element to queue then loop it to reverse the queue which makes first element to last and last element and when it is pop it is like stack lifo
		queue.add(x);
		for(int i = 1;i<queue.size();i++) {
			queue.add(queue.remove());
		}
	}

	public int pop() {
    // remove in queue takes the recent inserted element in the queue.
		return queue.remove();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();  
	}
	}

public class MyHashMap {

	private static class Node {

		protected int key;
		protected int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private ArrayList<Node> buckets;

	public MyHashMap() {

		buckets = new ArrayList<Node>();

	}

	private int indexof(int keyHash) {
		return (keyHash & 15);
	}

	public void put(int key, int value) {

		Node temp = new Node(key, value);
		if (buckets.size() == 0) {
			buckets.add(temp);
		} else {
			boolean flag = true;
			for (int i = 0; i < buckets.size() ; i++) {
				if (buckets.get(i).key==(temp.key)) {
					buckets.get(i).value = temp.value;
					flag = false;
				}
			}
			if (flag) {
				buckets.add(temp);
			}
		}
	}

	public int get(int key) {

		for (Node a : buckets)
			if (a.key == key)
				return a.value;
		return -1;
	}

	public void remove(int key) {

		ArrayList<Node> trash=new ArrayList<>();
		for (int i=0;i<buckets.size();i++) {						
				if (buckets.get(i).key == key)
					trash.add(buckets.get(i));			
		}
		
		buckets.removeAll(trash);
	}
}

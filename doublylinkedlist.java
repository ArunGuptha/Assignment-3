package doublylinkedlisst;

public class doublylinkedlist<T> {
	private link<T> head;
	private int size;

	public doublylinkedlist() {
		head = null;
		size = 0;
	}

	public void addfront(T data) {
		if (head == null)
			head = new link<T>(null, data, null);
		else {
			link<T> newlink = new link<T>(null, data, head);
			head.previous = newlink;
			head = newlink;

		}
		size++;
	}

	public void addrear(T data) {
		if (head == null)
			head = new link<T>(null, data, null);
		else {
			link<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			link<T> newlink = new link<T>(current, data, null);
			current.next = newlink;
		}
		size++;

	}

	public void removefront() {
		if (head == null)
			return;
		head = head.next;
		head.previous = null;
		size--;
	}

	public void removerear() {
		if (head == null)
			return;
		if (head.next == null){
			head = null;
		size--;
		return;

	}
	link<T> current = head;
	while(current.next.next!=null){
		current=current.next;
	}
	current.next=null;
	size--;
	}
	
	public void insert(T data,int index){
		if(head==null)
			return;
		if(index<1 || index> size)
			return;
		link<T> current=head;
		int i=1;
		while(i<index){
			current=current.next;
			i++;
		}
		if(current.previous==null){
			link<T> newlink=new link<T>(null,data,current);
			current.previous=newlink;
			head=newlink;
		}else{
			link<T> newlink=new link<T>(current.previous,data,current);
			current.previous.next=newlink;
			current.previous=newlink;
		}size++;
	}
	
	
	public  int size() {
		return size;
	}

	public void print() {
		link<T> current = head;
		while (current != null) {
			System.out.println(current.data());
			current = current.next;
		}
	}

	public boolean isempty() {
		return head == null;
	}

	public static void main(String[] args) {
		

		
		doublylinkedlist<String> dll = new doublylinkedlist<String>();
		System.out.println("adding elements at Front");
		dll.addfront("A10");
		dll.addfront("B5");
		dll.addfront("hai");
		dll.print();
		System.out.println("-----");
		System.out.println("adding elements at end");
		dll.addrear("C40");
		dll.addrear("bye");
		dll.print();
		
		System.out.println("-----");
		System.out.println("removing elements at front");
		dll.removefront();
		dll.print();
		System.out.println("size=" +dll.size());
		System.out.println("-----");
		
		System.out.println("removing elements at end");
		dll.removerear();
		dll.print();
		System.out.println("-----");
		System.out.println("adding elements using index numbers");
		dll.insert("D25", 3);
		dll.print();
	}

}

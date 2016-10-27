package doublylinkedlisst;

public class link<T> {

	private T data;
	public link<T> previous;
	public link<T> next;
	
	public link(T data)

	{ 
		previous = null;
		this.data=data;
		next = null;
	
	}
		
public link (link<T> previous,T data,link<T> next)
{
	this.previous=previous;
	this.data=data;
	this.next=next;
}	
public T data()
{
	return data;
	}

}

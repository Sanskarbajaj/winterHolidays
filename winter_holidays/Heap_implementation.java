package winter_holidays;

import java.util.ArrayList;
import java.util.Scanner;

public class Heap_implementation {

	public ArrayList<Integer> data=new ArrayList<>();
	public void add(int item)
	{
		data.add(item);
		upheapify(this.data.size()-1);
	}
	private void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi))
		{
			swap(ci,pi);
			upheapify(pi);
		}
		
	}
	public void swap(int x,int y)
	{
		int ith=data.get(x);
		int jth=data.get(y);
		data.set(x,jth);
		data.set(y, ith);
	}
	public int size()
	{
		return this.data.size();
	}
	public int remove()
	{ swap(0,data.size()-1);
		int rv=data.remove(data.size()-1);
		downheapify(0);
		return rv;
	}
	public void downheapify(int pi)
	{
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<data.size()&&data.get(lci)<data.get(mini))
		{
			mini=lci;
		}
		if(rci<data.size()&&data.get(rci)<data.get(mini))
		{
			mini=rci;
		}
		if(pi!=mini)
		{
		
			swap(mini,pi);
			downheapify(mini);
	
		}
		
	}
public void show()
{
	System.out.println(data);
}
	public static void main(String[] args) {
		Heap_implementation heap=new Heap_implementation();
//		heap.add(5);
//		heap.add(4);
//		heap.add(3);
//		heap.add(2);
//		heap.add(1);
//		heap.show();
//		System.out.println(heap.remove());
//		System.out.println(heap.remove());
//		System.out.println(heap.remove());
//		System.out.println(heap.remove());
//		System.out.println(heap.remove());
		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//		int c=s.nextInt();
//		int d=s.nextInt();
//		int e=s.nextInt();
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		heap.add(5);
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		s.close();

	}

}

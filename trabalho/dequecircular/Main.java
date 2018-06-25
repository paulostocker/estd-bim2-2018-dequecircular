package trabalho.dequecircular;

public class Main {

	public static void main(String[] args) throws Exception {
		Deque<Integer> dq = new Deque<>();
		
		dq.addLast(1);
		dq.addLast(2);
		dq.addLast(3);
		
		dq.list(x -> System.out.print(x + " "));
		
		dq.removeFirst();
		
		dq.list(x -> System.out.print(x + " "));
		
		dq.addFirst(-1);
		dq.addFirst(-2);
		dq.addFirst(-3);
		
		dq.list(x -> System.out.print(x + " "));
		
		dq.removeLast();
		
		dq.list(x -> System.out.print(x + " "));
		
		dq.clear();
		
		dq.list(x -> System.out.print(x + " "));
		
		dq.addFirst(100);
		
		dq.list(x -> System.out.print(x + " "));
		
//		dq.removeFirst();
//		
//		dq.list(x -> System.out.print(x + " "));
//		
//		dq.removeLast();
//		
//		dq.list(x -> System.out.print(x + " "));
//		
//		dq.removeFirst();
//		
//		dq.list(x -> System.out.print(x + " "));
//		
//		dq.removeLast();
//		
//		dq.list(x -> System.out.print(x + " "));
//		
//		dq.removeLast();
//		
//		dq.list(x -> System.out.print(x + " "));
	}

}

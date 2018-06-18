package trabalho.dequecircular;

import java.util.function.Consumer;

public class Deque<T> {
	private Elemento<T> cabeca;
	private Elemento<T> cauda;
	
	public void addLast(T o) {
		Elemento<T> el = new Elemento<T>(o);
		
		el.setAnterior(cauda);
		el.setProximo(cabeca);
		
		if (this.isEmpty()) {
			cabeca = cauda = el;
		} else {
			cauda.setProximo(el);
			cauda = el;
			cabeca.setAnterior(cauda);
		}
	}
	
	public void addFirst(T o) {
		Elemento<T> el = new Elemento<T>(o);
		
		el.setAnterior(cauda);
		el.setProximo(cabeca);
		
		if (this.isEmpty()) {
			cabeca = cauda = el;
		} else {
			cabeca.setAnterior(el);
			cabeca = el;
			cauda.setProximo(cabeca);
		}
	}
	
	public T removeFirst() {
		if (this.isEmpty()) {
			System.out.println("Deque está vazia!!!");
			return null;
		}
		
		T aux = cabeca.getValor();
		
		if (cabeca == cauda) {
			cabeca = cauda = null;
			
			return aux;
		}
		
		cabeca = cabeca.getProximo();
		cabeca.setAnterior(cauda);
		cauda.setProximo(cabeca);
		
		return aux;
	}
	
	public T removeLast() {
		if (this.isEmpty()) {
			System.out.println("Deque está vazia!!!");
			return null;
		}
		
		T aux = cauda.getValor();
		
		if (cabeca == cauda) {
			cabeca = cauda = null;
			
			return aux;
		}
		
		cauda = cauda.getAnterior();
		cauda.setProximo(cabeca);
		cabeca.setAnterior(cauda);
		
		return aux;
	}
	
	public boolean isEmpty() {
		return cabeca == null;
	}
	
	public void clear() {
		while (!this.isEmpty()) {
			this.removeFirst();
		}
	}
	
	public void list(Consumer<T> c) {
		if (this.isEmpty()) {
			return;
		}
		
		Elemento<T> aux = cabeca;
		
		do {
			c.accept(aux.getValor());
			aux = aux.getProximo();
		} while (aux != null && aux != cabeca);
		
		System.out.println();
	}
}

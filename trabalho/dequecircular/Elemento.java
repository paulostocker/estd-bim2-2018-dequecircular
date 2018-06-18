package trabalho.dequecircular;

public class Elemento<T> {
	private Elemento<T> proximo;
	private Elemento<T> anterior;
	private T valor;
	
	public Elemento(T o) {
		this.valor = o;
	}
	
	public Elemento<T> getProximo() {
		return this.proximo;
	}
	
	public Elemento<T> getAnterior() {
		return this.anterior;
	}
	
	public void setProximo(Elemento<T> e) {
		this.proximo = e;
	}
	
	public void setAnterior(Elemento<T> e) {
		this.anterior = e;
	}
	
	public T getValor() {
		return this.valor;
	}
}

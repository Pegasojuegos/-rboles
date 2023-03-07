
public class Arbol<T> {
	public Comparable elemento;
	public Arbol izquierda;
	public Arbol derecha;
	
	public Arbol(T elemento,Arbol izquierda,Arbol derecha) {
		this.elemento=(Comparable)elemento;
		this.izquierda=izquierda;
		this.derecha=derecha;
	}
	
	public boolean add(T elemento) {
		if(this.elemento.compareTo(elemento)==0) return false;
		if(this.elemento.compareTo(elemento)<0) {//Toca ir hacia la izquierda
			if(izquierda==null) {
				izquierda=new Arbol<T>(elemento,null,null);
				return true;
			}
			return izquierda.add(elemento);
		}else {//Toca ir a la derecha
			if(derecha==null) {
				derecha=new Arbol<T>(elemento,null,null);
			}
			return derecha.add(elemento);
		}
	}
	
	public boolean del()
	
	public String toString() {
		String res="";
		res+=elemento.toString();
		if(izquierda!=null) res=res+","+izquierda.toString();			
		if(derecha!=null) res=derecha.toString()+","+res;
		return res;
	}
	
}

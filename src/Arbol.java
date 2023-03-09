
public class Arbol<T extends Comparable> {
	public T elemento;
	public Arbol<T> izquierda;
	public Arbol<T> derecha;
	
	public Arbol(T elemento,Arbol<T> izquierda,Arbol<T> derecha) {
		this.elemento=elemento;
		this.izquierda=izquierda;
		this.derecha=derecha;
	}
	
	public int depth() {
		int izq=1;
		int der=1;
		if(izquierda!= null)izq+=izquierda.depth();
		if(derecha!=null)der+=derecha.depth();
		if(izq>der)return izq;
		else return der;
	}
	
	public boolean add(T elemento) {
		if(this.elemento.compareTo(elemento)==0) return false;
		if(this.elemento.compareTo(elemento)>0) {//Toca ir hacia la izquierda
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
	
	public boolean del(T elemento) {
		if(this.elemento.equals(elemento)) {
			borrar();
			return true;
		}
		if(this.elemento.compareTo(elemento)>0) {//Izquierda
			if(izquierda!=null) return izquierda.del(elemento);
		}else if(derecha!=null) return derecha.del(elemento); 
		return false;
	}
	
	private void borrar() {
		if(izquierda!=null) {
			if(derecha!=null) {
				izquierda.derFin(this.derecha);
			}
			this.elemento=izquierda.elemento;
			this.izquierda=izquierda.izquierda;
			this.derecha=izquierda.derecha;
			
		}
		else if(derecha!=null) {
			this.elemento=derecha.elemento;
			this.izquierda=derecha.izquierda;
			this.derecha=derecha.derecha;
		}else this.elemento=null;
	}
	
	private void derFin(Arbol der) {
		if(this.derecha!=null)this.derecha.derFin(der);
		else this.derecha=der;
	}
	
	public String toString() {
		String res="";
		res+=elemento.toString();
		if(izquierda!=null) res=izquierda.toString()+","+res;			
		if(derecha!=null) res=res+","+derecha.toString();
		return res;
	}
	
	public String toStringArbol() {
		String res="";
		for(int i=0;i<depth();i++)res+="	";
		if(izquierda!=null) {
			if(derecha!=null) res=res+elemento.toString()+"\n"+izquierda.toStringArbol()+"	"+derecha.toStringArbol();
			else res=res+elemento.toString()+"\n"+izquierda.toStringArbol();
		}else if(derecha!=null) res=res+"	"+elemento.toString()+"\n"+"	"+derecha.toStringArbol();
		else res=res+elemento.toString();
		return res;
	}
	
}

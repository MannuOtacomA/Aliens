package com.krakedev.aliens;

public class Alien {
	
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal;
	
	public Alien(int tamanio,String color) {
		if (tamanio <5) {
			this.tamanio = 5;			
		}else if(tamanio >30) {
			this.tamanio = 30;			
		}else {
			this.tamanio = tamanio;
			//this.color = color;
		}
		//this.tamanio = tamanio;
		this.color = color;
		
		//calcula precios
		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
		
		//inicializa
		this.numeroOjos = 0;
	    this.numeroBrazos = 0;
	    this.numeroPies = 0;
	    this.precioTotal = 0;
	}
	
	public int getTamanio() {
		return tamanio;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getNumeroOjos() {
		return numeroOjos;
	}
	
	public int getNumeroBrazos() {
		return numeroBrazos;
	}
	
	public int getNumeroPies() {
		return numeroPies;
	}
	
	public double getPrecioExtremidad() {
		return precioExtremidad;
	}
	
	public double getPrecioOjo() {
		return precioOjo;
	}
	
	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	
	//meotodos
	public void imprimir(){
		String mensaje = "Tamaño: "+getTamanio()+
				         ", Color: "+getColor()+
				         ", Nro. Ojos: "+getNumeroOjos()+
				         ", Nro. Brazos: "+getNumeroBrazos()+
				         ", Nro. Pies: "+getNumeroPies()+
				         ", Precio Extremidades: "+getPrecioExtremidad()+
				         ", Precio Ojo: "+getPrecioOjo()+
				         ", Precio Cuerpo: "+getPrecioCuerpo()+
				         ", Precio Total: " + getPrecioTotal();
		System.out.println(mensaje);
	}
	
	public boolean agregarBrazos(int cantidad) {
		int totalExtremidades = this.numeroBrazos + this.numeroPies;
		if ((totalExtremidades + cantidad) <= 10) {
			this.numeroBrazos += cantidad;
		    calcularPrecioTotal(); //llama a metodo
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean agregarPiernas(int cantidad) {
		int totalExtremidades = this.numeroBrazos + this.numeroPies;
	    if ((totalExtremidades + cantidad) <= 10) {
	        this.numeroPies += cantidad;
	        calcularPrecioTotal();  //llama a metodo
	        return true;
	    } else {
	        return false;
	    }	
	} 
	
	public boolean agregarOjos(int cantidad) {
		int maximoOjos;
	    
	    if (this.tamanio >= 5 && this.tamanio <= 10) {
	        maximoOjos = 3;
	    } else if (this.tamanio > 10 && this.tamanio <= 20) {
	        maximoOjos = 5;
	    } else if (this.tamanio > 20 && this.tamanio <= 30) {
	        maximoOjos = 7;
	    } else {
	        return false;
	    }
	    
	    if ((this.numeroOjos + cantidad) <= maximoOjos) {
	        this.numeroOjos += cantidad;
	        calcularPrecioTotal();
	        return true;
	    } else {
	        return false;
	    }	
		
	}
	
	public void calcularPrecioTotal() {
		int totalExtremidades = this.numeroBrazos + this.numeroPies;
	    this.precioTotal = this.precioCuerpo + (totalExtremidades * this.precioExtremidad) + (this.numeroOjos * this.precioOjo);
	}		

}

package fiuba.algo3.tp1;

import java.util.ArrayList;

public class Cuponera {
	
	ArrayList<Cupon> cupones;
	
	
	
	public Cuponera(){
		cupones= new ArrayList<Cupon>();
		
	}
	
	

	public void agregarCupon(Cupon unCupon) {

		cupones.add(unCupon);		
	}

	
	
	public double calcularDescuentoDe(double precioDeLosProductos) throws CuponeraVacia {
		
		double precio=0;
		
		if (this.hayCuponesCargadosParaAplicarDescuento()==false){
			
			throw new CuponeraVacia();
			
		}else{
			Cupon unCupon=this.cuponDeMayorValor();
			precio=unCupon.calcularDescuentoDe(precioDeLosProductos);
		
			return precio;
			}
	}

	
	
	public int cantidadDeCupones(){
		
		return(cupones.size());
	}
	
	
	
	public Cupon cuponDeMayorValor(){

		int numeroMayor=0;
		Cupon cuponMayor=new Cupon();
		
		for(Cupon elemento:cupones){
			
			if(numeroMayor<(elemento.getPorcentajeDelCupon())){
				
				numeroMayor=elemento.getPorcentajeDelCupon();
				cuponMayor=elemento;
			}
		}

		return cuponMayor;
	}
	
	
	public boolean hayCuponesCargadosParaAplicarDescuento(){
		
		if(cupones.isEmpty())
			return false;
		else
			return true;
			
	}
	

}

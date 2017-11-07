package fiuba.algo3.tp1;

public class Cupon {
	
	int porcentajeDescuento;
	
	
	public Cupon(){
		porcentajeDescuento=0;
		
	}
	
	// Estoy agregando un comentario para ver como se actualiza el GitHub!!!
	public double calcularDescuentoDe(double precioDeLosProductos){
		
		double descuento=0;
		double totalDescuento=0;
		descuento=(double)porcentajeDescuento/100;
		
		totalDescuento=((precioDeLosProductos-((double)(precioDeLosProductos*descuento)))/precioDeLosProductos);
	
		return totalDescuento;	
		
	}
	
	public int getPorcentajeDelCupon(){
		
		return porcentajeDescuento;
	}
	
	public void setPorcentajeDeDescuento(int unPorcentaje) throws PorcentajeNoPuedeSerNegativo{
		
		if(unPorcentaje>0){
			
		porcentajeDescuento=unPorcentaje;}
		else {
			throw new PorcentajeNoPuedeSerNegativo();
		}
		
		
	}
}
package strategy;

public class XPTO implements CalcularFreteEmpresas{

    @Override
    public double calcularFrete(double peso) {
        double frete;
        
        if(peso<=5){frete = 7;}
            else if(peso<=10){frete=11;}
            else{frete = 21;}

            return frete;
    }
 
}

package strategy;

public class ABC implements CalcularFreteEmpresas{

    @Override
    public double calcularFrete(double peso) {
        double frete;

        if(peso<=5){frete = 11;}
            else if(peso<=15){frete=16;}
            else{frete = 23;}

            return frete;
    }

    
    
}

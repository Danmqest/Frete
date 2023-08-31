package strategy;

public class CBA implements CalcularFreteEmpresas {

    @Override
    public double calcularFrete(double peso) {
        double frete;
       
        if(peso>=5){frete = 17;}
            else if(peso<=10){frete=22;}
            else{frete = 30;}

             return frete;
        }

       
    }


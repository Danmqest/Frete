package modelo;

import strategy.*;

public enum Empresas implements CalcularFreteEmpresas {
    
    XPTO{
        
        @Override
        public double calcularFrete(double peso) {
            double frete;
            if(peso<=5){frete = 7;}
                else if(peso<=10){frete=11;}
                else{frete = 21;}
                return frete;
        }
    },
     ABC{
        @Override
        public double calcularFrete(double peso) {
            double frete;
            if(peso<=5){frete = 11;}
                else if(peso<=15){frete=16;}
                else{frete = 23;}
                return frete;
        }
     },
     CBA{

        @Override
    public double calcularFrete(double peso) {
        double frete;
        if(peso>=5){frete = 17;}
            else if(peso<=10){frete=22;}
            else{frete = 30;}
             return frete;
        }
     };

}

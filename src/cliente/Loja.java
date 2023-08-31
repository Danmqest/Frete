package cliente;
import java.util.Scanner;

import modelo.Empresas;
import modelo.Produto;
import strategy.ABC;

public class Loja {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
            int declaraEmpresa;
        System.out.println("Empresa:");
            declaraEmpresa = input.nextInt();

    Produto p1 = new Produto("geladeira", 7200, 80);
   // double frete = calcularFrete(p1.getPeso(), "XPTO");
   
//     ABC abc = new ABC();
//    double frete = abc.calcularFrete(p1.getPeso());

     //   double frete = Empresas.ABC.calcularFrete(p1.getPeso());
     double frete = Empresas.values()[declaraEmpresa].calcularFrete(p1.getPeso());
        System.out.println(frete);

    }

    // public static double calcularFrete(double peso, String empresa){
    //     double frete = 0;
    //     if(empresa.equals("XPTO")){
    //         if(peso<=5){frete = 7;}
    //         else if(peso<=10){frete=11;}
    //         else{frete = 21;}

    //     }else if(empresa.equals("ABC")){
    //         if(peso<=5){frete = 11;}
    //         else if(peso<=15){frete=16;}
    //         else{frete = 23;}

    //     }else if(empresa.equals("CBA")){
    //         if(peso>=5){frete = 17;}
    //         else if(peso<=10){frete=22;}
    //         else{frete = 30;}
    //     }

    // return frete;
    // }
}

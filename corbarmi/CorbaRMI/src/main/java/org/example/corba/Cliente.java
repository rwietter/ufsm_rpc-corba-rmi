package org.example.corba;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

public class Cliente {
     public static void main(String args[]){
         try {
             long tempoInicial, tempoFinal;
             int contador;
             boolean mensagem = true;

             String[] op = {"1050"};
             ORB orb = ORB.init(op,null);

             Object objRef = orb.resolve_initial_references("NameService");

             NamingContext ncRef = NamingContextHelper.narrow(objRef);

             NameComponent nc = new NameComponent("TestaDesempenho", "");
             NameComponent path[] = {nc};

             IServidorCorbaOperations teste = IServidorCorbaHelper.narrow(ncRef.resolve(path));

             tempoInicial = System.currentTimeMillis();

             for(contador=0; contador< 1000; contador++){
                 teste.envia(mensagem);
             }

             tempoFinal = System.currentTimeMillis();

             System.out.println(tempoInicial-tempoFinal);
         } catch (Exception e){
             e.printStackTrace();
         }
     }
}

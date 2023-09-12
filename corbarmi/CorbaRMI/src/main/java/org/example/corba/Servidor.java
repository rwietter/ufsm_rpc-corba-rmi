package org.example.corba;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Servidor {
    public static void main(String[] args) throws InvalidName, org.omg.CosNaming.NamingContextPackage.InvalidName, CannotProceed, NotFound {
        try {
            ORB orb = ORB.init(args, null);
            RecebeMensagem obj = new RecebeMensagem();

             orb.connect(obj);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("RecebeMensagem");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

             NameComponent[] path = new NameComponent[1];
             path[0] = new NameComponent("RecebeMensagem", "");
//            NameComponent path[] = ncRef.to_name("Hello");
//            ncRef.rebind(path, obj);

          ncRef.rebind(path, obj);
//            orb.run();

            System.out.println("Servidor Criado.....");

            java.lang.Object sync = new java.lang.Object();
            synchronized (sync){
                sync.wait();
            }
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}


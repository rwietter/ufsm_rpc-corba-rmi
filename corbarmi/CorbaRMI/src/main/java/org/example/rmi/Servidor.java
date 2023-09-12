package org.example.rmi;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Servidor {
	public static void main(String[] args) {
		try {
			IServidorRMI remoteObject = new RecebeMensagem();
      LocateRegistry.createRegistry(1099);
			Naming.rebind("IServidorRMI", remoteObject);
      System.out.println("Server is ready");
		} catch (RemoteException | MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}
}

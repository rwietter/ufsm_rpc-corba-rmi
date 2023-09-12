package org.example.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {
	public static void main(String[] args) {
		long tempoInicial;
		long tempoFinal;
		int counter;
		boolean msg = true;

		try {
			IServidorRMI remoteObject = (IServidorRMI) Naming.lookup("rmi://localhost/IServidorRMI");

			tempoInicial = System.currentTimeMillis();

			for (counter = 0; counter < 1000; counter++) {
        remoteObject.envia(msg);
			}

			tempoFinal = System.currentTimeMillis();

			System.out.println("Finish in " + (tempoFinal - tempoInicial) + " seconds");
		} catch (NotBoundException e) {
			throw new RuntimeException(e);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}
}

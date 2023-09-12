package org.example.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RecebeMensagem extends UnicastRemoteObject implements IServidorRMI {
	int i = 0;

  public RecebeMensagem() throws RemoteException {
  }

  @Override
  public void envia(boolean mensagem) throws RemoteException {
		i++;
    System.out.println("[Remote Object]: message received " + i);
		if (i == 100) {
			System.out.println(i);
		}
	}
}

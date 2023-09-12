package org.example.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface IServidorRMI extends Remote {
	void envia(boolean mensagem) throws RemoteException;
}

package com.github.Pawedla;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
    String bookOrder(String selection) throws RemoteException;
}

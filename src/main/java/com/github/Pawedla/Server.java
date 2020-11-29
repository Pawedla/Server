package com.github.Pawedla;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
    String bookOrder(Integer orderNumber, String[] order, String[] offer) throws RemoteException;
}

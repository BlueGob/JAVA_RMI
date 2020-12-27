/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author HP
 */
public interface interface_bancaire extends Remote {
    double lireSolde() throws RemoteException;
    void debiter(double x) throws RemoteException;
    void crediter(double x) throws RemoteException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.net.MalformedURLException;
/**
 *
 * @author HP
 */
public class server extends UnicastRemoteObject implements interface_bancaire {
    public server() throws RemoteException{
     this.solde =0;
    }
    private double solde;
 
    public double lireSolde() throws RemoteException{
        
        return solde;
    }
    public void debiter(double x) throws RemoteException{
        solde = solde + x;
    }
    public void crediter(double x) throws RemoteException{
        if (solde < x) {
            System.out.print("solde insufisent");
        }else{
            solde = solde - x;
        }
    }


   public static void main(String [] args) throws RemoteException,MalformedURLException{
    server sv = new server();
    java.rmi.registry.LocateRegistry.createRegistry(2020);
    Naming.rebind("rmi://127.0.0.1:2020/server",sv);
}

}

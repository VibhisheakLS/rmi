import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
public class Server{
public static void main(String args[]){
try{
            System.setProperty("java.rmi.server.hostname","192.168.56.1");
            LocateRegistry.createRegistry(1900);
            Grader stub=new GradeSystem();
            Naming.rebind("rmi://192.168.56.1:1900/vibhisheak",stub);
 }
 catch(Exception e){System.out.println(e);}
 }
}

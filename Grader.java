import java.rmi.*;
public interface Grader extends Remote {
    public String calculateGrade(int marks[],int n) throws RemoteException;
}

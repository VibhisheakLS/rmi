import java.rmi.*;
public class Client{
    public static void main(String args[]){
        long beforeMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        int marks[] = {79,87,97,100,42};
        int n = 5;
        try{
        Grader stub=(Grader)Naming.lookup("rmi:// 192.168.56.1:1900/vibhisheak "); 
        System.out.println(stub.calculateGrade(marks,n)); 
        }
        catch(Exception e){}
            long endTime = System.nanoTime();
            long afterMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            System.out.println("Memory Usage: "+(afterMem-beforeMem));
            System.out.println("Time Taken: "+(endTime-startTime));
        } 
}
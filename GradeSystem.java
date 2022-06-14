import java.rmi.*;
import java.rmi.server.*;
public class GradeSystem extends UnicastRemoteObject implements Grader {
GradeSystem() throws RemoteException {
 super();
 }
public String calculateGrade(int marks[],int n) {
char grade[] = new char[n];
int gradePoints[] = new int[n];
int total = 0;
 for (int i=0;i<n;i++) {
if (marks[i]==100) 
	gradePoints[i] = 10;
else 
	gradePoints[i] = (marks[i]/10)+1;
 total += gradePoints[i];
 }
 for (int i=0;i<n;i++) {
 if (gradePoints[i]==10) 
	grade[i] = 'S';
 else if (gradePoints[i]<=9&& gradePoints[i]>=6) 
	grade[i] = (char)(74-gradePoints[i]);
 else 
	grade[i] = 'U';
}
String msg = "";
 for (int i=1;i<n+1;i++) {
 msg += "Subject"+i+": "+marks[i-1]+"\t"+gradePoints[i-1]+"\t"+grade[i-1]+"\n";
 }
 msg += "Final GradePoint: "+(float)(total/n);
 return msg;
 }
}

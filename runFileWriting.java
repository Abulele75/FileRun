

 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.swing.*;
 
 /**
  *
  * @author 218276400
  */
 public class RunFileWriting {
     static FileWriter fw;
     static BufferedWriter bw= null;
     public static void openFile(){
        try{
            fw = new FileWriter("employee.txt");
            bw = new BufferedWriter(fw);
 
        }
        catch(IOException ex){
            Logger.getLogger(RunFileWriting.class.getName()).log(Level.SEVERE,null,ex);
            
        }
     }
     public static void processFile(String rec){
        try {
             if (bw != null) {
                 bw.write(rec);
                 bw.newLine();   
             }
         } catch (IOException ex) {
             Logger.getLogger(RunFileWriting.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
         
         
     
     public static void closeFile(){
            try {
             if (bw != null) {
                 bw.close();  // Close the BufferedWriter
             }
         } catch (IOException ex) {
             Logger.getLogger(RunFileWriting.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public static void main(String[] args) {
        String name, surname,department, employeeType;
        
        name = JOptionPane.showInputDialog("Please enter employee name");
        surname = JOptionPane.showInputDialog("please enter employee surname");
        department = JOptionPane.showInputDialog("Please enter employee department");
        employeeType = JOptionPane.showInputDialog("Please enter employee type(Permanent/temporary");
        
        String rec = name + "#" + surname + "#" + department + "#" + employeeType;
        
        openFile();
        processFile(rec);
        closeFile();
        
     }
 }
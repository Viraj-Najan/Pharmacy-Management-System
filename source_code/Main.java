package dbms;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Parser p=new Parser();
        //Scanner in =new Scanner(System.in);
        //String name=in.nextLine();
        System.setProperty("jdk.xml.entityExpansionLimit", "0");
       
        Gui run=new Gui();
        run.createGui();
    }
}

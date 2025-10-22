package pack;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class OrdersFile {
    public static void main (String[] args) throws FileNotFoundException {

        try(PrintWriter out = new PrintWriter("Orders.txt")){
            //out.println(Order);
        }
    }
}


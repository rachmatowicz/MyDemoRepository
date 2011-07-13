import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/13/11
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("What's your name? ");
        System.out.flush();
        String s = buff.readLine() ;
        System.out.printf("Hello, %s", s);
    }
}

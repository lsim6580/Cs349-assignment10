import acme.NetworkService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by luke on 10/30/2016.
 */
public class Part1{
    public static void main(String[] args) throws Exception{
        NetworkService ns = new NetworkService();
        Class reflectionTarget = ns.getClass();
        Field field[] = reflectionTarget.getDeclaredFields();
        field[0].setAccessible(true);
        //String notSecretStringValue = (String)field[0].get(refle);
        field[0].set(ns ,"aws.com");
        ns.connect();

    }
}

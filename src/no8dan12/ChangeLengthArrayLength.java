package no8dan12;

import java.lang.reflect.Array;

public class ChangeLengthArrayLength{
    public static Object [] changeLength1D(Object [] a, int n, int newLength){
        if(n > newLength)
            throw new IllegalArgumentException();
        Object [] newArray = (Object [])Array.newInstance(a.getClass().getComponentType(),newLength);
        System.arraycopy(a,0,newArray,0,n);
        return newArray;
    }
    public static Object [] changeLength1D(Object [] a, int newLength){
        return changeLength1D(a,a.length,newLength);
    }
    public static void main(String [] args){
        ChangeLengthArrayLength x = new ChangeLengthArrayLength();
        Object data [] = {"a","b","c"};
        Object ganti [] = changeLength1D(data, 5);
        System.out.println("Panjang   : "+data.length);
        System.out.println("Panjang   : "+ganti.length);
        System.out.println(x.toString());
    }
}
